package com.lechenggu.languageaction;

import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LuageAction extends ActionSupport {
	
private int lan;
public int getLan() {
	return lan;
}
public void setLan(int lan) {
	this.lan = lan;
}
@Override
public String execute() throws Exception {
	 switch (lan) {
	case 1:
		ActionContext.getContext().setLocale(Locale.CHINA);
		break;
   case 2:
		ActionContext.getContext().setLocale(Locale.US);
		break;
    case 3:
	ActionContext.getContext().setLocale(Locale.TAIWAN);
	break;
	default:
		ActionContext.getContext().setLocale(Locale.CHINA);
		break;
	}
	return super.execute();
}
}
