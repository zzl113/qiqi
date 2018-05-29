package intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerIntercepter extends AbstractInterceptor { 
	@Override
	public String intercept(ActionInvocation arg0) throws Exception { 
		long oldTime = System.currentTimeMillis();//当前的毫秒数
		String result = arg0.invoke();//invoke 调用后续的拦截器以及 action
		long timeDiffer = System.currentTimeMillis() - oldTime;
		System.out.println(arg0.getProxy().getActionName()+"的"+arg0.getProxy().getMethod()+"执行了"+timeDiffer);
		return result;
	} 
}
