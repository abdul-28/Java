public class maxPairSum {

    public static int pairSum(int [] nums){
        int resultSum = -1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){

                int digit1 = maxDigit(nums[i]);
                int digit2 = maxDigit(nums[j]);

                if(digit1 == digit2){
                    int sum = nums[i] + nums[j];
                    resultSum = Math.max(sum, resultSum);
                }
            }
        }
        return resultSum;
    }

    private static int maxDigit(int n){
        int digit = 0;
        while(n !=0){
            int currDigit = n%10;
            digit = Math.max(digit, currDigit);
            n/=10;
        }
        return digit;
    }
    
    public static void main(String[] args) {
        
        int [] nums = {2536,1613,3366,162};
        int result = pairSum(nums);
        System.out.println("Maximum pair sum of the array is "+result);
    }
}
