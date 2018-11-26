<%--
  Created by IntelliJ IDEA.
  User: Zhangsnke
  Date: 2018/11/26
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/include/taglib.jsp" %>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <title>学生页面</title>
    <%@include file="/WEB-INF/include/head.jsp" %>
    <style type="text/css">
        div{
            font-family: 华文楷体;
        }

        .font4{
            font-size: 40px;
        }
        .font2{
            font-size: 20px;
        }
    </style>
</head>
<body>
    <div class="font4" >学生：<p id="student"></p></div>
    <div id="hidden">
        <div class="font2">姓名：<input id="name" value=""></div><br>
        <button onclick="search()">查询</button>
    </div>

<script type="text/javascript">
    function search(){
        var name = $('#name').val();
        if (name==""){
            alert("姓名不能为空");
        }else {
            $.ajax({
                url:'${ctx}/student/getData',
                type:'post',
                dataType:"json",
                data:{'name':name},
                success:function (result) {
                    if (result.ok){
                        var vo = result.value;
                        $('#student').html(" "+vo.name+"，总分: "+vo.sumScore+"，平均分: "+vo.avgScore+"，年龄: "+vo.age);
                    }else {
                        alert((result.msg));
                    }
                }
            });
        }
    }

</script>
</body>
</html>
