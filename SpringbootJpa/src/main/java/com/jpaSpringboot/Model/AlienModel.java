package com.jpaSpringboot.Model;

public class AlienModel {
	private int aid;
@Override
	public String toString() {
		return "AlienModel [aid=" + aid + ", aname=" + aname + "]";
	}
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
private String aname;

}
