package springboot.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/get-value")
	public String getValue(@RequestParam("param") String param) {
		return "You sent : " + param;
	}

	@RequestMapping(value = "/post-something", method = RequestMethod.POST)
	public String postSomething(@RequestBody Employee employee, @RequestParam("param") String param) {
		System.out.println("Parameter : " + param);
		System.out.println("Emp id: " + employee.getId());
		System.out.println("Emp name: " + employee.getName());
		return "Got your data";
	}
}
