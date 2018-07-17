package com.lb.test;
// 6=1��2��3.  ��1-1000֮�����Ҫ���������Ӻ�Ϊ����
public class Example_5 {
 
	 

	public static void main(String[] args) {
		 for(int i=1;i<=1000;i++){
			 long sum=0;
			 for(int j=1;j<i;j++){
				 if(i%j==0){
					 sum=sum+j; 
				 }
			 }
			 
			 if(sum==i){
				 System.out.println(i);
				 
			 }
			 
		 }
	}

}
