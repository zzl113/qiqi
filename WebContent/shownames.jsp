<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:forEach items="${use}" var="user">
 <div onclick="clik(this)" onmouseenter="enterit(this)" onmouseleave="outit(this)">${user.realname}</div>
 
 
 </c:forEach>