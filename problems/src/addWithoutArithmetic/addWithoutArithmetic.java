package addWithoutArithmetic;

import java.util.Scanner;

public class addWithoutArithmetic {
    public static void main(String[] args) {
        int a ,b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();

        System.out.println(getsum(a,b));
    }

    public static int getsum(int a, int b){
        while(b!=0){
            int carry = a&b;
            a = a ^ b;
            b = carry << 1;

        }
        return a;
    }
}
