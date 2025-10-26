import java.util.Arrays;

class Solution {
    public static int longestConsecutive(int[] nums) {
        int count = 1;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 1; i < n; i++){
            if(nums[i]-nums[i-1]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] ={0,1,3,5,7,0,2,4,6,8,1};
        int length = longestConsecutive(arr);
        System.out.println(length);
        for(int x :arr){
            System.out.print(x+" ");
        }
    }
}