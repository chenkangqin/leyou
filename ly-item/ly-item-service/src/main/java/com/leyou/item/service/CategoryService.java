package com.leyou.item.service;

import com.leyou.Category;
import com.leyou.item.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public List<Category> queryCategoryListByParentId(Long pid) {
        Category record = new Category();
        record.setParentId(pid);
        SqlSession session= sqlSessionFactory.openSession();
        CategoryMapper tempCategoryMapper = session.getMapper(CategoryMapper.class);
        tempCategoryMapper.select(record);
        tempCategoryMapper.select(record);
        tempCategoryMapper.select(record);
        this.categoryMapper.select(record);
        return this.categoryMapper.select(record);
    }
    public int insertNewCategory(Category category){
       return categoryMapper.insert(category);
    }
}
