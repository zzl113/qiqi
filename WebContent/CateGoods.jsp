<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <select name="gd.catesecid" id="smallClass">
 
   <option value="-1">请选择</option>  
 <c:forEach items="${scate}" var="m">
 <option value="${m.id }">${m.catesname }</option>
 
 
 </c:forEach>
 
 </select>