package com.callor.var;

public class java_01 {
	public static void main(String[] args) {
		//1~ 1000 까지 범위중 임의 수 1개를 생성하여 intNum1 저장
		int intNum1 = (int)(Math.random()* 1000)   + 1;
		int intNum2 = (int)(Math.random()* 1000) + 1;
		
		System.out.printf("\tintNum1 : %d\n", intNum1);
		System.out.printf("\tintNum1 : %d\n" ,intNum2);
		
		System.out.println("\t num1 > num2"
						+ (intNum1 > intNum2));
		
		System.out.println("\t num1 < num2"
				+ (intNum1 < intNum2));

		System.out.println("\t num1 == num2"
				+ (intNum1 == intNum2));
		System.out.println("\t num1 <> num2"
				+ (intNum1 != intNum2));



	}
}
