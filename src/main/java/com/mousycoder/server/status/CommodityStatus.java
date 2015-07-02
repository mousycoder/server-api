package com.mousycoder.server.status;

import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 商品状态
 *
 * @author mousycoder
 * @createDate 2015年3月31日 下午7:01:48
 */
public interface CommodityStatus {

	@ApiModelProperty(value="删除",required=true)
	int DELETED = 0 ;
	
	@ApiModelProperty(value="上架",required=true)
	int ON_SALE = 1;

	@ApiModelProperty(value="下架",required=true)
	int OFF_SALE = 2;


	
	
	
	
}
