package com.lb.test;

public class Example_4 {
 
	/*
	ij
	00  01  02  03 04
	10  11  12  13 14
	20  21  22  23 24  
	
	
	00 01 02 03 04
	   11 12 13 
	      22
	 */

	public static void main(String[] args) {
		for(int i=0;i<=2;i++){//i��ʾ���±�
			  for(int j=0;j<=4-i;j++){ //j��ʾ���±�
				  if(i<=j){
					  System.out.print("*");
				  }else{
					  System.out.print(" ");
				  } 
			 }
			  System.out.println("");
		}
	}

}
