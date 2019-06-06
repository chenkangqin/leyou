package com.macro.mall.api;

import com.macro.mall.model.PmsProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/product")
public interface GoodsApi {
    @GetMapping("/allList")
    public List<PmsProduct> getAllProduct();
    @GetMapping("/productInfo/{id}")
    public PmsProduct getProductInfo(@PathVariable("id") Long id);
}
