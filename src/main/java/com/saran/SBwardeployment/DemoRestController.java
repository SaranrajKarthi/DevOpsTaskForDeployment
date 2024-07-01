package com.saran.SBwardeployment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@RequestMapping("/")
	public String hello() {
		return "Hello user its automatic deployment";
	}
}
