package intercept;

import java.util.Map;
<<<<<<< HEAD
=======

>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SessionIntercepter extends AbstractInterceptor { 
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//得到解耦合的session
		Map<String, Object> session = ActionContext.getContext().getSession();
<<<<<<< HEAD
		if(session.get("user")==null) {
			//没有登录
			return "login";
		}else {
			//登录了 才调用后续处理 并返回后续处理返回的视图
=======
		if(session.get("user")==null) {//没有登录
			return "login";
		}else {//登录了 才调用后续处理 并返回后续处理返回的视图
>>>>>>> f287f93b8f1d0f9e14a942804a73323837f6ccac
		   String ret = invocation.invoke();
		   return ret; 
		}
	} 
}
