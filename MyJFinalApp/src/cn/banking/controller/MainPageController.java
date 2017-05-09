package cn.banking.controller;

import com.jfinal.core.Controller;

public class MainPageController extends Controller{
	public void index() {
		this.render("/admin/mainpage.jsp");
	}
	public void mainpage(){
		this.render("/admin/mainpage.jsp");
	}
}
