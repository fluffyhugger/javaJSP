<%--
  Created by IntelliJ IDEA.
  User: sirapob
  Date: 19/9/2023 AD
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            margin: 12px;
            border :red solid 1px;
            text-align: center;
        }
    </style>
</head>
<body>
<c:if test="${message == null}">
    <h3> Multiplication Table ${param.number}</h3>
    <table>
        <tr style="border-bottom: 1px solid cadetblue;background-color: bisque">
            <td colspan="5">Multiplication Table of ${param.number}</td>
        </tr>
        <c:forEach begin="1" end="12" var="n">
        <c:choose>
            <c:when test="${n%2 == 0}">
                <c:set var="bg" scope="page" value="lightgray"/>

            </c:when>
            <c:otherwise>
                <c:set var="bg" scope="page" value="gray"/>
            </c:otherwise>
        </c:choose>
            <tr style="background-color: ${bg}">
                <td>${param.number}</td>
                <td>x</td>
                <td>${n}</td>
                <td>=</td>
                <td>${param.number * n}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
    <c:if test="${message != null}">
    <h6>Error:: <hr>
        ${requestScope.message} <span style="color:red">(${param.number})</span>
    </h6>
    </c:if>
<hr>
Your Browser : ${header["User-Agent"]}}
</body>
</html>
