package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CountryDetails {

	private Integer cid;
	private String cname;
	private List<Link> link = new ArrayList<Link>();

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Link> getLink() {
		return link;
	}

	public void setLink(List<Link> link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "CountryDetails [cid=" + cid + ", cname=" + cname + "]";
	}

	public CountryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryDetails(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public void addLink(String url, String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		this.link.add(link);
	}

}
