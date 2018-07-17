package com.lb.test;

import java.util.ArrayList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 aTest=new test1();
		/*String txt="a,bb,c,a,dd ,c  c,bb";
		List<String> res1=aTest.split1(txt);
		for(int i=0;i<res1.size();i++){
			System.out.println(res1.get(i));
		}*/
		StringBuilder str11=new StringBuilder("zbcxcsadsafgs");
		String res=aTest.replacetxt(str11, 2,4 );
		System.out.println(res);
	}
	public  List<String> split1(String txt){
		String[] list=txt.split(",");
		List<String> res =new ArrayList<>();
		for(int i=0;i<list.length;i++){
			String a=list[i].trim();
			Boolean istrue=true;
			for(int j=0;j<i;j++){
				String b=list[j].trim();
				if(a.equals(b)){
					istrue = false;
                    break;
                }
			}
			if(istrue){
                res.add(a);
            }
			
		}
		return res;
	}
	public String replacetxt(StringBuilder str,Integer at,Integer length) {
		String str1="";
		for(int i=0;i<length;i++){
			str1=str1+"*";
		}
		String res=str.replace(at, length, str1).toString();
		return res;
	}

}
