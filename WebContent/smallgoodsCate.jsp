<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="/struts-tags" prefix="s"%>
 <select name="tg.catesecid" id="smallClass">
 
   <option value="-1">请选择</option>  
 <s:iterator value="%{scate}">
 <option value="<s:property value="%{id}"/>"><s:property value="%{catesname}"/></option>
 
 </s:iterator>
  
 
 </select>