package Strings;

public class ReverseOnlyLetter_917 {
	
	public static String reverseOnlyLetters(String s) {
		
		int i=0;
		int j=s.length()-1;
		char[] str=s.toCharArray();
        while(i<j){
            while(i<j && !(str[i]>='a' && str[i]<='z' || str[i]>='A' && str[i]<='Z')){
                i++;
            }
            while(i<j && !(str[j]>='a' && str[j]<='z' || str[j]>='A' && str[j]<='Z') ){
                j--;
            }
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;

        }

        return String.valueOf(str);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab-cd";
		
		System.out.println(reverseOnlyLetters(s));
	}

}
