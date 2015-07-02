package com.mousycoder.server.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 結果DTO
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:44:51
 */
public class ResultDTO<T> {
	
	@ApiModelProperty(value="状态 (0:失败 1:成功)",required=true)
	private int status;
	
	@ApiModelProperty(value="错误消息",required=true)
	private String message;
	
	@ApiModelProperty(value="返回数据",required=true)
	private T data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
