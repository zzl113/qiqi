<%@page import="java.util.List,com.lechenggu.entitys.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>易购——goods_detail_add</title>
    <meta charset="utf-8">
    <link type="text/css" href="css/goods_detail_add.css" rel="stylesheet">
        <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <!-- <script type="text/javascript">
    	$(function(){
    		var b=false;
    		$("[name='smallClass']").blur(function(){
    		var mark=false;
    			var options=$(this).find("option");
    			$.each(options,function(index,dom){
    				if($(dom).prop("selected")&&$(dom).val()!=-1){
    					mark=true;
    				}
    			});
    			if(mark){
    				$("#resultSmallClass").html("√");
    				b=true;
    			}else{
    				    $("#resultSmallClass").html("请选择分类");
	    				$("#resultSmallClass").css("fontSize","10px");
	    				b=false;
    			}
    		});
    		var b1=false;
    		$("[name='name']").blur(function(){
    			var newName=$(this).val();
    			if(newName!=""){
    				var rex=new RegExp("[a-z0-9_\u4e00-\u9fa5]{1,}","gi");
    				if(rex.test(newName)){
    					$("#resultName").html("√");
    					b1=true;
    				}else{
	    				$("#resultName").html("请正确输入商品名称");
	    				$("#resultName").css("fontSize","10px");
	    				b1=false;	
    				}
    			}else{
    				$("#resultName").html("商品名称不能为空");
    				$("#resultName").css("fontSize","10px");
    				b1=false;
    			}
    		});
    		var b2=false;
    		$(function(){
    			$("[name='price']").blur(function(){
    				var price=$(this).val();
    				if(price!=""){
	    				 var rex=new RegExp("[0-9]{1,8}\.[0-9]{1,2}");
	    				if(rex.test(price)){
	    					$("#resultPrice").html("√");
	    					b2=true;
	    				}else{
	    				   	$("#resultPrice").html("价格必须带小数点");
	    				   	$("#resultPrice").css("fontSize","10px");
	    					b2=false;
	    				}
    				}else{
    						$("#resultPrice").html("价格不能为空");
    						$("#resultPrice").css("fontSize","10px");
	    					b2=false;
    				}

    			});
    		});
    		var b3=false;
    		$("[name='surplus']").blur(function(){
    			var surplus=$(this).val();
    			if(surplus!=""){
	    			if(!isNaN(surplus)){
	    				if(parseInt(surplus)>0){
		    				$("#resultSurplus").html("√");
		    				b3=true;
		    			}else{
		    			    $("#resultSurplus").html("数量必须大于0");
		    			    $("#resultSurplus").css("fontSize","10px");
		    				b3=false;
		    			}
	    			}else{	    					
		    			    $("#resultSurplus").html("数量必须为数字");
		    			    $("#resultSurplus").css("fontSize","10px");
		    				b3=false;
	    			}

    			}else{
    				    $("#resultSurplus").html("数量不能为空");
    				    $("#resultSurplus").css("fontSize","10px");
	    				b3=false;
    			}

    		});
    		$("#submit").click(function(){
    			//获取上传文件的名字
    			var img=$("#file").val();
    			if(""==img){
    				$("#resultFile").html("图片不能为空");
				    $("#resultFile").css("fontSize","10px");
				    return false;
    			}else{
    				 var point = img.lastIndexOf(".");  
        			 var type = img.substr(point+1);  
        			 //判断上传文件后缀
        			if(type=="png"||type=="jpg"||type=="gif"){
        				if(b&&b1&&b2&&b3){
            				return true;
            			}else{
            				return false;
            			}
        			}else{
        				$("#resultFile").html("图片后缀只能为png,jpg,gif");
    				    $("#resultFile").css("fontSize","10px");
    				    return false;
        			}
    				
    				
    			}
    				
    				
    		});
    	});
    	//调用小分类下拉列表
    	function smallClassF(value){
    		var smallClass= $("#smallClass");
    		//每次拼装前清空下拉列表
			smallClass.empty();
			smallClass.append("<option value=-1>请选择</option>");
    		if(value!=-1){
    			//通过id查询小分类对应信息
    			 $.post("/yigoumanage/ajaxGoods",
						  {id:value},
						  function(data){
							  if(data!=""){
								  $(data).each(function(){
									  //循环取出小分类数据     获取id   和小分类名字
									  smallClass.append("<option value='"+this.id+"'>"+this.smallClass+"</option>");
								  }); 
							  }
						  },
						  "json");
    		}
    	} -->
    </script>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript">
    //事件就绪
    $(document).ready(function(e){
    	//时间发生变化
    	$("#bigClass").change(function(e){
    		//获得大分类ID
    		var bigClassId=$("#bigClass").val();
    		//post方式提交数据
    		$.post("addtgods.action",{bigId:bigClassId},function(data){
    			//输出查询到的数据
    			$("#smallSpan").html(data);
    			
    			
    		});
    	});
    	 
    });
    
    
     
    
    
    
    
    </script>
</head>
<body>
  
                  
                  
<main>
   
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>添加商品详细信息</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
            <form action="tgs.action" method="post" enctype="multipart/form-data"> 
                <table>
                <tr>
                	 	<td class="text"></td>
                        <td></td>
                    	<td></td>
                    </tr>
                  
                  
                    <tr>
                        <td class="text">商品名称：</td>
                        <td><input type="text" class="GG" name="tg.goodsname"></td>
                    	<td id="resultName"></td>
                    </tr>
                    
                    <tr>
                        <td class="text">所属分类：</td>
                        <td >大分类<select name="bigClass" id="bigClass" >
                       		 <option value=-1>请选择</option>
                        	 <c:forEach items="${cate}" var="tg">
 
                  <option value="${tg.id}">${tg.catename}</option>
 
                           </c:forEach>
                        </select>小分类
                        <span id="smallSpan">
                         <select name="tg.catesecid" id="smallClass">
                           <option value=-1>请选择</option>  
                       		 <%-- <option value=-1>${tg.catesname }</option>   --%>
                        </select>  
                        </span>
                        </td>
                        <td id="resultSmallClass"></td>
                    </tr>
                    <tr>
                        <td class="text">价格：</td>
                        <td><input type="text" class="GG" name="tg.price"></td>
                    	<td id="resultPrice"></td>
                    </tr>
                    <tr>
                        <td class="text">剩余数量：</td>
                        <td><input type="text" class="GG" name="tg.sucount"></td>
                   		<td id="resultSurplus"></td>
                    </tr>
                    <tr>
                        <td class="text">图片：</td>
                        <td><input type="file" id="file" name="tpois"><span id="resultFile"></span></td>
                    </tr>
                    <tr>
                        <td class="text">商品描述：</td>
                        <td><textarea rows="3" cols="30" name="tg.gdescribe"></textarea></td>
                    </tr>
                    <tr><td></td><td colspan="2" class="right_bottom"><input type="image" id="submit" src="images/submit.gif"></td></tr>
                </table>
               </form> 
            </section>
        </section>

</main>
</body>
</html>