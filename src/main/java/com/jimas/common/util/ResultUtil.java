package com.jimas.common.util;

import com.jimas.common.ResultVo;
import com.jimas.common.constant.ResultStatusEnum;

/**
 * @Description 结果控制工具
 * @author weqinjia.liu
 * @Date 2017年4月19日
 */
public class ResultUtil {
	/**
	* @Title: isSuccess 
	* @Description: 是否成功
	* @param @param rs
	* @param @return
	* @return boolean
	* @throws
	 */
	public static boolean isSuccess(ResultVo<Object> rs){
		return null!=rs && ResultStatusEnum.SUCCESS.getStatus() == rs.getStatus();
	}
	/**
	* @Title: initResultVo 
	* @Description: 初始生成返回结果对象
	* @param @param status
	* @param @return
	* @return ResultVo
	* @throws
	 */
	public static ResultVo<Object> initResultVo(Integer status){
		return ResultUtil.initResultVo(status, null);
	}
	/**
	 * @Title: initResultVo 
	 * @Description: 初始生成返回结果对象,可返回结果对象
	 * @param @param status
	 * @param @return
	 * @return ResultVo
	 * @throws
	 */
	public static ResultVo<Object> initResultVo(Integer status, Object result){
		if(null==status) status = 200;
		return new ResultVo<Object>(status, ResultStatusEnum.getMessage(status),result);
	}
	
	/**
	 * @Title: initResultVo
	 * @Description: 初始生成自定义message、带返回结果result对象的,返回结果对象。
	 * @param status
	 * @param message
	 * @param result
	 * @return
	 * @throws
	 */
	public static ResultVo<Object> initResultVo(Integer status, String message,Object result){
	    if(null==status) status = 200;
	    return new ResultVo<Object>(status, message, result);
	}
}
