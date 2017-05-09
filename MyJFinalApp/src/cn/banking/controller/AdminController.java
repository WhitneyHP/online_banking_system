package cn.banking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.druid.DruidPlugin;

import cn.banking.config.MyAppConfig;
import cn.banking.model.AdminInfo;
import cn.banking.service.IAdminService;
import cn.banking.serviceimpl.AdminServiceImpl;
import cn.banking.utils.MD5Util;
import net.sf.json.JSONObject;

public class AdminController extends Controller {
	
	public void index() {
		this.render("/admin/login.jsp");
	}
	
	public void indexHome() {
		this.render("/admin/home.jsp");
	}
	
	public void test() {
		this.render("/admin/inquiry_form.jsp");
	}
	
	public void doLogin() {
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		String account = this.getPara("account");
		String password = this.getPara("password");
		//System.out.println(MD5Util.doubleEncoderByMd5(password));
		JSONObject result =  adminServiceImpl.login(account, password); 
		if (result.getInt("status") == 1) { // status=1登录成功，status=0登陆失败
			this.setSessionAttr("account", account);// 将账号存到session
		    this.setSessionAttr("userType", "admin");// 将用户类型存到session
		}
		System.out.println(result.optString("reason"));
		setAttr("status", result.opt("status"));
		setAttr("reason", result.opt("reason"));
		//return result;
		renderJson();
		
	}

	/*public void sayHello() {

		String userName = this.getPara("userName");

		String sayHello = "Hello " + userName + "，welcome to JFinal world.";
		
		List users = AdminInfo.dao.find("SELECT * FROM admin_info WHERE admin_account = '" + userName + "'");
		
        setAttr("size", users.size());
        
		this.setAttr("sayHello", sayHello);

		this.render("/hello.jsp");

	}*/
	
}
