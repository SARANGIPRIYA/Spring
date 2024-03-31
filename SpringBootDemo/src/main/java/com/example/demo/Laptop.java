package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
private int lid;
private String lbrand;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLbrand() {
	return lbrand;
}
public void setLbrand(String lbrand) {
	this.lbrand = lbrand;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", lbrand=" + lbrand + "]";
}


public void show() {
	System.out.println("Laptop class");
}
}
