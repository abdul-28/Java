public class ReverseNumber{
    public static int revNum(int x){
        int rev = 0;
        while(x!=0){
            int digit=x%10;
            if(rev<Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && digit<-8){
                return 0;
            }
            if(rev>Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && digit>7){
                return 0;
            }
            rev=rev*10 + digit;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int number = 1534236469;
        int reverse = revNum(number);
        System.out.println("reverse of the number is : "+reverse);
    }
}