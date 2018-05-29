package intercept;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SessionIntercepter extends AbstractInterceptor { 
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//得到解耦合的session
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(session.get("user")==null) {//没有登录
			return "login";
		}else {//登录了 才调用后续处理 并返回后续处理返回的视图
		   String ret = invocation.invoke();
		   return ret; 
		}
	} 
}
