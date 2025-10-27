import java.util.Arrays;

public class MissingNumber {
    public static int missingNum(int [] nums){
        
        int n = nums.length;
        Arrays.sort(nums);
        int sum1=0;
        int sum2=0;
        int l= nums[0];

        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }

        for(int i=l;i<=n;i++){
            sum2+=i;
        }
        
        int total = sum2 - sum1;
        return total;
    }
    public static void main(String[] args) {
        int arr[] ={0,1,3,4,2,6,7,8};
        int num = missingNum(arr);
        System.out.println("Missing number in the array is "+num);
    }
}
