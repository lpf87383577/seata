package com.example.bankb.seate;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.seata.core.context.RootContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Feign拦截器，把RootContext中的XID（XID用于标识一个局部事务属于哪个全局事务，需要在调用链路的上下文中传递）传递到上层调用链路
 * 
 * @author sly
 * @time 2019年6月12日
 */
@Component
public class RequestHeaderInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		String xid = RootContext.getXID();
		if (StringUtils.isNotBlank(xid)) {
			template.header("Xid_Header", xid);
		}
	}

}
