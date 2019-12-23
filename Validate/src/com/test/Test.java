package com.test;


public class Test {

	public static void main(String[] args) {
		String alterPlpImage = "115x115?source=http://cdn.tfgmedia.co.za/10/ProductImages/57144163_01.jpg";
		if(alterPlpImage.contains("source=")) {
			alterPlpImage = alterPlpImage.substring(alterPlpImage.indexOf('=')+1, alterPlpImage.length());
		}
		System.out.println(alterPlpImage);
	}

}
