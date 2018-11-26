<%--
  Created by IntelliJ IDEA.
  User: Zhangsnke
  Date: 2018/11/2
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page1</title>
</head>
<body>
    <h1>${content}</h1>
    ${pageContext.request.contextPath}
    <img alt="读取默认配置中的图片" src="${pageContext.request.contextPath}/myres/timg11.jpg">
    <%--<img alt="读取自定义配置myres中的图片" src="${pageContext.request.contextPath}/myresPic/timg.jpg">--%>
</body>
</html>
