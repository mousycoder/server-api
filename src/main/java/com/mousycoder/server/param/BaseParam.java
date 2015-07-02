package com.mousycoder.server.param;

import com.mousycoder.server.dto.IBaseDTO;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * <b>function:</b> rest 服务基本参数
 *
 * @author mousycoder
 * @createDate 2015年3月31日 下午3:58:32
 */
public class BaseParam implements IBaseDTO {

	@ApiModelProperty(value="商店Id",required=true)
	private long shopId;

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

}
