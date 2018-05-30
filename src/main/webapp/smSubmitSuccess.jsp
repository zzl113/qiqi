<!DOCTYPE html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="shortcut icon" href="<%=basePath%>img/favicon.ico" />
<title>必普餐饮创业项目</title>
<script type="text/javascript">
	var basePath='<%=basePath%>';
</script>
<script src="<%=basePath%>js/jquery-3.2.1.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="<%=basePath%>js/tgform.js" type="text/javascript"
	charset="utf-8"></script>
<script src="<%=basePath%>js/jquery.cityselect.js"
	type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>layDate-v5.0.9/laydate/laydate.js"
	type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>css/tgform.css" />
</head>


<script type="text/javascript">
	$(document).ready(function() {

		/* $("#id").toggle(); */

		$("input[name=guesttype]").click(function() {
			$("input[id=qtt]").hide();
		});
		$("#qt").click(function() {
			$("#qtt").show();
		});

		/* $("#qt").click(function() {
			$("#qtt").hide();
		}); */

	});
</script>
<body>

	<div class="box">
		<div class="bj"></div>
		<div class="body">

			<div   class="body_big">
				<img src="<%=basePath%>img/19_HeaderBg.jpg" />
				<div class="bann_box">
					<p class="bann_big">餐饮创业项目指南</p>
					<p class="ban_sma">量身打造你的专属开店方案</p>
				</div>
			</div>
			<div  style="display: none">
						<input type="text" name="source"  value="${source}" />
						</div>
			<div style="width:100%;  background-color: #fff; ">
			<div style="width: 200px;height: 200px;  margin:0 auto; padding-top:20px " >
				<img src="<%=basePath%>img/success.png" style="padding-top:20px" >
			</div>
			<div class="fb_ssTitle" style="color: #335476; width:200px; margin:0 auto;"
				data-reactid=".3.$tips.0">
				<p data-reactid=".3.$tips.0.$asTextTitle0" style="width:100px; margin:0 60px; padding-top:20px;">&nbsp;提交成功</p>
			</div>
			<div class="fb_ssSubTitle" style="color: #666666; width:200px; margin:0 auto; "
				data-reactid=".3.$tips.1">
				<!-- <p data-reactid=".3.$tips.1.$asTextSubTitle0" style="width:500px; margin:0 230px; padding:20px 0;">项目经理会第一时间为您分析指导，请耐心等候</p>
				<p data-reactid=".3.$tips.1.$asTextSubTitle1" style="width:100px; margin:0 360px;">&lt;(￣ˇ￣)/</p> -->
				<p data-reactid=".3.$tips.1.$asTextSubTitle0" style="width:200px; margin:60 30px; padding:20px 0;">项目经理会第一时间为您分析指导，请耐心等候</p>
				<p data-reactid=".3.$tips.1.$asTextSubTitle1" style="width:100px; margin:0 60px; ">&lt;(￣ˇ￣)/</p>
			</div>
			</div>
			<div class="submit"
				style="text-align: center; background-color: #fff; padding:20px "
				data-reactid=".4">
				<a class="fb_submitBtn"
					style="width: auto; height: 30px; padding-top: 7px; padding-bottom: 7px; padding-left: 20px; padding-right: 20px; font-weight: normal; color: #FFFFFF; background: #D61518;"
					href="backHomepage.do?source=${source}" data-reactid=".4.0">返回</a>
			</div>
			<!-- <input type="submit" name="" id="button" value="返回" /> -->
		</div>
	</div>
</body>

</html>