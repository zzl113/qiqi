<%@page import="java.util.List,com.lechenggu.entitys.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript">
    $(document).ready(function(e){
    	$("#bigClass").change(function(e){
    		var bigClassId=$("#bigClass").val();
    		$.post("updGoodst.action",{bigId:bigClassId},function(data){
    			
    			$("#smallSpan").html(data);
    			
    			
    		});
    	});
    	 
    });
    
    
     
    
    
    
    
    </script>
</head>
<body>
	<main> <section class="right"> <section
		class="right_top">
	<ul>
		<li><img src="images/houtai1.png"></li>
		<li><span>修改商品详细信息</span></li>
	</ul>
	</section>
	<div class="line"></div>
	<section class="right_middle">
	<form action="upGoodstt.action" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td class="text"></td>
				<td></td>
				<td></td>
			</tr>


			<tr>
				<td class="text">商品名称：</td>
				<input type="hidden" value="${gd.id }" name="gd.id">
				<td><input type="text" class="GG" value="${gd.goodsname}"
					name="gd.goodsname"></td>
				<td id="resultName"></td>
			</tr>

			<tr>
				<td class="text">所属分类：</td>
				<td>大分类<select name="bigClass" id="bigClass">
						<option value=-1>请选择</option>
						<c:forEach items="${tg}" var="th">

							<option value="${th.id}"
								<c:if test="${th.id==cigId}">
                           selected="true";
                       </c:if>>${th.catename}</option>

						</c:forEach>
				</select>小分类 <span id="smallSpan"> <select name="gd.catesecid"
						id="smallClass">
							<option value=-1>请选择</option>
							<c:forEach items="${cats}" var="tb">
								<option value="${tb.id}"
									<c:if test="${tb.id==gd.catesecid}">
                  selected="true";
                  </c:if>>${tb.catesname}</option>

							</c:forEach>
					</select>
				</span>
				</td>
				<td id="resultSmallClass"></td>
			</tr>
			<tr>
				<td class="text">价格：</td>
				<td><input type="text" value="${gd.price}" class="GG"
					name="gd.price"></td>
				<td id="resultPrice"></td>
			</tr>
			<tr>
				<td class="text">剩余数量：</td>
				<td><input type="text" value="${gd.sucount}"
					name="gd.sucount"></td>
				<td id="resultSurplus"></td>
			</tr>
			<tr>
				<td class="text">图片：</td>
				<td><input type="file" id="file" name="tpois" src="${gd.spic}"><span
					id="resultFile"></span></td>
				<%--  <td><textarea rows="3" cols="30" name="description" value="${td.gdescribe}"></textarea></td> --%>
			</tr>
			<tr>
				<td class="text">商品描述：</td>
				<td><textarea rows="3" cols="30" name="td.gdescribe" value="">${td.gdescribe}</textarea></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2" class="right_bottom"><input type="image"
					id="submit" src="images/submit.gif"></td>
			</tr>
		</table>
	</form>
	</section> </section> </main>
</body>
</html>