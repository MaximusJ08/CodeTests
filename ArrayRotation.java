import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayRotation x = new ArrayRotation();	
		int[] arr = {-1, -2, -3, -4, -5};
		System.out.println(Arrays.toString(x.solution(arr,14)));
	}
	
	 public int[] solution(int[] A, int K) {
		 if(A.length == 0) {
			 return A;
		 }
		 //Prevents unnecessary loops by taking the remainder and looping by that 
		 if (A.length <= K) {
		 		K = K%A.length;
		 System.out.println(K);
		 }
        //Rotate the given array by n times toward right    
        for(int i = 0; i < K; i++){    
            int  j,temp;    
            //Stores the last element of array    
            temp = A[A.length-1];    
            
	        for ( j = A.length-1; j > 0; j--) {
	            A[j] = A[j-1];
	        }   
                
            //Last element of array will be added to the start of array.    
            A[0] = temp;   
        }
        
	    return A;
	    }


}
