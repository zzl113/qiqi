<%@page import="javax.swing.text.TabableView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<title>易购——category_manage</title>
<meta charset="utf-8">
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<link type="text/css" href="css/user_add.css" rel="stylesheet">

<script type="text/javascript">
	function checkAll() {
		return checkAddress() && checkPhone() && checkPhone() && checkEmail()
				&& checkUser_id() && checkBirthday() && checkUser()
				&& checkReal() && rePwd();
	}
	function checkAddress() {
		var rex = new RegExp("^([^\x00-\xff]|[A-Za-z0-9_])+$", "gi");
		var uservalue = $("[name='address']")[0].value;
		if (rex.test(uservalue)) {
			$("#resultAddress").html("√");
			$("#resultAddress").css("color", "green");
			return true;
		} else {
			$("#resultAddress").html("(请正确输入地址)");
			$("#resultAddress").css("color", "blue");
			return false;
		}
	}
	function checkPhone() {
		var uservalue = $("[name='phone']")[0].value;
		var rex = new RegExp("^1[3,5,7,8][0-9]{9}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultPhone").html("√");
			$("#resultPhone").css("color", "green");
			return true;
		} else {
			$("#resultPhone").html("(请正确输入手机号码)");
			$("#resultPhone").css("color", "blue");
			return false;
		}
	}
	function checkEmail() {
		var b = false;
		var uservalue = $("[name='email']")[0].value;
		var rex = new RegExp("^[a-z0-9_]+@[a-z0-9]+(\.[a-z]{2,3}){1,2}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultEmail").html("√");
			$("#resultEmail").css("color", "green");
			return true;
		} else {
			$("#resultEmail").html("(请正确输入email格式)");
			$("#resultEmail").css("color", "blue");
			b = false;
		}
		return b;
	}
	function checkUser_id() {
		var uservalue = $("[name='user_id']")[0].value;
		var rex = new RegExp("^[0-9]{15}$|^[0-9]{18}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultUser_id").html("√");
			$("#resultUser_id").css("color", "green");
			b = true;
		} else {
			$("#resultUser_id").html("(15位或18位身份证号)");
			$("#resultUser_id").css("color", "blue");
			b = false;
		}
		return b;
	}
	function checkBirthday() {
		var uservalue = $("[name='birthDay']")[0].value;
		var rex = new RegExp(
				"^[0-9]{4}-(1[0-2]|0?[1-9])-(0?[1-9]|[1-2][0-9]|3[0-1])$", "gi");
		if (rex.test(uservalue)) {
			$("#resulBirthday").html("√");
			$("#resulBirthday").css("color", "green");
			return true;
		} else {
			$("#resulBirthday").html("(yyyy-mm-dd)");
			$("#resulBirthday").css("color", "blue");
			return false;
		}
	}
	function checkUser() {
		var b = false;
		var uservalue = $("[name='userName']")[0].value;
		var rex = new RegExp("^[a-z][a-z0-9]{5,16}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultUserName").html("√");
			$("#resultUserName").css("color", "green");

			b = true;
		} else {
			$("#resultUserName").html("(6位以上数字字母,字母开头)");
			$("#resultUserName").css("color", "blue");
			b = false;
		}
		return b;
	}
	function checkReal() {
		var uservalue = $("[name='name']")[0].value;
		var rex = new RegExp("^[\u4e00-\u9fa5]{2,}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultRealName").html("√");
			$("#resultRealName").css("color", "green");
			return true;
		} else {
			$("#resultRealName").html("(2位以上的汉字)");
			$("#resultRealName").css("color", "blue");
			return false;
		}
	}
	function checkPwd() {
		var uservalue = $("[name='pwd']")[0].value;
		var rex = new RegExp("^[a-z0-9_]{6,18}$", "gi");
		if (rex.test(uservalue)) {
			$("#resultPwd").html("√");
			$("#resultPwd").css("color", "green");
			return true;
		} else {
			$("#resultPwd").html("(6位以上数字字母)");
			$("#resultPwd").css("color", "blue");
			return false;
		}
	}
	function rePwd() {
		var oldp = $("[name='pwd']")[0].value;
		var newp = $("[name='repwd']")[0].value;
		if (oldp == newp && newp != "") {
			$("#resultRePwd").html("√");
			$("#resultRePwd").css("color", "green");
			return true;
		} else {
			$("#resultRePwd").html("(两次密码不一样)");
			$("#resultRePwd").css("color", "blue");
			return false;
		}

	}
</script>
</head>
<body>
	<main> <section class="right"> <section
		class="right_top">
	<ul>
		<li><img src="images/houtai1.png"></li>
		<li><span>修改用户</span></li>
	</ul>
	</section>
	<div class="line"></div>
	<section class="right_middle">
	<form action="UpdateUs!updateUe.action" method="post"
		onsubmit="return checkAll()">
		<table>
			<tr>
				<td class="Ntext"></td>
				<td style="color: red"></td>
				<td><input type="hidden" name="user.id" readonly="readonly"
					value="<s:property value="user.id"/>"></td>
			</tr>
			<tr>
				<td class="Ntext">用户名（*）：</td>
				<td><input type="text" class="In" name="user.loginname"
					value="<s:property value="user.loginname"/>"></td>
				<td id="resultUserName"></td>
			</tr>
			<tr>
				<td class="Ntext">真实姓名（*）：</td>
				<td><input type="text" class="In" name="user.realname"
					value="<s:property value="user.realname"/>"></td>
				<td id="resultRealName"></td>
			</tr>
			<tr>
				<td class="Ntext">登录密码（*）：</td>
				<td><input type="password" class="In" name="user.password"
					value="<s:property value="user.password"/>"></td>
				<td id="resultPwd"></td>
			</tr>
			<tr>
				<td class="Ntext">确认密码（*）：</td>
				<td><input type="password" class="In" name="user.pwd"
					value="<s:property value="user.password"/>"></td>
				<td id="resultRePwd"></td>
			</tr>
			<tr>
				<td class="Ntext">性别（*）：</td>

				<td><input type="radio" value="1" name="user.sex"><img
					src="images/Male.gif"> <input type="radio" value="0"
					name="user.sex"><img src="images/Female.gif"></td>
				<td id="resultSex"></td>
			</tr>
			<tr>
				<td class="Ntext">出生日期：</td>
				<td><input type="text" class="In" name="user.birthday"
					value="<s:property value="user.birthday"/>"></td>
				<td id="resulBirthday"></td>
			</tr>
			<tr>
				<td class="Ntext">身份证：</td>
				<td><input type="text" class="In" name="user.cardid"
					value="<s:property value="user.cardid"/>"></td>
				<td id="resultUser_id"></td>
			</tr>
			<tr>
				<td class="Ntext">电子邮件：</td>
				<td><input type="text" class="In" name="user.email"
					value="<s:property value="user.email"/>"></td>
				<td id="resultEmail"></td>
			</tr>
			<tr>
				<td class="Ntext">手机号：</td>
				<td><input type="text" class="In" name="user.tel"
					value="<s:property value="user.tel"/>"></td>
				<td id="resultPhone"></td>
			</tr>
			<tr>
				<td class="Ntext">地址（*）：</td>
				<td><input type="text" class="In" name="user.address"
					value="<s:property value="user.address"/>"></td>
				<td id="resultAddress"></td>
			</tr>
			<tr>
				<td colspan="2" class="right_bottom"><input type="image"
					src="images/submit.gif"></td>
			</tr>
		</table>
	</form>
	</section> </section> </main>
</body>
</html>