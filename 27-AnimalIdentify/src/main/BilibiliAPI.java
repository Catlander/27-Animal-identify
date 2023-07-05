package main;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class BilibiliAPI {
	public static String VedioMes(String info) { 
		//接口地址
    	String requestUrl = "https://tenapi.cn/v2/bilivideo";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //放入url参数和请求参数
        params.put("url",info);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = APISimple.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONObject.fromObject(string).getJSONObject("data");
    	return pageBean.getString("detail");
    }
	
	//暂时无法使用
	public static String UserName(int info) { 
		//接口地址
    	String requestUrl = "https://tenapi.cn/v2/biliinfo";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //放入url参数和请求参数
        params.put("uid",info);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = APISimple.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONObject.fromObject(string).getJSONObject("data");
    	return pageBean.getString("name");
    }
	
	public static String VedioCover(String info) { 
		//接口地址
    	String requestUrl = "https://tenapi.cn/v2/bilivideo";  
    	//params用于存储要请求的参数
        Map params = new HashMap();
      //放入url参数和请求参数
        params.put("url",info);
      //调用httpRequest方法，这个方法主要用于请求地址，并加上请求参数
        String string = APISimple.httpRequest(requestUrl,params);
        //处理返回的JSON数据并返回
        JSONObject pageBean = JSONObject.fromObject(string).getJSONObject("data");
    	return pageBean.getString("cover");
    }
}

