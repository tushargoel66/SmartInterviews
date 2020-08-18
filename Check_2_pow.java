
package si;

import java.util.Scanner;

public class Check_2_pow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            long n=sc.nextLong();
            int c=0;
            while(n!=0){
                if((n&1)==1){
                    c++;
                }
                n=n>>1;
            }
            if(c==1)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
