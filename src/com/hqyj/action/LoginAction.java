package com.hqyj.action;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.hqyj.bean.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user ;
	public User getModel() {
		if(user==null){
			user = new User();
		}
		return user;
	}
	
	
	/*public String wow(){
		System.out.println("我是一句话");
		return "wow";
		
	}
	public String aa1(){
		System.out.println("我是一句话");
		return "wow1";
		
	}*/
	/*public void validate(){
		if("".equals(user.getUsername())||user.getUsername()==null){
			addFieldError("username","用户名不能为空");
		}else if("".equals(user.getPassword())||user.getPassword()==null){
			addFieldError("password","密码不能为空");
		}
	}*/

	public String login(){
	/*	ActionContext.getContext().put("username", user.getUsername());
		ActionContext.getContext().put("password", user.getPassword());
		ActionContext.getContext().put("sex", user.getSex());*/
		if(Integer.parseInt(user.getPassword())==123){
			Cookie cookie = new Cookie("USERNAME",user.getUsername());
			ServletActionContext.getResponse().addCookie(cookie);
			ActionContext.getContext().put("USERNAME", user.getUsername());
			return SUCCESS;
		}
		return "input";
	}		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	/*@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}*/
	public String preRegister(){
		
		return	"preRegister";
	}
}
