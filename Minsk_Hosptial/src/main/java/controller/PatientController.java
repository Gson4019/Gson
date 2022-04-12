package controller;
import entity.Patient;
import entity.Patient_Ticket;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.PatientService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class PatientController {

    @Autowired
    private PatientService service;

    @RequestMapping("/addPatient.do")
    @ResponseBody
    public ModelAndView addPatient(Patient patient, HttpSession session){
        ModelAndView mv = new ModelAndView();
        if(service.insertPatient(patient)){
            session.setAttribute("patient",patient);
            mv.setViewName("roomchoice");
        }
        else
            mv.setViewName("id_input");
        return mv;
    }

    @RequestMapping(value = "/addRoomName.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String addRoomName(HttpSession session,String room){
        Patient patient = (Patient) session.getAttribute("patient");
        patient.setRoomName(room);
        patient.setQueueNum(service.QueryMaxQueueNum()+1);
        Patient_Ticket ticket = new Patient_Ticket(patient.getRoomName(),patient.getPsex(),patient.getQueueNum(),patient.getPname(),patient.getPno(),patient.getPkind());
        if(service.addRoomName(patient) && service.addQueueNum(patient) && service.insertTicket(ticket)){
            session.setAttribute("ticket",ticket);
            session.setAttribute("patient",patient);
            return "yes";
        }
        return "no";
    }

    @RequestMapping("/queryPatients.do")
    @ResponseBody
    public List<Patient> queryPatients(){
        return service.queryPatients();
    }

    @RequestMapping(value = "/DeletePatientByQueueNum.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String DeletePatientByQueueNum(Integer QueueNumber){
        if(service.DeletePatientByQueueNum(QueueNumber))
            return "yes";
        return "no";
    }

    @RequestMapping(value = "/UpdateStatusToCall.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String UpdateStatusToCall(Integer QueueNumber){
        if(service.UpdateStatusToCall(QueueNumber))
            return "yes";
        return "no";
    }

    @RequestMapping(value = "/UpdateStatusToPass.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String UpdateStatusToPass(Integer QueueNumber){
        if(service.UpdateStatusToPass(QueueNumber))
            return "yes";
        return "no";
    }

    @RequestMapping(value = "/add_Picture_Description.do")
    @ResponseBody
    public ModelAndView add_Picture_Description(HttpServletRequest request, HttpSession session, MultipartFile upload_image, String description) throws IOException {
        ModelAndView mv = new ModelAndView();
        //使用UUID给图片重命名，并去掉四个“-”
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        //获取文件扩展名
        String ext = FilenameUtils.getExtension(upload_image.getOriginalFilename());
        //设置图片上传路径
        String url = request.getSession().getServletContext().getRealPath("/images/upload");

        //以绝对路径保存重命名后的图片
        upload_image.transferTo(new File(url + "/" + name + "." + ext));
        //把图片储存路径保存到数据库
        String picture = "images/upload/" + name + "." + ext;
        Patient patient = (Patient) session.getAttribute("patient");
        if(service.add_Picture_Description(patient.getPno(),picture,description)){
            patient.setPicture(picture);
            patient.setDescription(description);
            session.setAttribute("patient",patient);
            mv.addObject("result","upload successfully!");
        }
        else{
            mv.addObject("result","Something wrong in your information,please check");
        }
        mv.setViewName("upload_result");
        return mv;
    }

    @RequestMapping(value = "/get_Picture_DescriptionByQueueNum.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String get_Picture_DescriptionByQueueNum(int queuenum) throws IOException {
        String picturePath = service.get_PictureByQueueNum(queuenum);
        String description = service.get_DescriptionByQueueNum(queuenum);

        if(picturePath == null)
            picturePath = "empty";
        if(description == null)
            description = "empty";

        return picturePath + "," + description;
    }

    @RequestMapping(value = "/add_diagnosisAndMedicine.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String add_diagnosis_text(HttpSession session2,int queuenum,String diagnosis_text,String medicine_text){
        Patient patient = service.queryPatientByQueueNum(queuenum);
        if(service.add_diagnosis_text_medicine_text(queuenum,diagnosis_text,medicine_text)){
            patient.setDiagnosis_text(diagnosis_text);
            patient.setMedicine_text(medicine_text);
            session2.setAttribute("patient",patient);
            return "yes";
        }
        return "no";
    }


}
