package com.lms.util;

public class ValidationUtil {
	public boolean checkReqiure(String st){
		return st==null || st.trim().isEmpty() || st.trim().length()==0?
				true:false;
	}
	public boolean checkLength(String st,int min,int max){
		if(min!=-1 && max!=-1){
			if(min<=st.length() && st.length()<=max) return false;
			else return true;
		}
		if(min==-1){
			return st.length()<=max?false:true;
		}
		if(max==-1){
			return min<=st.length()?false:true;
		}
		return false;
	}
	public boolean checkEmailFormat(String st){
		String ch[]={"@",".com"};
		for(String c:ch){//@,.com more than one time
			int count=0;
			String tmp=st;
			int index;
			while((index=tmp.indexOf(c))!=-1){
				tmp=tmp.substring(index+1);
			count++;
			}
			if(count>1) return false;
		}
		return st.endsWith(".com")?true:false;
	}


}
