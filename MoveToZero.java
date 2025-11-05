import java.util.Arrays;

public class MoveToZero {

    public static void moveZeroes(int [] nums){

        int n = nums.length;
        int index = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        while(index < n){
            nums[index++]=0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        
        int [] nums ={1,0,0,3,12,0};
        moveZeroes(nums);
    }
    
}
