public class remdup {
    static int removeDup(int [] nums){
        int j=0;
        int len = nums.length;
        for(int i=0;i<len-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
        }
        nums[j++]=nums[len-1];
        return j;
    }
    public static void main(String[] args) {
        int [] nums ={0,0,0,1,1,2,3,4,4};
        int n = removeDup(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
