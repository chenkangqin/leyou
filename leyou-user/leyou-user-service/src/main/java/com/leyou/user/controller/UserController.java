package com.leyou.user.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.leyou.user.pojo.NideshopUser;
import com.leyou.user.service.NideshopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/usercenter")
public class UserController {
    @Autowired
    private NideshopUserService nideshopUserService;

    @GetMapping("/user/{id}")
    public Object userinfo(@PathVariable Integer id){
        return nideshopUserService.getUserById(id);

    }
    @PostMapping("/loginByWx")
    public Object loginByWx(HttpServletRequest request){
        JSONObject result = null;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = request.getReader();) {
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1) {
                sb.append(buff, 0, len);
            }
            result = JSONObject.parseObject(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    String url = String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code","wxa0c37dae735f91d4","b52d15daa3c8f88797670629aaae19c4",result.getString("code"));
        RestTemplate template = new RestTemplate();
        String wxresult = template.getForEntity(url,String.class,"").getBody();
        JSONObject wxresultJson = JSONObject.parseObject(wxresult);
        String openid = wxresultJson.getString("openid");
        String sessionkey=  wxresultJson.getString("session_key");
        NideshopUser  userVo = nideshopUserService.getUserByOpenId(openid);
        JSONObject userinfo1 =result.getJSONObject("userInfo");
        JSONObject userinfo = userinfo1.getJSONObject("userInfo");
        if(userVo==null){
            userVo = new NideshopUser();
            userVo.setUsername("微信用户"+ UUID.randomUUID().toString().replaceAll("_",""));
            userVo.setPassword(openid);
            userVo.setRegisterTime(new Date());

            userVo.setWeixinOpenid(openid);
            userVo.setAvatar(userinfo.getString("avatarUrl"));
            //性别 0：未知、1：男、2：女
           // userVo.setGender(userinfo.getInt("gender"));
            userVo.setNickname(userinfo.getString("nickName"));
            nideshopUserService.insertSelect(userVo);
        }else {

        }
        JSONObject object = new JSONObject();
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("userId",userVo.getId());
        resultMap.put("userInfo",userinfo);
        resultMap.put("token",UUID.randomUUID());
        object.put("data",resultMap);
        object.put("errno",0);
        return object;
    }

    @RequestMapping("addUser")
    public Map<String,Object> addUser(@RequestBody NideshopUser user){
        Map<String,Object> resultMap = new HashMap<>(10);
        resultMap.put("code",200);
        resultMap.put("desc","新增用户成功");
        return resultMap;
    }

}
