package com.mousycoder.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mousycoder.server.constants.ErrorType;
import com.mousycoder.server.dto.ResultDTO;
import com.mousycoder.server.dto.commodity.CommoditiesDTO;
import com.mousycoder.server.param.BaseParam;
import com.mousycoder.server.service.CommodityService;
import com.mousycoder.server.url.RestUrl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * <b>function:</b> 商品管理模块
 *
 * @author mousycoder
 * @createDate 2015年3月26日 上午9:21:36
 */
@Api(value = "commodity", description = "商品管理",produces=MediaType.APPLICATION_JSON_VALUE)
@Controller
public class CommodityController {
	
	@Autowired
	private CommodityService commodityService;


	@ApiOperation( value = "获得商品信息", notes = "获取商品信息(用于数据同步)",httpMethod = "POST",produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value={@ApiResponse(code=200,message="商品信息"),
			@ApiResponse(code=201,message=ErrorType.errorCheckToken + "(token验证失败)",response=String.class),
			@ApiResponse(code=202,message=ErrorType.error500+"(系统错误)",response=String.class)})
	@RequestMapping(value = RestUrl.getCommodity, method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<CommoditiesDTO> getCommodity(@ApiParam(value="Json参数",required=true)@RequestBody BaseParam param) throws Exception {
		return commodityService.getCommodity(param);
	}

}
