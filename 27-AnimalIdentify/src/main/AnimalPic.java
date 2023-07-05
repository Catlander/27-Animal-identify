package main;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

public class AnimalPic {
	public static String AnimalBaike(String info) { 
		//接口地址
    	String requestUrl = "https://aip.baidubce.com/rest/2.0/image-classify/v1/animal";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //放入url参数和请求参数
        params.put("access_token","24.d5bb8af5d7f42fc971cac00530d95aad.2592000.1690987602.282335-35658816");
        params.put("url",info);
        params.put("baike_num",1);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = APISimple.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONObject.fromObject(string).getJSONArray("result").getJSONObject(0).getJSONObject("baike_info");
    	return pageBean.getString("baike_url");
    }
	
	public static String AnimalName(String info) { 
		//接口地址
    	String requestUrl = "https://aip.baidubce.com/rest/2.0/image-classify/v1/animal";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //放入url参数和请求参数
        params.put("access_token","24.d5bb8af5d7f42fc971cac00530d95aad.2592000.1690987602.282335-35658816");
        params.put("url",info);
        params.put("baike_num",1);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = APISimple.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONObject.fromObject(string).getJSONArray("result").getJSONObject(0);
    	return pageBean.getString("name");
    }
}
