package practise;

public class ArmstrongBetween1To1000 {
    public static void main (String []args){
        int num,rem,limit = 1000,sum = 0;
        System.out.println("Armstrong number from 1 to 1000");
        for(int i = 1; i <= limit;i++) {
            num = i;
            while (num > 0) {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
            if (i == sum) {
                System.out.println(i + " ");
            } else {
                sum = 0;
            }
        }
    }
}
