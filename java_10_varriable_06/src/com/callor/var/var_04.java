package com.callor.var;

public class var_04 {
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() + 100 ) + 1;
		int intNum2 = (int)(Math.random() + 100 ) + 1;
	
		boolean bComepare = true ;
		
		bCompare = intNum1 > intNum2;
		
		if(bCompare)
			System.out.println(intNum1 +"은" +intNum2 "보다 크다);
		else
			System.out.println(intNum1 +"은" +intNum2 "보다 크지않다);"
				
	}
}
