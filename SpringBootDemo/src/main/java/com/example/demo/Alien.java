package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //to create an object this annotation is used by spring
//@Scope(value="prototype")// how many we ask spring to get bean that many it will give
public class Alien {
public Alien() {
		super();
		System.out.println("Obj created");
	}

private int aid;
private String aname;
private String atech;
@Autowired              //bytype
//@Qualifier("lap1")   //byname
private Laptop laptop;

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getAtech() {
	return atech;
}
public void setAtech(String atech) {
	this.atech = atech;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", atech=" + atech + "]";
}

public void main() {
	System.out.println("Alien class");
	laptop.show();
}
}
