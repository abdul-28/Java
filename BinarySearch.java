import java.util.Arrays;

public class BinarySearch {

    public static int binSearch(int [] nums,int target){

        Arrays.sort(nums);
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int [] nums ={1,4,7,8,12,9,2,5};
        int position = binSearch(nums,8);
        System.out.println("Target found at position : "+position);
    }
}
