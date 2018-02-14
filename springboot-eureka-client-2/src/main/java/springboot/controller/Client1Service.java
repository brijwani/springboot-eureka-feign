package springboot.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "SPRINGBOOT-EUREKA-CLIENT-1")
public interface Client1Service {
	@RequestMapping(value = "/get-value", method = { RequestMethod.GET })
	public String getValue(@RequestParam("param") String param);

	@RequestMapping(value = "/post-something", method = RequestMethod.POST)
	public String postSomething(@RequestBody Employee employee, @RequestParam("param") String param);
}