package com.mousycoder.server.param.commodity;

import com.mousycoder.server.param.BaseParam;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 增加商品参数
 *
 * @author mousycoder
 * @createDate 2015年3月31日 下午4:00:53
 */
public class AddCommodityParam extends BaseParam {

	@ApiModelProperty(value = "分类Id", required = true)
	private long categoryId;

	@ApiModelProperty(value = "条形码", required = true)
	private String barcode;

	@ApiModelProperty(value = "商品名称", required = true)
	private String name;

	@ApiModelProperty(value = "价格", required = true)
	private double price;

	@ApiModelProperty(value = "库存", required = true)
	private int stock;

	@ApiModelProperty(value = "商品图片id", required = true)
	private long picId;

	@ApiModelProperty(value = "商品图片地址", required = true)
	private String picPath;

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public long getPicId() {
		return picId;
	}

	public void setPicId(long picId) {
		this.picId = picId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

}
