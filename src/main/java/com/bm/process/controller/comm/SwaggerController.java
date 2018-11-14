package com.bm.process.controller.comm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Package com.bm.process.controller.comm
 * @Title: SwaggerController.java
 * @Description: swagger呈现
 * @author steven
 * @date 2018年6月1日 下午5:09:53
 * @version V1.0
 */
@Controller
public class SwaggerController {
	// swagger-UI
	@GetMapping(value = "/swagger")
	public String index() {
		return "redirect:swagger-ui.html";
	}

	// swagger-json
	@GetMapping(value = "/swagger/json")
	public String showJson() {
		return "redirect:../v2/api-docs";
	}
}
