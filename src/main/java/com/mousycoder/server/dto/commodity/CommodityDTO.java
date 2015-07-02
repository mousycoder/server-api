package com.mousycoder.server.dto.commodity;

import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 商品信息DTO
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:44:14
 */
public class CommodityDTO {

	@ApiModelProperty(value = "商店Id", required = true)
	private long id;

	@ApiModelProperty(value = "分类Id", required = true)
	private long categoryId;

	@ApiModelProperty(value = "条形码", required = true)
	private String barcode;

	@ApiModelProperty(value = "商品名称", required = true)
	private String name;

	@ApiModelProperty(value = "商品价格", required = true)
	private double price;

	@ApiModelProperty(value = "商品库存", required = true)
	private int stock;

	@ApiModelProperty(value = "图片路径", required = true)
	private String picPath;

	@ApiModelProperty(value = "状态  (0:删除 1:上架 2:下架 ) ref CommodityStatus", required = true)
	private int status;

	@ApiModelProperty(value = "分类名称", required = true)
	private String categoryName;

	@ApiModelProperty(value = "父分类名称", required = true)
	private String parentCategoryName;

	public CommodityDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getParentCategoryName() {
		return parentCategoryName;
	}

	public void setParentCategoryName(String parentCategoryName) {
		this.parentCategoryName = parentCategoryName;
	}

}
