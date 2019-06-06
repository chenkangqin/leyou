package com.leyou.search;

import com.LySearchApplication;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.search.client.GoodsClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LySearchApplication.class)
public class GoodsClientTest {

    @Autowired
    private GoodsClient goodsClient;

    @Test
    public void testQueryCategories() {
        List<PmsProduct> names = this.goodsClient.getAllProduct();
        for(PmsProduct name :names){
            System.out.println(name.getName());
        }
    }
}