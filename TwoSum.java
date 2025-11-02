import java.util.Arrays;

public class TwoSum {

    public static int [] twoSum(int [] nums, int target){

        int n = nums.length;
        int [] res = new int[2];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){

                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int targer = 9;
        int [] output= twoSum(arr, targer);
        for(int x : output){
            System.out.print(x+" ");
        }
    }
    
}
