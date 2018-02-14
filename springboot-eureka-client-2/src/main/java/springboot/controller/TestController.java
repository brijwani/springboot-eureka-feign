package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	Client1Service client1Service;

	@RequestMapping("/get-value")
	public String getValue() {
		return client1Service.getValue("Haha");
	}

	@RequestMapping("/post-something")
	public String postSomething() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Brijesh");
		return client1Service.postSomething(employee, "He is good");
	}
}
