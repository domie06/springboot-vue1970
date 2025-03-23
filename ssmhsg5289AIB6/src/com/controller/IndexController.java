package com.controller;

import java.io.File;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.entity.Xinwentongzhi;
import com.entity.Yonghuzhuce;
import com.entity.Duliyinleren;
//jixacxishxu1

import com.server.XinwentongzhiServer;
import com.server.YonghuzhuceServer;
import com.server.DuliyinlerenServer;
//jixacxishxu2

import com.util.PageBean;

@Controller
public class IndexController {
	
	
	@Resource
	private XinwentongzhiServer xinwentongzhiService;
	@Resource
	private YonghuzhuceServer yonghuzhuceServer;
	@Resource
	private DuliyinlerenServer duliyinlerenServer;
	//jixacxishxu3
	
	
	
//	首页显示内容
	@RequestMapping("index.do")
	public String showIndex(ModelMap map){

		List<Xinwentongzhi> syxinwentongzhi1=xinwentongzhiService.getsyxinwentongzhi1(null);
		List<Xinwentongzhi> syxinwentongzhi2=xinwentongzhiService.getsyxinwentongzhi2(null);
		List<Xinwentongzhi> syxinwentongzhi3=xinwentongzhiService.getsyxinwentongzhi3(null);

		List<Yonghuzhuce> syyonghuzhuce1=yonghuzhuceServer.getsyyonghuzhuce1(null);
		List<Duliyinleren> syduliyinleren1=duliyinlerenServer.getsyduliyinleren1(null);
		List<Duliyinleren> syduliyinleren2=duliyinlerenServer.getsyduliyinleren2(null);
		List<Duliyinleren> syduliyinleren3=duliyinlerenServer.getsyduliyinleren3(null);
		//jixacxishxu4
		
	    map.put("syxinwentongzhi1", syxinwentongzhi1);
	    map.put("syxinwentongzhi2", syxinwentongzhi2);
	    map.put("syxinwentongzhi3", syxinwentongzhi3);
	    map.put("syyonghuzhuce1", syyonghuzhuce1);
		map.put("syduliyinleren1", syduliyinleren1);
	    map.put("syduliyinleren2", syduliyinleren2);
	    map.put("syduliyinleren3", syduliyinleren3);
	    //jixacxishxu5

		return "default";
	}

	

	
}
