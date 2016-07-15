package com.package1;
 class L1
 {
	 private Integer i;
	 private String s;
	// private boolean b=y;
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
 }

 class L2
 {
	 L1 ll=new L1();
	 
	 
	 
 }



public class L {
	public static void main(String[] args) {
		L1 l=new L1();
		System.out.println(l.getI()+" "+l.getS());
	
	}

}
