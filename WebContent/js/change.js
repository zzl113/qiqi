
function changeT(t,num){
	alert("����ɹ�");
 	 $(window.parent.frames["head"]).contents().find("#positio").html(t);
   	 	var conl= $(window.parent.frames["head"]).contents().find("li");
		for(var i=0;i<conl.length;i++){	
			if(i==num){
				conl[i].className="indexOn";
			}else{
				conl[i].className="index";
			}
		}
  }