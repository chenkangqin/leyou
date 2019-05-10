package com.macro.mall.controller;

import com.github.pagehelper.PageHelper;
import com.leyou.Brand;
import com.macro.mall.dto.CommonResult;
import com.macro.mall.mapper.NideshopAdMapper;
import com.macro.mall.mapper.NideshopChannelMapper;
import com.macro.mall.mapper.NideshopTopicMapper;
import com.macro.mall.mapper.PmsProductMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.PmsBrandService;
import com.macro.mall.service.PmsProductCategoryService;
import com.macro.mall.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenkangqin
 */

@Api(tags = "WxApiIndexController",description = "微信小程序首页接口")
@RestController
@RequestMapping("index")
public class WxApiIndexController{
    @Autowired
    private PmsProductMapper pmsProductMapper;
    @Autowired
    private NideshopAdMapper nideshopAdMapper;
    @Autowired
    private NideshopChannelMapper nideshopChannelMapper;

    @Autowired
    private NideshopTopicMapper nideshopTopicMapper;

    @Autowired
    private PmsBrandService pmsBrandService;

    @Autowired
    private PmsProductCategoryService pmsProductCategoryService;


    @ApiOperation("新品首发")
    @RequestMapping(value = "newGoods")
    @ResponseBody
    public Object getnewGoods() {
        PageHelper.startPage(1,5);
        PmsProductExample pms = new PmsProductExample();
        List<PmsProduct> newProduct = pmsProductMapper.selectByExample(pms);
        return new CommonResult().pageSuccess(newProduct);
    }
    @ApiOperation("热门商品")
    @RequestMapping(value = "hotGoods")
    public Object getHotGoods() {
        PageHelper.startPage(2,5);
        PmsProductExample pms = new PmsProductExample();
        List<PmsProduct> newProduct = pmsProductMapper.selectByExampleWithBLOBs(pms);
        return new CommonResult().pageSuccess(newProduct);
    }

    @ApiOperation("专题精选")
    @RequestMapping(value = "topic")
    public Object getTopic() {
        PageHelper.startPage(1,5);
        NideshopTopicExample example = new NideshopTopicExample();
        List<NideshopTopic> topics = nideshopTopicMapper.selectByExample(example);
        return new CommonResult().pageSuccess(topics);
    }

    @ApiOperation("品牌")
    @RequestMapping(value = "brand")
    public Object getbrand() {
        List<PmsBrand>  brands= pmsBrandService.listBrand(null,1,5);
        return new CommonResult().pageSuccess(brands);
    }
    @ApiOperation("分类")
    @RequestMapping(value = "category")
    public Object getCategory() {
        long pid = 0;
        List<PmsProductCategory>  categories= pmsProductCategoryService.getList(pid,1,5);
        return new CommonResult().pageSuccess(categories);
    }

    @ApiOperation("广告")
    @RequestMapping(value = "banner")
    public Object getBanner() {
        List<NideshopAd> nideshopAds = nideshopAdMapper.selectByExample(new NideshopAdExample());
        return new CommonResult().pageSuccess(nideshopAds);
    }
    @ApiOperation("广告分类")
    @RequestMapping(value = "channel")
    public Object getChannel() {
        List<NideshopChannel> nideshopChannels = nideshopChannelMapper.selectByExample(new NideshopChannelExample());
        return new CommonResult().pageSuccess(nideshopChannels);
    }

}