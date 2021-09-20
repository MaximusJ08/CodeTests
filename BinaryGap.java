


public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap x = new BinaryGap();	
        }

	public int solution(int N) {
	    int maxIntLenght = 0;
	    String  intString  = Integer.toBinaryString(N);
	    System.out.println(intString);
	    if(!intString.contains("0")){
	        return 0;
	    }
	    for (int i = 0 ; i<intString.length()-1; i++) {
	        int currentIntLength = 0;
	        if (intString.charAt(i) == '1'){
	            for (int j = i+1; j <intString.length();j++){
	            	if (intString.charAt(j) == '1'){
	                    if (currentIntLength>=maxIntLenght){
	                        maxIntLenght = currentIntLength;                     
	                    }
	                   break;
	                }
                    else{
                        currentIntLength++;
                    }
	            }
	        }
	    }
	    return maxIntLenght;
	}
}