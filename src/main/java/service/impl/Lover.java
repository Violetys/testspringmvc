package service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.IPerson;

@Component
public class Lover {
	
	@Autowired
	private Man m;
	
	@Autowired
	private Woman w;
	public Lover() {
		this.m = new Man();
		this.w = new Woman();
	}
	public Lover(Man m, Woman w) {
		this.m = m;
		this.w = w;
	}
	
	public Man getM() {
		return m;
	}
	public void setM(Man m) {
		this.m = m;
	}
	public Woman getW() {
		return w;
	}
	public void setW(Woman w) {
		this.w = w;
	}
	public void Show() {
		System.out.print(m.getname()+"和"+w.getname()+"是lover");
	
	}
	@Override
	public String toString() {
		return "男" + m + "女" + w;
	}
	
	
	
}
