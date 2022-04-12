// 呼号
function reCall() {
    window.alert("重呼成功！");

}

//重呼
function call() {
    window.alert("呼号成功！");
}

// 下一页
function next() {
    // 获取table1
    var table = document.getElementById("table1");
    var num = table.rows.length - 1;

    // 获取当前页面
    var page = document.getElementById("pno").innerText;
    page = parseInt(page);

    // 获取每页显示多少条数据
    var index = document.getElementById("sel").selectedIndex;
    var opt = document.getElementById("opt" + index).value;
    opt = parseInt(opt);

    // 总页数
    var pageSum = Math.ceil((num) / opt);

    // 如果下一页小于总页数，则跳转到下一页，否则报出提示
    if (page < pageSum) {
        page = page + 1;
        document.getElementById("pno").innerText = page;
        for (var i = 1; i < ((page - 1) * opt) + 1; i++) {
            table.rows[i].style.display = "none";
        }
        for (var i = ((page - 1) * opt) + 1; i < (page * opt) + 1; i++) {
            table.rows[i].style.display = "table-row";
        }
    } else {
        window.alert("该页为最后一页，无法前往下一页！")
    }
    return false;
}

// 上一页
function last() {
    // 获取table1
    var table = document.getElementById("table1");
    var num = table.rows.length - 1;

    // 获取当前页面
    var page = document.getElementById("pno").innerText;
    page = parseInt(page);

    // 获取每页显示多少条数据
    var index = document.getElementById("sel").selectedIndex;
    var opt = document.getElementById("opt" + index).value;
    opt = parseInt(opt);

    // 如果是首页，则报出提示，否则跳转到上一页
    if (page > 1) {
        document.getElementById("pno").innerText = page - 1;
        for (var i = ((page - 2) * opt) + 1; i < ((page - 1) * opt) + 1; i++) {
            table.rows[i].style.display = "table-row";
        }
        for (var i = ((page - 1) * opt) + 1; i < (page * opt) + 1; i++) {
            table.rows[i].style.display = "none";
        }
    } else {
        window.alert("该页为首页，无法前往上一页！")
    }
}

// 分页
function pagination() {
    // 获取table1
    var table = document.getElementById("table1");
    var num = table.rows.length - 1;

    // 获取每页显示多少条数据
    var index = document.getElementById("sel").selectedIndex;
    var opt = document.getElementById("opt" + index).value;
    opt = parseInt(opt);

    // 跳转到首页
    document.getElementById("pno").innerText = 1;
    for (var i = 1; i < opt + 1; i++) {
        table.rows[i].style.display = "table-row";
    }
    for (var i = opt + 1; i < num + 1; i++) {
        table.rows[i].style.display = "none";
    }
}

function seach() {
    // 获取table1
    var table = document.getElementById("table1");
    // 获取查找关键字
    var seach = document.getElementById("seach").value;
    // 以什么查找
    var index = document.getElementById("s").selectedIndex;

    // 获取table有多少行
    var num = table.rows.length - 1;

    document.getElementById("pno").innerText = 1;

    if (num > 1) {
        for (var i = 1; i < num + 1; i++) {
            var content = table.rows[i].cells[index].innerText;
            if (content.indexOf(seach) !== -1) {
                table.rows[i].style.display = 'table-row';
            } else {
                table.rows[i].style.display = 'none';
            }
        }
    }
}

function gopage() {
    // 获取table1
    var table = document.getElementById("table1");
    var num = table.rows.length - 1;

    // 获取跳转页面
    var page = document.getElementById("gopg").value;
    page = parseInt(page);

    // 获取每页显示多少条数据
    var index = document.getElementById("sel").selectedIndex;
    var opt = document.getElementById("opt" + index).value;
    opt = parseInt(opt);

    // 总页数
    var pageSum = Math.ceil((num) / opt);

    if (page < pageSum) {
        for (var i = ((page - 1) * opt) + 1; i < (page * opt) + 1; i++) {
            table.rows[i].style.display = "table-row";
        }
        for (var i = 1; i < ((page - 1) * opt) + 1; i++) {
            table.rows[i].style.display = "none";
        }
        for (var i = (page * opt) + 1; i < num + 1; i++) {
            table.rows[i].style.display = "none";
        }
        document.getElementById("pno").innerText = page;
    }
    if (page == pageSum) {
        for (var i = ((page - 1) * opt) + 1; i < num + 1; i++) {
            table.rows[i].style.display = "table-row";
        }
        for (var i = 1; i < ((page - 1) * opt) + 1; i++) {
            table.rows[i].style.display = "none";
        }
        document.getElementById("pno").innerText = page;
    }
    if (page > pageSum) {
        window.alert("您输入的页码超出总页码，请重新输入！")
    }
}
