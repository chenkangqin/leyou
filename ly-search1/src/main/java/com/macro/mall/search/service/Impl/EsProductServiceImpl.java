package com.macro.mall.search.service.Impl;

import com.macro.mall.api.GoodsApi;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.search.client.GoodsClient;
import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsProductRelatedInfo;
import com.macro.mall.search.repository.EsProductRepository;
import com.macro.mall.search.service.EsProductService;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilter;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EsProductServiceImpl implements EsProductService {

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private EsProductRepository productRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public int importAll() {
        elasticsearchTemplate.createIndex(EsProduct.class);
        elasticsearchTemplate.putMapping(EsProduct.class);
        List<PmsProduct> productList =goodsClient.getAllProduct();
        List<EsProduct> esProductList = new ArrayList<>();
        for (PmsProduct product: productList
             ) {
            EsProduct temp = new EsProduct();
            temp.setId(product.getId());
            temp.setBrandId(product.getBrandId());
            temp.setProductCategoryId(product.getProductCategoryId());
            temp.setKeywords(product.getKeywords());
            temp.setName(product.getName());
            temp.setPic(product.getPic());
            temp.setPrice(product.getPrice());
            temp.setSubTitle(product.getSubTitle());
            esProductList.add(temp);
        }
        productRepository.saveAll(esProductList);
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EsProduct create(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        /*System.out.println(keyword+pageNum+pageSize);
        NativeSearchQueryBuilder queryBuilder  = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.matchQuery("all",keyword).operator(Operator.AND));
        queryBuilder.withSourceFilter(new FetchSourceFilter(new String[]{"name","subTitle","keywords"},null));
        queryBuilder.withPageable(PageRequest.of(pageNum,pageSize));
        Page<EsProduct> result =  productRepository.search(queryBuilder.build());*/
        Pageable pageable = new PageRequest(pageNum, pageSize);
        Page<EsProduct> result = productRepository.findByName(keyword,pageable);
        return result;
    }

    @Override
    public Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort) {
        return null;
    }

    @Override
    public Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public EsProductRelatedInfo searchRelatedInfo(String keyword) {
        return null;
    }

    @Override
    public void createIndex(Long id) {
        PmsProduct product= goodsClient.getProductInfo(id);
        EsProduct temp = new EsProduct();
        temp.setId(product.getId());
        temp.setBrandId(product.getBrandId());
        temp.setProductCategoryId(product.getProductCategoryId());
        temp.setKeywords(product.getKeywords());
        temp.setName(product.getName());
        temp.setPic(product.getPic());
        temp.setPrice(product.getPrice());
        temp.setSubTitle(product.getSubTitle());
        productRepository.save(temp);
    }
}
