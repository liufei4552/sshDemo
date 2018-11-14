package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

@Controller
public class IndexAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	public String addshop(){
		System.out.println("进入..........");
	return "success";
	}

}
