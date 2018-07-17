package com.lb.test;

public class Example_2 {

	public static void main(String[] args) {
		//forѭ��д��1-10�׳˺ͣ�1*1  1*2  1*2*3    1*2*3*4
		int jiecheng=1;
		long sum=0;
		for(int i=1;i<=10;i++){
			jiecheng=jiecheng*i;
			System.out.println(i+"�Ľ׳�Ϊ��"+jiecheng);
			sum=sum+jiecheng;
		}
		
		System.out.println("�׳˺�Ϊ��"+sum);

	}

}
