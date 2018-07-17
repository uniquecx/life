package com.lb.test;

public class Example_2_1 {

	public static void main(String[] args) {
		//whileѭ��д��1-10�׳˺ͣ�1*1  1*2  1*2*3    1*2*3*4
		int jiecheng=1;
		long sum=0;
		/*for(int i=1;i<=10;i++){
			jiecheng=jiecheng*i;
			System.out.println(i+"�Ľ׳�Ϊ��"+jiecheng);
			sum=sum+jiecheng;
		}*/
		int i=1;
		while(i<=10){
			jiecheng=jiecheng*i;
			System.out.println(i+"�Ľ׳�Ϊ��"+jiecheng);
			sum=sum+jiecheng;
			i++;
		}		
		System.out.println("�׳˺�Ϊ��"+sum);
		
		 
		

	}

}
