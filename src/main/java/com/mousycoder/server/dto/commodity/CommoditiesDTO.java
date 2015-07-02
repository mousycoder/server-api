package com.mousycoder.server.dto.commodity;

import java.util.List;

import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 商品信息DTO
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:44:14
 */
public class CommoditiesDTO {

	@ApiModelProperty(value="商品信息",required=true)
	private List<CommodityDTO> commodityDTO;

	@ApiModelProperty(value="总数",required=true)
	private int count;

	public List<CommodityDTO> getCommodityDTO() {
		return commodityDTO;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCommodityDTO(List<CommodityDTO> commodityDTO) {
		this.commodityDTO = commodityDTO;
	}
	
	


}
