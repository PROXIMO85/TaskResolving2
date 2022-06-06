
public class Task2 {

	public Object squaresOfSortedArray(int[] input) {
		// TODO Auto-generated method stub
		int n = input.length;
        int[] squaredArr = new int[n];
        int highestSquareIdx = n-1;
        
        int left = 0;
        int right = n-1;
        
        while(left <= right) {
            int leftSquare = input[left]*input[left];
            int rightSquare = input[right]*input[right];
            
            if(leftSquare > rightSquare) {
                squaredArr[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squaredArr[highestSquareIdx--] = rightSquare;
                right--;                
            }
        }

        return squaredArr;
		
	}


}
