<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>公告管理</title>
    <meta charset="utf-8">
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            /*border: 1px solid red;*/
        }
        iframe{
            border: none;
        }
        .header{
            width: 1024px;
            height: 150px;
            margin-left: 170px;
        }
        .main{
            width: 1024px;
            height: 380px;
            margin-left: 170px;
        }
        .main_left{
            width: 181px;
            height: 342px;
            margin-left: 26px;
            float: left;
        }
        .main_right{
            width: 796px;
            height: 342px;
            float: left;
            margin-top: 10px;
            margin-left: 10px;
        }
        .main_right dl{
            height: 24px;
            border-bottom: 2px solid #fc883b;
        }
        .main_right dl dt{
            background-image: url("../images/bg.png");
            background-position: -236px -107px;
            width: 13px;
            height: 14px;
            float: left;
            margin-right: 6px;
        }
        .main_right dl dd{
            line-height: 14px;
            font-weight: bold;
            font-size: 15px;
        }
        .main_right table{
         
            border-top: 0px solid #dfc9b2;
            border-bottom: 0px solid #dfc9b2;
            border-collapse: collapse;
            margin-top: 0px;
            margin-left: 20px;
            text-align: center;
        }
        .tr1{
            height: 25px;
            font-size: 14px;
            color: #8a7152;
            font-weight: bold;
            background-color: #f7f4eb;
        }
        .tr2{
            width:750px;
            height: 32px;
            font-size: 15px;
        }
        .td1{
            width: 110px;
            border-right: 0;
        }
        .td2{
            width: 280px;
             text-align: center;
        }
        .td3{
         text-align: center;
            width: 100px;
        }
        .td4{
       
             width: 540px;
            text-align: center;
            border-left: 1px solid #e1e1e1;
            border-right: 1px solid #e1e1e1;
            border-top: 1px solid #dfc9b2;
            color:blue;
            
        }
         .td8{
       
             width: 540px;
            text-align: center;
            border-left: 1px solid #e1e1e1;
            border-right: 1px solid #e1e1e1;
            border-top: 1px solid #dfc9b2;
            color:red;
            
        }
        .td5{
         width: 130px;
            border-top: 1px solid #dfc9b2;
        }
        .td6{
        width: 110px;
            border-top: 1px solid #dfc9b2;
            border-right: 0;
        }
        .main_right table tr td a{
        
            text-decoration: none;
        }
        .main_right ul{
            float: right;
            margin-right: 22px;
            margin-top: 18px;
            font-size: 15px;
        }
        .main_right ul li{
            list-style-type: none;
            text-align: center;
            float: left;
            width: 14px;
            height: 20px;
            border: 1px solid #eeeeee;
            margin-right: 5px;
        }
        .main_right ul li a{
            text-decoration: none;
        }
        .footer{
            width: 1024px;
            height: 31px;
            margin-left: 170px;
        }
        #main{
        right:0px;
            width:755px;
           height:240px;
            font-size: 14px;
            color:red;
            font-weight: bold;
            background-color: #f7f4eb;
        }
    </style>
    <script src="js/jquery-1.11.0.js"></script>
<script>
var speed=2;
function gun(){
	var vgk=$("#gonggao");
	var vgk1=$("#gonggao2");
    var div2Top=parseInt(vgk1.css("top"))-speed;
if(div2Top<=0){
	vgk.css("top","0px");
	vgk1.css("top",vgk.height()+"px");
	
	}else{
	vgk.css("top",(parseInt(vgk.css("top"))-speed)+"px");
	vgk1.css("top",(parseInt(vgk1.css("top"))-speed)+"px");
	}
	} 
	var timer=null;
$(document).ready(function(e) {
	$("#main").mouseenter(function(){
		window.clearInterval(timer)
		
		timer=null;
		});
		$("#main").mouseleave(function(e) {
            window.clearInterval(timer)
			timer=window.setInterval("gun()",50);
        });
	var vgk=$("#gonggao");
	var vgk1=$("#gonggao2");
	vgk1.html(vgk.html());
		vgk1.css("top",vgk.height()+"px");
	 
   timer=window.setInterval("gun()",50);
});

</script>
</head>
<body>


   
    <section class="main_right">
        <dl>
            <dt></dt>
            <dd>公告管理</dd>
        </dl>
        
        <table>
            <tr class="tr1">
                <td class="td1">编号</td>
                <td class="td2">公告标题</td>
                <td class="td2">公告内容</td>
                <td class="td3">操作</td>
            </tr>
            </table>
            <div id="main" style="top:67px;position:fixed;overflow:hidden;background-image:url(image/6.jpg); font-size:20px ;">
      <div id="gonggao" style="position:absolute;top=0px;">
          <table>
            <c:forEach items="${tann}" var="ann">
            
            <tr class="tr2">
                <td class="td5">${ann.id}</td>
                <td class="td4">${ann.anntitle }</td>
                <td class="td8">${ann.anncontext}</td>
                <td class="td6"><a href="ChaxAnnMent?id=${ann.id}">修改</a>&nbsp;<a href="Deleteannouncement?id=${ann.id}">删除</a></td>
            </tr> 
           </c:forEach>
        </table>
        </div>
        <div id="gonggao2" style="position:absolute;"></div>
 
</div>
        <%-- <ul>
        <li style="width: 233px;">
            [${dang} / ${gong }]
               <a href="announcementFenYe?page=${dang}">首页</a>&nbsp;
                <a href="announcementFenYe?page=${dang-1}">上一页</a>&nbsp;
                <a href="announcementFenYe?page=${dang+1}">下一页</a>&nbsp;
                <a href="announcementFenYe?page=${gong}">尾页</a></li>
        </ul> --%>
    </section>


</body>
</html>