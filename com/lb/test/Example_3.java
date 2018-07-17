package com.lb.test;
//���������
public class Example_3 {
 /*  *   3  1
    ***  2  3
   ***** 1  5
  *******0  7*/

	public static void main(String[] args) {
		 for(int i=1;i<=4;i++){//i��ʾ�����У�
			 //������ٿո�
			 for(int j=0;j<4-i;j++){
				System.out.print(" "); 
			 }
			 
			 //�������*
			 for(int a=1;a<=2*i-1;a++){
				 System.out.print("*"); 	 
			 }
			 System.out.println("");
			 
		 }
	}

}
