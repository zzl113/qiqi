<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function  $(a){
	
	
	return document.getElementById(a);
	
	}
//定义一个全局变量记录显示的图片的序号
var img=1; 
//定义切换图片的一个函数，每次将图片序号加1
function changPic(){
	//得到下张图片
	img ++;
	//如果大于4让它编程1
	if(img>10){img=1;}
	//获得下一个图片的名称
	var picp="image/mm"+img+".jpg";
	//设置成下一个图片的文件名
	$("pic").src=picp;
	
	}  
	//	当页面加载完成 每隔一秒执行一次changPic()方法
	window.onload=function(){
		setInterval("changPic()",1000);
		}
</script>
<meta charset="UTF-8">

    
    <title>主页面</title>

	<link type="text/css" href="css/index.css" rel="stylesheet">
</head>
<body>
<main >
            <!-- <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png" ></li>
                    <li><span>管理首页</span></li>
                </ul>
            </section>             -->
         <!--    <div class="line"></div> -->
          <div style="width:800px;"> 
            <img src="image/mm1.jpg" id="pic" style="width:800px; height:306px">
            </div>
</main>
</body>
</html>