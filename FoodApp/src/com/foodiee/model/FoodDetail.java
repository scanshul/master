package com.foodiee.model;

public class FoodDetail {

	
	private String sno;
	private String itemtype;
	private String itemname;
	private String itemprice;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getItemtype() {
		return itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemprice() {
		return itemprice;
	}

	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}

	@Override
	public String toString() {
		return "FoodDetail [sno=" + sno + ", itemtype=" + itemtype
				+ ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	}
	
	
}
