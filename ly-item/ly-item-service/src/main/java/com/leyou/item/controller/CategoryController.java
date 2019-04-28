package com.leyou.item.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leyou.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("list")
    //@CrossOrigin(allowCredentials="true", allowedHeaders="*", methods={RequestMethod.GET}, origins="*")
    public ResponseEntity<List<Category>> getListById(@RequestParam(value="pid",defaultValue = "0") Long pid){
        try {
            if (pid == null || pid.longValue() < 0){
                // pid为null或者小于等于0，响应400
                return ResponseEntity.badRequest().build();
            }
            // 执行查询操作
            List<Category> categoryList = this.categoryService.queryCategoryListByParentId(pid);
            if (CollectionUtils.isEmpty(categoryList)){
                // 返回结果集为空，响应404
                return ResponseEntity.notFound().build();
            }
            // 响应200
            return ResponseEntity.ok(categoryList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(method = RequestMethod.POST,value="/push")
    @ResponseBody
    public Map<String,Object> add(HttpServletRequest request,Category category)throws  Exception{

       // request.getParameter("category");
        JSONObject obj = JSON.parseObject(request.getParameter("category"));
        category =JSON.parseObject(request.getParameter("category"),Category.class);
        categoryService.insertNewCategory(category);
        Map<String,Object> map  = new HashMap<>();
        map.put("flag",true);
        return map;
    }
}
