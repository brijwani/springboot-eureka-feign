package springboot.zuul.filters;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulRouteFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("ROUTE FILTER: In should filter");
		String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
		System.out.println("ZUUL PATH : " + path);
		return true;
	}

	@Override
	public Object run() {
		System.out.println("ROUTE FILTER: In run");
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("ROUTE FILTER: In filter type");
		return "route";
	}

	@Override
	public int filterOrder() {
		System.out.println("ROUTE FILTER: In filter order");
		return 0;
	}

}
