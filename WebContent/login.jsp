<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>易购——login</title>
<link type="text/css" href="css/login.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<meta charset='utf-8'>

<!-- <script type="text/javascript">
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
	if(img>4){img=1;}
	//获得下一个图片的名称
	var picp="image/mj"+img+".jpg";
	//设置成下一个图片的文件名
	$("pic").src=picp;
	
	}  
	//	当页面加载完成 每隔一秒执行一次changPic()方法
	window.onload=function(){
		setInterval("changPic()",1000);
		}
</script> -->
<script type="text/javascript">
	function checkUserName() {
		var a = document.getElementsByName("loginname")[0].value;
		var reg = /^[a-zA-Z][a-zA-Z0-9_]*$/; //非数字开头,只能包含数字和字母
		var result = reg.test(a);
		if (!result && a == "") {

			document.getElementById("oc").innerHTML = "不能为空";

		} else {

			alert('用户名只能包含数字和字母，并且不能以数字开头!');
			document.getElementById("oc").innerHTML = "可以使用";
		}

	}
	function checkUserPd() {
		var b = document.getElementsByName("password")[0].value;
		if (b == "") {

			document.getElementById("ok").innerHTML = "不能为空";

		} else {
			document.getElementById("ok").innerHTML = "可以使用";
		}

	}

	function checkForm() {

		var unamevalue = document.getElementsByName("loginname")[0].value;
		var upwdvalue = document.getElementsByName("password")[0].value;

		/* if(unamevalue&&upwdvalue){
			return true;
		}
		alert("账户密码不能为空");
		return false; */
		if (!unamevalue) {
			alert("账户不能为空");

			return false;
		}
		if (!upwdvalue) {
			alert(" 密码不能为空");
			return false;
		}
		if (unamevalue.length < 6) {

			alert("帐号不能小于六位");
			return false;

		}
		if (upwdvalue.length < 6) {
			alert("密码不能小于六位");
			return false;

		}
		return true;

	}
	document.getElementById("kaptchaImge").onclick = function() {
		document.getElementById("kaptchaImge").src = "kaptcha.jpg?t="
				+ Math.floor(Math.random() * 1000);
	};

	function checkImage() {
		var invalue = document.getElementById("idenfitying").value;
		if (invalue != "") {
			document.getElementById("resuImg").innerHTML = "√"
					.fontcolor("green");
			return true;
		} else {
			document.getElementById("resuImg").innerHTML = "验证码不能为空"
					.fontcolor("red");
			return false;
		}
	}
</script>
<script type="text/javascript">
	function getNow() {
		var date = new Date();
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		var hour = date.getHours();
		var minute = date.getMinutes();
		var second = date.getSeconds();
		var result = year + "年" + month + "月" + day + "日" + hour + "点" + minute
				+ "分" + second + "秒";
		document.getElementById("timeSpan").innerHTML = result;
	}
	window.onload = function() {
		window.setInterval("getNow()", 0);
	}
</script>
<script src="js/jquery-1.11.0.js"></script>
<script>
	//速度
	var speed = 3;
	var directY = 1;//方向变量
	var directX = 1;
	function dong() {

		var vgg = $("#guanggao");

		//将页面像素转化为数字
		var vtop = parseInt(vgg.css("top"));
		var vleft = parseInt(vgg.css("left"));
		//纵坐标速度
		vtop += directY * speed;

		//横坐标速
		vleft += directX * speed;

		if (vtop >= $(document).height() - vgg.height()) {
			directY = -1;
		}
		if (vtop <= 0) {
			directY = 1;
		}

		//上下移动的像素，
		vgg.css("top", vtop + "px");

		if (vleft > $(document).width() - vgg.width()) {
			directX = -1;
		}
		if (vleft <= 0) {
			directX = 1;
		}

		//左右移动的像素
		vgg.css("left", vleft + "px");

	}
	$(document).ready(function(e) {
		setInterval("dong()", 40);
	});

	function changeIt() {

		document.getElementById("dvfd").action = "changlan.action";
		document.getElementById("dvfd").submit();
	}
</script>

</head>
<body>
	<header>
	<div class="pic">
		<div>
			<ul>
				<li class="index"><a href="">首页</a></li>
				<li class="yonghu"><a href="">用户</a></li>
				<li class="shopping"><a href="">商品分类</a></li>
				<li class="dingdan"><a href="">订单</a></li>
				<li class="shopX"><a href="">商品详细</a></li>
				<li class="gonggao"><a href="">公告</a></li>
			</ul>
		</div>
	</div>
	<div class="TiShi">
		管理员您好，今天是<span id="timeSpan"> <%-- <jsp:include page="Date.jsp" /> --%>
		</span>，欢迎来到贝壳•易购商城后台管理系统。
	</div>
	<div class="address">
		您现在的位置：<a href="#" target="_parent"> 贝壳易购•商城</a> &gt;后台管理
	</div>
	</header>
	<center>
		<div>
			<article> <section class="top">
			<ul>
				<li></li>
				<li><span>&nbsp;&nbsp;管理首页</span></li>
			</ul>
			</section>
			<div class="line"></div>
			<section class="bottom"> <section class="top">欢迎登录易购•商城系统</section>

			<form action="dengLu.action" method="post" name="login" id="dvfd"
				onsubmit="return checkForm()">
				<section class="middle">
				<table>

					<tr>
						<td><s:text name="loginnames"></s:text>:</td>
						<td><input type="text" class="loginname"
							name="user.loginname" value="" onfocus=""
							onblur="checkUserName()" id="oc" style="color: red"></span></td>
						<td id="resuName"></td>
					</tr>
					<tr>
						<td><s:text name="passwords"></s:text>:</td>
						<td><input type="password" class="password"
							name="user.password" value="" onfocus="" onblur="checkUserPd()"><span
							id="ok" style="color: blue"></span></td>
						<td id="resuPwd"></td>
					</tr>
					<!--   <tr>
                        <td>验证码：</td>
                       <td><input type="text" id="idenfitying" name="idenfitying"></td>
                       <td><img id="kaptchaImge" src="kaptcha.jpg"><span id="resuImg"></span></td>
                        <td>
                        	<img id="kaptchaImge" src="PictureCheckCode" onclick="myReload()" />
                        	<span id="resuImg"></span>
                        </td>
                    </tr> -->
					<tr>
						<td><s:text name="language"></s:text>:</td>
						<td><select name="lan" onchange="changeIt()">:
								<option value="1"<s:if test="%{lan==1}">selected="selected"</s:if>>中文</option>
								<option value="2" <s:if test="%{lan==2}">selected="true"</s:if>>英文</option>
								<option value="3" <s:if test="%{lan==3}">selected="true"</s:if>>繁体中文</option>
						</select>
						<td>
					</tr>

					<tr>
						<td></td>
						<td><input type="image" src="images/login.gif"
							onclick="return checkAll()"></td>
						<td><a href="reset_pwd.jsp">忘记密码？</a> <a
							href="order_modify.html">修改密码</a></td>
					</tr>
				</table>

				</section>
			</form>
			</section> </article>
		</div>
	</center>
	<footer>
	<div>
		<div class="footer_top">
			<ul>
				<li>友情链接：</li>
				<li><a href="">百度</a>|</li>
				<li><a href="">Google</a>|</li>
				<li><a href="">雅虎</a>|</li>
				<li><a href="">淘宝</a>|</li>
				<li><a href="">拍拍</a>|</li>
				<li><a href="">易趣</a>|</li>
				<li><a href="">当当</a>|</li>
				<li><a href="">京东商城</a>|</li>
				<li><a href="">迅雷</a>|</li>
				<li><a href="">新浪</a>|</li>
				<li><a href="">网易</a>|</li>
				<li><a href="">搜&nbsp;狐</a>|</li>
				<li><a href="">猫扑</a>|</li>
				<li><a href="">开心网</a>|</li>
				<li><a href="">新华网</a>|</li>
				<li><a href="">凤凰网</a></li>
			</ul>
		</div>
		<div class="middle">
			<div class="line2"></div>
			<ul>
				<li>CORYRIGHT•2014-2015北京市贝壳•易购商城有限公司（北京分部） ALL RIGHT RESERVED</li>
				<li>华宇互联（北京分部）研发部</li>
				<li>热线：400-88-1388 Email:service@ibochy.com.cn</li>
				<li>ICP:京ICP备02121211</li>
			</ul>
		</div>

		<div class="footer_bottom">
			<img src="images/img1.gif"> <img src="images/img2.gif"> <img
				src="images/img3.gif"> <img src="images/img4.gif"><br>
			<!-- <img src="image/mj1.jpg" id="pic" style="width: 500px; height: 180px"/> -->
		</div>
	</div>
	</footer>
	<div id="guanggao"
		style="width: 300px; height: 300px; position: absolute; left: 120px; top: 0px">
		<a href="http://www.lechenggu.com/"><img src="image/home.png"
			style="width: 280px; height: 250px; margin-left: auto; margin-right: auto; display: block">
			<a
			style="width: 100px; display: block; text-align: center; color: red; font-size: 30px;"></a></a>
	</div>
	<span style="color: red;"><s:actionerror /> <s:fielderror></s:fielderror>
	</span>
</body>
</html>