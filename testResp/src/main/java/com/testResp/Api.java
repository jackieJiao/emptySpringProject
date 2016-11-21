package com.testResp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.fabric.xmlrpc.base.Array;

@Controller
public class Api {
	
	@RequestMapping(value="/getp")
	public String getpage(HttpServletRequest req,HttpServletResponse resp)
	{
		System.out.println("this is getPage");
		System.out.println(req.getParameter("page"));
		
		
		return "return";
	}
}
