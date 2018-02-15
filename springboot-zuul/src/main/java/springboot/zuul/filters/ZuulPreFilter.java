package springboot.zuul.filters;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("PRE FILTER: In should filter");
		String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
		System.out.println("ZUUL PATH : " + path);
		return true;
	}

	@Override
	public Object run() {
		System.out.println("PRE FILTER: In run");
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("PRE FILTER: In filter type");
		return "pre";
	}

	@Override
	public int filterOrder() {
		System.out.println("PRE FILTER: In filter order");
		return 0;
	}

}
