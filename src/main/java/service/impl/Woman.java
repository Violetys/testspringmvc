package service.impl;
import service.IPerson;
public class Woman implements IPerson {
	String name;
	
	public Woman() {
		this.name = "xxx";
	}
	public Woman(String name) {
		this.name = name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void Show() {
		System.out.println(name+"是女生！");
	}
}
