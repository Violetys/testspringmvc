package service.impl;
import service.IPerson;
public class Man implements IPerson {
	String name;
	public Man() {
		this.name ="xxx";
	}
	public Man(String name) {
		this.name = name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void Show() {
	System.out.println(name+"是男生！");
}
}