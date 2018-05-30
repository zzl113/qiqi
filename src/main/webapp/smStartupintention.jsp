<!DOCTYPE html>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="shortcut icon" href="<%=basePath%>img/favicon.ico" />
<title>必普餐饮创业项目</title>
<script type="text/javascript">
	var basePath="<%=basePath%>";
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
		
		
		$("input[name=guesttype]").click(function(){
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
		
			<div class="body_big">
					<img src="<%=basePath%>img/19_HeaderBg.jpg" />
					<div class="bann_box">
						<p class="bann_big">餐饮创业项目指南</p>
						<p class="ban_sma">量身打造你的专属开店方案 </p>
					</div>
				</div>
			
			<div class="body_form">
			<p class="blue_text">选址老师和技术店长已经准备好了哟~</p>
				<p class="red_text cuowu" style="display: none;">（*请确保必填选项都有填写~）</p>
				<div class="xuxian"></div>
				<form action="<%=basePath%>sm/smStartupintention/PublicNumber.do" method="post" onsubmit="return toVaild()"  >
				<div  style="display: none">
						<input type="text" name="source"  value="${source}" />
						</div>
					<div class="questions xiangmu danxuan">
						<p ><span class="blue_text title">意向餐饮项目</span> <span class="red_text title">* </span> </p>
						<!-- <p class='blue_text cutitle' style="display: none"  >*请做出选择</p> -->
						<div class="xuan">
							<input type="radio" name="project" id="sbs" value="sbs" /><label
								for="sbs">食必思黄焖鸡米饭</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="ny" value="nysp" /><label
								for="ny">南云上品瓦香鸡</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="gf" value="gfgt" /><label
								for="gf">咕法骨汤私房面</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="jm" value="jmtd" /><label
								for="jm">久焖提督私房牛肉面</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="bsxg" value="bsxg" /><label
								for="bsxg">板尚小哥私厨板烧</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="zjjxwc" value="zjjxwc" /><label
								for="zjjxwc">张吉记小碗菜</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="zjjsgf" value="zjjsgf" /><label
								for="zjjsgf">张吉记砂锅饭</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="sxm" value="sxm" /><label
								for="sxm">石小沫煎饼果儿</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="sqsdsgf" value="sqsd" /><label
								for="sqsdsgf">食趣石代石锅饭</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="mdgn" value="mdgn" /><label
								for="mdgn">麻朵姑娘</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="yshg" value="xysys" /><label
								for="yshg">鱻鱼石养生火锅</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="mydh" value="myd" /><label
								for="mydh">焖有道黄焖鸡米饭</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="tsss" value="tss" /><label
								for="tsss">铁尚书私房板烧</label>
						</div>
							<div class="xuan">
							<input type="radio" name="project" id="twyhym" value="twyhjhym" /><label
								for="twyhym">江湖鱼面</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="wgtw" value="wgtw" /><label
								for="wgtw">五骨太尉金汤私房面</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="sfm" value="ywyj" /><label
								for="sfm">渝外有家重庆小面</label>
						</div>	<div class="xuan">
							<input type="radio" name="project" id="txj" value="Covet" /><label
								for="txj">贪小卷</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="bby" value="meowLikeBoboFish" /><label
								for="bby">喵想吃啵啵鱼</label>
						</div>
						<div class="xuan">
							<input type="radio" name="project" id="sec" value="houzuoshiercha" /><label
								for="sec">逅座十二茶</label>
						</div>
					</div>
					<div class="questions yuanyin">
						<p ><span class="blue_text title">该项目打动你们的原因</span> <span class="red_text title">*</span></p>
						<input type="text" name="movedreason" id="" value
							class="inptext bitian" />
					</div>
					<div class="questions yuanyin">
						<p ><span class="blue_text title">除此项目外，还考虑投资什么餐饮项目</span> </p>
						<input type="text" name="otherProject" id="" value
							class="inptext" />
					</div>
					<div class="questions guesttype danxuan">
						<p ><span class="blue_text title">面向消费群体</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="guesttype" id="jmq"
								value="residentialArea" /><label for="jmq">居民区</label>
						</div>
						<div class="xuan">
							<input type="radio" name="guesttype" id="bgq"
								value="officeBuilding" /><label for="bgq">办公区</label>
						</div>
						<div class="xuan">
							<input type="radio" name="guesttype" id="school" value="school" /><label
								for="school">学校</label>
						</div>
						<div class="xuan">
							<input type="radio" name="guesttype" id="syj"
								value="businessStreet" /><label for="syj">商业街</label>
						</div>
						<div class="xuan">
							<input type="radio" name="guesttype" id="shop" value="mall" /><label
								for="shop">商场</label>
						</div>
						<div class="">
							<input type="radio" name="guesttype" id="qt" value="other" /><label
								for="qt">其他</label> <input type="text" name="otherguesttype"
								style="display: none;" id="qtt" value  />

						</div>
					</div>
					<div class="questions time danxuan">
						<p ><span class="blue_text title">预计启动时间</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="startupdate" id="liji"
								value="immediately" /><label for="liji">立即</label>
						</div>
						<div class="xuan">
							<input type="radio" name="startupdate" id="sanyue"
								value="in3Months" /><label for="sanyue">三个月之内</label>
						</div>
						<div class="xuan">
							<input type="radio" name="startupdate" id="yunian"
								value="in1Year" /><label for="yunian">一年内</label>
						</div>
					</div>
					<div class="questions time danxuan">
						<p ><span class="blue_text title">预计开店面积</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="estimatedArea" id="50"
								value="30TO50Flat" /><label for="50">30-50平</label>
						</div>
						<div class="xuan">
							<input type="radio" name="estimatedArea" id="60"
								value="60TO80Flat" /><label for="60">60-80平</label>
						</div>
						<div class="xuan">
							<input type="radio" name="estimatedArea" id="100"
								value="oneHundredPlus" /><label for="100">100+</label>
						</div>
					</div>
					<div class="questions yusuan danxuan">
						<p ><span class="blue_text title">投资预算</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="budget" id="fundlow" value="under50k" /><label
								for="fundlow">5W以下</label>
						</div>
						<div class="xuan">
							<input type="radio" name="budget" id="fundmid" value="50kTo100k" /><label
								for="fundmid">5W-10W</label>
						</div>
						<div class="xuan">
							<input type="radio" name="budget" id="fundtop" value="above100k" /><label
								for="fundtop">10W以上</label>
						</div>
					</div>
					<div class="questions laiyuan danxuan">
						<p ><span class="blue_text title">资金来源</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="fundssource" id="ziyou" value="own" /><label
								for="ziyou">自有</label>
						</div>
						<div class="xuan">
							<input type="radio" name="fundssource" id="jiedai" value="loan" /><label
								for="jiedai">借贷</label>
						</div>
						<div class="xuan">
							<input type="radio" name="fundssource" id="ziaddjie" value="both" /><label
								for="ziaddjie">自有、借贷都有</label>
						</div>
					</div>
					<div class="xuxian"></div>
					<div class="liucheng">
						<img src="<%=basePath%>img/tgdt.png" />
					</div>
					<div class="xuxian"></div>
					<div class="questions kdyuanyin">
						<p ><span class="blue_text title">选择开店的原因</span> <span class="red_text title">*</span></p>
						<select name="startupreason">
							<option value="0">刚毕业想试试创业！</option>
							<option value="1">工作没意思，不如自己做老板</option>
							<option value="2">一家人共同努力开个店还能挣钱</option>
							<option value="3">闲着也是闲着</option>
							<option value="4">在餐厅打工，想再上一个台阶</option>
							<option value="5">已有餐厅，想换项目或加个项目</option>
						</select>
					</div>
					<div class="questions juceren">
						<p ><span class="blue_text title">创业决策人</span> <span class="red_text title">*</span></p>
						<select name="decisionmaker">
							<option value="0">我自己做得了主</option>
							<option value="1">得爸爸妈妈帮我把关</option>
							<option value="2">和朋友合伙的，不好自己拿主意</option>
							<option value="3">我得听我老公的</option>
							<option value="4">我得听我老婆的</option>
							<option value="5">兄弟姐妹或其他长辈亲戚</option>
						</select>
					</div>
					<div class="questions jyjingyan danxuan">
						<p class="blue_text title ">是否有餐厅经营经验？*</p>
						<div class="xuan">
							<input type="radio" name="hassetupresexp" id="jyjingyant"
								value="1" /><label for="jyjingyant">是</label>
						</div>
						<div class="xuan">
							<input type="radio" name="hassetupresexp" id="jyjingyanf"
								value="0" /><label for="jyjingyanf">否</label>
						</div>
					</div>
					<div class="questions cyjingyan danxuan">
						<p ><span class="blue_text title">是否有创业经验？</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="hassetupexp" id="cyjingyant" value="1" /><label
								for="cyjingyant">是</label>
						</div>
						<div class="xuan">
							<input type="radio" name="hassetupexp" id="cyjingyanf" value="0" /><label
								for="cyjingyanf">否</label>
						</div>
					</div>
					<div class="questions ywdianmian danxuan">
						<p ><span class="blue_text title">是否已有店面？</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="hasshop" id="ywdianmiant" value="1" /><label
								for="ywdianmiant">是</label>
						</div>
						<div class="xuan">
							<input type="radio" name="hasshop" id="ywdianmianf" value="0" /><label
								for="ywdianmianf">否</label>
						</div>
					</div>
					
						<div class="questions kdyuanyin">
						<p ><span class="blue_text title">对于你餐饮创业的想法，家人是否支持呢？</span> <span class="red_text title">*</span></p>
						<select name="isSupportIdea">
							<option value="support">支持</option>
							<option value="discuss">还需要讨论</option>
							<
						</select>
					</div>
					
					<div class="questions xliaojie">
						<p><span class="blue_text title">考察餐饮项目，你最最最最想关注哪一点？</span> <span class="red_text title">*</span></p>
						<input type="text" name="detailswanttoknow" id="" value
							class="inptext bitian" />
					</div>
					<div class="questions schy">
						<p ><span class="blue_text title">目前所处行业</span> <span class="red_text title">*</span></p>
						<input type="text" name="industry" id="" value
							class="inptext bitian" />
					</div>
					<div class="xuxian"></div>
					<div class="questions cstime danxuan">
						<p ><span class="blue_text title">从事该行业的时间</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="industryexperience" id="oneye"
								value="inOneYear" /><label for="oneye">一年以内</label>
						</div>
						<div class="xuan">
							<input type="radio" name="industryexperience" id="twoye"
								value="1To3Years" /><label for="twoye">1-3年</label>
						</div>
						<div class="xuan">
							<input type="radio" name="industryexperience" id="fouty"
								value="3To5Years" /><label for="fouty">3-5年</label>
						</div>
						<div class="xuan">
							<input type="radio" name="industryexperience" id="fifye"
								value="over5Years" /><label for="fifye">5年以上</label>
						</div>
					</div>
					<div class="zstp">
						<img src="<%=basePath%>img/tg01.jpg" /> <img
							src="<%=basePath%>img/tg02.jpg" /> <img
							src="<%=basePath%>img/tg03.jpg" /> <img
							src="<%=basePath%>img/tg04.jpg" />
						<div style="clear: both;"></div>
						<p>已完成100000+小人物的创业梦</p>
						<p>只要你勇敢迈出创业第一步</p>
						<p>剩下的交给我~</p>
					</div>
					<div class="xuxian"></div>
					<div class="questions yname">
						<p ><span class="blue_text title">名字</span> <span class="red_text title">*</span></p>
						<input type="text" name="customername" id="" value
							class="inptext inpname bitian" />
					</div>
					<div class="questions age ">
						<p><span class="blue_text title">年龄</span> <span class="red_text title">*</span></p>
						<select name="age">
							<option value="00s">00后</option>
							<option value="90s">90后</option>
							<option value="80s">80后</option>
							<option value="70s">70后</option>
							<option value="60s">60后</option>
							<option value="50s">50后</option>
						</select>
					</div>
					
					
					<div class="xuxian"></div>
					<div class="questions cstime danxuan">
						<p ><span class="blue_text title">性别</span> <span class="red_text title">*</span></p>
						<div class="xuan">
							<input type="radio" name="gender" id="male"
								value="1" /><label for="male">男</label>
						</div>
						<div class="xuan">
							<input type="radio" name="gender" id="female"
								value="2" /><label for="female">女</label>
						</div>
						<!-- <div class="xuan">
							<input type="radio" name="gender" id="secrecy"
								value="3" /><label for="secrecy">(保密)</label>
						</div> -->
						
					</div>
					
					<div class="questions home">
						<p ><span class="blue_text title">想在哪里开店？</span> <span class="red_text title">*</span></p>
						<div class="guoqi">
							<img src="<%=basePath%>img/guoqi.png" />中国
						</div>
						<div id="city">
							<select name="provinceId" value class="prov"></select> <select
								name="cityId" value class="city" disabled="disabled"></select> <select
								name="areaId" value class="dist" disabled="disabled"></select>
						</div>
					</div>
					<div class="questions phone">
						<p ><span class="blue_text title">方便接听的手机号码</span> <span class="red_text title">*</span></p>
						<input type="text" name="phone" id="isPhone" value
							class="inptext inpphone bitian" />
						<div style="display: none;" id="none" value=""></div>
					</div>
					<div class="questions phonwx">
						<p ><span class="blue_text title">不方便接听电话的时候可以微信联系</span> <span class="red_text title">*</span></p>
						
						<input type="text" name="wechat" id="" value
							class="inptext phonewx bitian"  />
					</div>
					<div class="questions kcdate">
						<p class="blue_text title">预约考察日期</p>
						<p class="title hui_text">创业需谨慎，考察公司是个必选项哟~</p>
						<input name="investigatedate" id="txtEndDate" value
							class="inptext inpdate" />
					</div>
					<div class="questions beizhu">
						<p class="blue_text title">备注</p>
						<input type="text" name="remarks" id="" value=""
							class="inptext inpbeizhu" />
					</div>
					<div class="xuxian"></div>
					<div class="zhanshitu">
						<img src="<%=basePath%>img/tg05.jpg" /> <img
							src="<%=basePath%>img/tg06.jpg" /> <img
							src="<%=basePath%>img/tg07.jpg" />
					</div>
					<div class="xuxian"></div>
					<input type="submit" name="" id="button" value="提交" />
				</form>
			</div>
		</div>
	</div>
</body>

  <script language="javascript">
            function toVaild(){
            	alert("请确认提交");
             }
     </script>

</html>