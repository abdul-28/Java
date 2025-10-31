import java.util.Arrays;

public class RemoveElement {

    public static int remElement(int nums[], int val){

        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int out = remElement(nums, val);
        
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
}
