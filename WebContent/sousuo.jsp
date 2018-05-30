<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">
function postForm(v_pageNo){//js传递页号 目的是
	$("input[name='pageNo']").val(v_pageNo);
	$("form").submit();
}


function changge(){
	 
 
    	$("#Usrs").change(function(e){
    		var bigClassId=$("#Usrs").val();
    		$.post("deUse.action",{id:bigClassId},function(data){
    			 
    			$("#smallSpan").html(data);
    			 
    			
    			
    		});
    	});
    	 
 
	
	
	
	
	
	
}



</script>
</head>
<body>

<body>

<form method="post" action="queryGood.action">
  <input type="hidden" name="pageNo" id="pn"/>
 <select name="goodCon.bigCateId">
  <option value="">请选择</option>
 <c:forEach items="${bigCates}" var="bg"> 
  <option value="${bg.id }"  <c:if test="${bg.id==goodCon.bigCateId}">selected="selected"</c:if> >${bg.catename}</option>
 </c:forEach> 
 </select>           
 
  <select name="goodCon.smallCateId">
  <option value="">请选择</option>
 <c:forEach items="${smallCates}" var="sc" >
    <option value="${sc.id }"   <c:if test="${sc.id==goodCon.smallCateId}">selected="selected"</c:if>  >${sc.catesname}</option>
 </c:forEach> 
 </select> 
 
  最低价格<input type="text" name="goodCon.lowPrice" value="${goodCon.lowPrice}">
    最高价格<input type="text" name="goodCon.hightPrice" value="${goodCon.hightPrice}">
    
 <button type="submit">搜索</button> 
</form>
 
<table >
<c:forEach items="${goods}" var="gd" varStatus="sta" >
	  <tr <c:if test="${sta.index%2==0}">style="background-color:#999"</c:if>>
	     <td>${gd.catename}</td>
	     <td>${gd.catesname}</td>
	     <td>${gd.goodsname}</td>
	     <td>${gd.price}</td>
	  </tr> 
	  
</c:forEach>
<tr><td colspan="4">
            <b> 第${pageNo}页/共${totalPage}页</b>
	       <a href="javascript:postForm(1)">首页</a>&nbsp;&nbsp;
	        <a href="javascript:postForm(${pageNo-1})">上页</a>&nbsp;&nbsp;
	         <a href="javascript:postForm(${pageNo+1})">下页</a>&nbsp;&nbsp;
	        <a href="javascript:postForm(${totalPage})">末页</a>
	  </td></tr>
</table>

<input id="Usrs" type="text" name="id" />
<button onclick="changge()">提交</button>

<div id="smallSpan" style="border: 1px red;">
  
</div>



 


</form>




</body>
</html>