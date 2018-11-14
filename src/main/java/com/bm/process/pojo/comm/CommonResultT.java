package com.bm.process.pojo.comm;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @Package com.comqing.common.utils
 * @Title: CommonResult.java
 * @Description: 自定义响应结构(为swagger才这么做，返回泛型类型)
 * @author steven
 * @date Aug 31, 2017 7:38:18 PM
 * @version V1.0
 * 
 */
public class CommonResultT<T> {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态
	private Integer status;

	// 响应消息
	private String msg;

	// 响应中的数据
	private T data;


	public static<T> CommonResultT build(Integer status, String msg, T data) {
		return new CommonResultT(status, msg, data);
	}

	/**
	 * 
	 * @Title: ok @Description: TODO @param @param data @param @return @return
	 *         CommonResult @throws
	 */
	public static<T> CommonResultT ok(T data) {
		return new CommonResultT(data);
	}

	public static CommonResultT ok() {
		return new CommonResultT(null);
	}

	public CommonResultT() {

	}

	public static CommonResultT build(Integer status, String msg) {
		return new CommonResultT(status, msg, null);
	}

	public CommonResultT(Integer status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public CommonResultT(T data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	// public Boolean isOK() {
	// return this.status == 200;
	// }

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 将json结果集转化为CommonResult对象
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            CommonResult中的object类型
	 * @return
	 */
	public static CommonResultT formatToPojo(String jsonData, Class<?> clazz) {
		try {
			if (clazz == null) {
				return MAPPER.readValue(jsonData, CommonResultT.class);
			}
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (clazz != null) {
				if (data.isObject()) {
					obj = MAPPER.readValue(data.traverse(), clazz);
				} else if (data.isTextual()) {
					obj = MAPPER.readValue(data.asText(), clazz);
				}
			}
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 没有object对象的转化
	 * 
	 * @param json
	 * @return
	 */
	public static CommonResultT format(String json) {
		try {
			return MAPPER.readValue(json, CommonResultT.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Object是集合转化
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            集合中的类型
	 * @return
	 */
	public static CommonResultT formatToList(String jsonData, Class<?> clazz) {
		try {
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get("data");
			Object obj = null;
			if (data.isArray() && data.size() > 0) {
				obj = MAPPER.readValue(data.traverse(),
						MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
			}
			return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
		} catch (Exception e) {
			return null;
		}
	}

}
