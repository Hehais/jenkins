package com.uzengroup.tag;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexTag extends BaseTag{
	
	public Map<String,Object> index(Object codeType,Object mobile,Object countryCode){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		
		resultMap.put("codeType", codeType);
		resultMap.put("mobile", mobile);
		resultMap.put("countryCode", countryCode);
		
		
		return resultMap;
	}

}
