$(function() {
	$(".bj").height($(window).height() + "px")
	$("#city").citySelect();
	$(".inpphone").blur(function() {
		if(!(/^(((13[0-9]{1})|(15[0-35-9]{1})|(17[0-9]{1})|(18[0-9]{1}))+\d{8})$/.test($(".inpphone").val()))) {
			$(".inpphone").val("");
			$(".inpphone").attr("placeholder", "*手机号不正确")
		}else{
			$.ajax({
				type : "POST",
				url : "sm/smStartupintention/selectPhone.do",
				data : {
					phone : $(".inpphone").val(),
					time : Math.random()
				},
				async : false,
				success : function(json) {
					var $code = $.trim(json);
					if ($code == "1") {
						
					} else {
						if ($code == "0") {
							$(".inpphone").val("");
							$(".inpphone").attr("placeholder",'该手机号已被使用，请去核实手机号');
							return false;
						}
						$(".inpphone").attr("data-flag", "");
						return false;
					}
				},
				error : function(data) {
					$(".inpphone").attr("data-flag", "");
					return false;
				}
			})
		}
	})
	laydate.render({
		elem: '#txtEndDate' //指定元素
	});
	
	//判断文本框不能为空
		$("form").submit(function(e){
			$('p.cutitle').remove();
			$(".bitian").each(function(i,s){
				if($(".bitian").eq(i).val()==""){
					e.preventDefault();
					;
					$(".cuowu").css("display","block")
					$(".bitian").eq(i).before("<p class='red_text cutitle'>*请填写此项</p>")
				}	
			})
				//判断单选不能不选
			$(".danxuan").each(function(i,s){
	//		console.log($(".danxuan").eq(i))
				if($(".danxuan").eq(i).find("input").is(":checked")==false){
					e.preventDefault();
					
					$(".danxuan").eq(i).find("p").after("<p class='red_text cutitle'>*请做出选择</p>");
					
				}	
			})
			
			$("html,body").animate({scrollTop: $('.cutitle:visible:first').siblings().eq(0).offset().top}, 1000);
		})
})