public class MajorityElement {

    public static int majEle(int [] nums){

        int count = 0;
        int temp = 0;

        for(int x : nums){

            if(count == 0){
                temp = x;
            }
            count += (x == temp) ? 1 : -1;
        }
        return temp;
    }
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,3,4,3};
        int res = majEle(nums);
        System.out.println("The majority element in the array is : "+res);
    }
}
