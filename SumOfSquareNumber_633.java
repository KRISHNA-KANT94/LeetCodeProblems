package array;

public class SumOfSquareNumber_633 {
	
	public static boolean judgeSquareSum(int c) {
		
	int i=0;
	long j= (int) Math.sqrt(c);
//		for(int i=0; i<c; i++) {
//			if(i*i + (i+1)*(i+1)==c){
//				return true;
//			}
//		}
//		return false;
	
	while(i<=j) {
		if((i*i)+(j*j)==c) {
			return true;
		}else if((i*i)+(j*j)<c){
			i++;
		}else {
			j--;
		}
		
	}
	return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=5;
		System.out.println(judgeSquareSum(c));

	}

}
