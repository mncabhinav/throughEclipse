package com.test;

public class Test2  {
	static  int x =100;
		
	public static void main(String[] args) {
		
		
		Animal a = new Animal() {
			@Override
			public void sleeping() {
				System.out.println("Animal sleeping");
				
			}
		};
		a.sleeping();
		
		Test2 tt= null;
		System.out.println(tt.x);
	}

}
