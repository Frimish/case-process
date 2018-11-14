package com.bm.process.controller.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bm.process.pojo.A1;
import com.bm.process.pojo.comm.CommonResult;
import com.bm.process.pojo.comm.CommonResultT;
import com.bm.process.service.test.TestService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Package com.bm.process.controller.test
 * @Title: TestController.java
 * @Description: TODO
 * @author steven
 * @date 2018年6月1日 下午2:08:59
 * @version V1.0
 */
@RestController
@RequestMapping("api/test")
public class TestController {

	@Autowired
	TestService testService;

	/**
	 * Title: test1 Description: TODO
	 * 
	 * @return List<A1>
	 */
	@ApiOperation(value = "我的测试方法1", notes = "我的测试方法1")
	public List<A1> test1() {
		List<A1> allAccount = testService.getDb1A1();
		return allAccount;
	}

	/**
	 * Title: test2 Description: TODO
	 * 
	 * @return int
	 */
	@ApiOperation(value = "我的测试方法2", notes = "我的测试方法2")
	@GetMapping("/db2/test2")
	public int test2() {
		int db2a1 = testService.getDb2A1();
		return db2a1;
	}

	@ApiOperation(value = "我的测试方法3", notes = "我的测试方法3")
	@ApiImplicitParam(name = "id", value = "用户ID", paramType = "query", required = true, dataType = "String")
	@PostMapping("/db3/test3")
	public String test3(String id, @ApiIgnore HttpRequest request) {
		return "hello man!";
	}

	@ApiOperation(value = "我的测试方法4", notes = "我的测试方法4")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", paramType = "query", required = true, dataType = "String"),
			@ApiImplicitParam(name = "name", value = "用户名称", paramType = "query", required = true, dataType = "String") })
	@PostMapping("/db4/test4")
	public CommonResult test4(String id, String name, @ApiIgnore HttpRequest request) {
		return CommonResult.ok("hi my girl!");
	}

	@ApiOperation(value = "我的测试方法5", notes = "我的测试方法5")
	// @ApiImplicitParam(name = "a1DTO", value = "DTO名称", paramType = "query",
	// required = true, dataType = "A1")
	@PostMapping("/db5/test5")
	public CommonResult test5(A1 a1) {
		return CommonResult.ok();
	}

	@ApiOperation(value = "我的测试方法6", notes = "我的测试方法6")
	// @ApiImplicitParam(name = "a1DTO", value = "DTO名称", required = true, dataType
	// = "A1")
	@GetMapping("/db6/test6")
	public CommonResultT<A1> test6(A1 a1) {
		A1 a12 = new A1();
		a12.setA("123");
		return CommonResultT.ok(a12);
	}
}
