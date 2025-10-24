public class remDupII{
    static int removeDup(int [] nums){
        int len = nums.length;
        
        if(len<=2){
            return len;
        }
        
        int j=2;
        for(int i=2;i<len;i++){
            if(nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }

        return j;

    }
    public static void main(String[] args) {
        int [] nums={1,1,1,2,2,3,4,4,4,4,5};
        int length = removeDup(nums);
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}