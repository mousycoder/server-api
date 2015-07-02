package com.mousycoder.server.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;



/**
 * <b>function:</b> 父类DTO
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:44:32
 */
public class BaseDTO implements IBaseDTO {

	
	@ApiModelProperty(value="id")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
