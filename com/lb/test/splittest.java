package com.lb.test;

import java.util.ArrayList;
import java.util.List;

public class splittest {
	public  List<String> split1(String txt){
		
		String txt1="a,bb,c,a,dd ,c  c,bb";
		String[] list=txt1.split(",");
		List<String> res =new ArrayList<>();
		for(int i=0;i<list.length;i++){
			String a=list[i].trim();
			Boolean istrue=true;
			for(int j=i+1;j<list.length;j++){
				String b=list[j].trim();
				if(a==b){
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
	
	

}
