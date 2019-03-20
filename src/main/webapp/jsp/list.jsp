<%--
  Created by IntelliJ IDEA.
  User: Lucas
  Date: 2019/3/19
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
</head>
<body>
    <div>
        <table>
            <tr>
                <td>ID</td>
                <td>姓名</td>
                <td>Chinese</td>
                <td>Math</td>
            </tr>
            <c:forEach items="${allStudents}" var="stu">
                <tr>
                    <td>${stu.stuid}</td>
                    <td>${stu.name}</td>
                    <td>${stu.chinese}</td>
                    <td>${stu.math}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
