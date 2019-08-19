package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import entity.User;

@Controller
@RequestMapping("/Account")
public class AccountController {
	//登录首页
	@Autowired
	HttpServletRequest request;				///////////////
	
	@Autowired
	HttpSession session;				///////////////
	
	
	@RequestMapping("/")
	public String index(){
		return "account/index";
	}
	
	
//	 @RequestMapping("/Login")
//	public String Login(String username,String password){
//		if(username.equals("xxx")&&password.equals("123")) {
//			request.setAttribute("username",username);
//			request.setAttribute("password",password);
//			return "account/welcome";
//		}else {
//			request.setAttribute("errorMsg", "用户名或密码不正确"); 
//			return "account/index";
//		}
//	}
	
	
//	@RequestMapping("/Login/{username}/{password}")
//	public String Login(@PathVariable String username,@PathVariable String password){
//		if(username.equals("xxx")&&password.equals("123")) {
//			request.setAttribute("username",username);
//			request.setAttribute("password",password);
//			return "account/welcome";
//		}else {
//			request.setAttribute("errorMsg", "用户名或密码不正确"); 
//			return "account/index";
//		}
//	}
//	

	
	
//	 @RequestMapping("/Login")
//		public String Login(User user){
//			if(user.getUsername().equals("xxx")&&user.getPassword().equals("123")) {
//				request.setAttribute("user",user);
//				
//				return "account/welcome";
//			}else {
//				request.setAttribute("errorMsg", "用户名或密码不正确"); 
//				return "account/index";
//			}
//		}
	
	
	
//	 @RequestMapping("/Login")
//		public ModelAndView Login(User user){
//		 ModelAndView mv = new ModelAndView();
//		 mv.addObject("user",user);//设置模型
//		 mv.setViewName("account/welcome"); //设置视图
//		 return mv;
//		}
	
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return "account/welcome";
		
	}
	
	 @RequestMapping("/Login")
		public String Login(User user,RedirectAttributes redirectAttributes){
			if(user.getUsername().equals("xxx")&&user.getPassword().equals("123")) {
				session.setAttribute("user",user);
				
				return "redirect:/Account/Welcome";
			}else {
				redirectAttributes.addFlashAttribute("errorMsg","用户名或密码错！"); 
				return "redirect:/Account/";
			}
		}
	
}
