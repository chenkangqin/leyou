package com.leyou.item.controller;

import com.github.pagehelper.Page;
import com.leyou.Brand;
import com.leyou.PageResult;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        Page<Brand> result = this.brandService.queryBrandByPageAndSort(page,rows,sortBy,desc, key);
        if (result == null || result.getResult().size()==0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(new PageResult<Brand>(result.getTotal(),result.getResult()));
    }
    @RequestMapping("testhah")
    public Map<String,Object> testRespostcontroller(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        map.put("fs","fdjsfkdsjlf");
        return map;
    }
}
