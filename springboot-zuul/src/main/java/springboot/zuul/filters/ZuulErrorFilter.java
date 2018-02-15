package springboot.zuul.filters;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulErrorFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("ERROR FILTER: In should filter");
		String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
		System.out.println("ZUUL PATH : " + path);
		return true;
	}

	@Override
	public Object run() {
		System.out.println("ERROR FILTER: In run");
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("ERROR FILTER: In filter type");
		return "error";
	}

	@Override
	public int filterOrder() {
		System.out.println("ERROR FILTER: In filter order");
		return 0;
	}

}
