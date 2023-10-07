package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters_1002 {
	
	 public static List<String> commonChars(String[] words) {
		 List<String> l = new ArrayList<>();
		 String str=words[0];
			for(int i=0; i<str.length();i++){
				String s=String.valueOf(words[0].charAt(i));
				boolean isTrue=false;
				for(int j=1; j<words.length; j++){
					if(words[j].contains(s)){
						words[j]=words[j].replaceFirst(s,"");
						isTrue=true;
					}else{
						isTrue=false;
						break;
					}
				}
				if(isTrue){
				l.add(s);
			}
			}
		return l;	   
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words= {"bella","label","roller"};
		
		System.out.println(commonChars(words));
	}

}
