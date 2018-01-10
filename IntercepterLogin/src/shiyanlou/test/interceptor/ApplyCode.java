package shiyanlou.test.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ApplyCode implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		

	}

	@Override
	public void init() {
		

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map sessionMap = arg0.getInvocationContext().getSession();
		String code = (String) sessionMap.get("code");
		
		if(null != code && code.equals("shiyanlou")){
			return arg0.invoke();
		}
		
		sessionMap.put("msgSession", "Apply a code firest!");
		return "login";
	}

}
