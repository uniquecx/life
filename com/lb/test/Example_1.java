package com.lb.test;

public class Example_1 {

	public static void main(String[] args) {
		 int result=0;
		 long sum=0;
		 for(int i=1;i<=100;i++){
			 int total=0;//��¼���Ĵ���
			 for(int j=1;j<=i;j++){
				 //
				 if(i%j==0){//����Ϊ0 ���������
					 total++;	
					
				 }				 
			 }
			 if(total==2){
				 System.out.println(i);
				 result++;
				 sum=sum+i;
			 } 
		 }
		 System.out.println("�������Ϊ��"+result+"----��Ϊ��"+sum);

	}

}
