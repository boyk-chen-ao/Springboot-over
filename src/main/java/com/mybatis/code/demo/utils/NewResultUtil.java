package com.mybatis.code.demo.utils;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回值工具包
 * 
 * @author 顾继钞
 * @date 2018年8月16日 上午9:44:25
 */

/**
 * 
 *
 *功能说明：修改接口
 *
 * @author xuren
 *
 * updateTime: 2018年12月3日
 */
public class NewResultUtil {
	
	
	 private static final int SuccessCode =1; // 0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	
	
	/**
	 * 列表返回值
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:45:03
	 * @param partList
	 *            分页后的列表
	 * @param pageIndex
	 *            当前页面
	 * @param pageSize
	 *            页面大小
	 * @param total
	 *            总条数
	 * @return
	 */
	public static Map<String, Object> listResult(Integer pageIndex, Integer pageSize, Integer total, Object partList) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		Integer pages = total / pageSize + 1;
		if (total % pageSize == 0) {
			pages = total / pageSize;
		}
		map.put("pageIndex", pageIndex);
		map.put("pageSize", pageSize);
		map.put("pages", pages);
		map.put("total", total);
		map.put("partList", partList);
		dataMap.put("code", 1);
		dataMap.put("data", map);
		dataMap.put("message", "获取成功");
		return dataMap;
	}

	/**
	 * 成功返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:20
	 * @param status 
	 *           状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static Map<String, Object> resultSuccess(String message, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",SuccessCode);
		map.put("message", "success");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
	
		return map;
	}

	/**
	 * 失败返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:53
	 * @param status
	 *            状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static Map<String, Object> resultFail(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",status);
		map.put("message", "fail");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 参数错误
	 * 
	 * @author 顾继钞
	 * @date 2018年9月26日 上午9:24:08
	 * @param message
	 * @param status 状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param data
	 * @return
	 */
	public static Map<String, Object> paramFail(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",status);
		map.put("message", "参数错误");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 登陆认证失败
	 * 
	 * @author 顾继钞
	 * @date 2018年9月14日 上午11:51:30
	 * @param message
	 * @param status 状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param data
	 * @return
	 */
	public static Map<String, Object> resultFailLogin(String message, Integer status, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", status);
		map.put("message", "请重新登陆");
		map.put("data", data);
		if (null != message) {
			map.put("message", message);
		}
		return map;
	}

	/**
	 * 列表返回值
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:45:03
	 * @param partList
	 *            分页后的列表
	 * @param pageIndex
	 *            当前页面
	 * @param pageSize
	 *            页面大小
	 * @param total
	 *            总条数
	 * @return
	 */
	public static JSONObject listResultJson(Integer pageIndex, Integer pageSize, Integer total, Object partList) {
		JSONObject dataJson = new JSONObject();
		JSONObject rJson = new JSONObject();
		Integer pages = total / pageSize + 1;
		if (total % pageSize == 0) {
			pages = total / pageSize;
		}
		dataJson.put("pageIndex", pageIndex);
		dataJson.put("pageSize", pageSize);
		dataJson.put("pages", pages);
		dataJson.put("total", total);
		dataJson.put("partList", partList);
		rJson.put("code", 1);
		rJson.put("data", dataJson);
		rJson.put("message", "获取成功");
		return rJson;
	}

	/**
	 * 成功返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:20
	 * @param status
	 *            状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static JSONObject resultSuccessJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code",status);
		rJson.put("message", "success");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 失败返回
	 * 
	 * @author 顾继钞
	 * @date 2018年8月16日 上午9:48:53
	 * @param status
	 *            状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param message
	 *            提醒信息
	 * @return
	 */
	public static JSONObject resultFailJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code",status);
		rJson.put("message", "fail");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 参数错误
	 * 
	 * @author 顾继钞
	 * @date 2018年9月26日 上午9:24:08
	 * @param message
	 * @param status 状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param data
	 * @return
	 */
	public static JSONObject paramFailJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", status);
		rJson.put("message", "参数错误");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

	/**
	 * 登陆认证失败
	 * 
	 * @author 顾继钞
	 * @date 2018年9月14日 上午11:51:30
	 * @param message
	 * @param status 状态码，0：传入参数错误；1：调用成功；2：需要登录；3：调用失败；4：其他异常
	 * @param data
	 * @return
	 */
	public static JSONObject resultFailLoginJson(String message, Integer status, Object data) {
		JSONObject rJson = new JSONObject();
		rJson.put("code", status);
		rJson.put("message", "请重新登陆");
		if (null == data) {
			data = "";
		}
		rJson.put("data", data);
		if (null != message) {
			rJson.put("message", message);
		}
		return rJson;
	}

}
