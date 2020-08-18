
package si;

import java.util.Scanner;

public class NumberDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int c=0;
            int n=sc.nextInt();
            for(int i=1;i<=n/i;i++){
                if(n%i==0){
                    if(n/i==i)
                        c++;
                    else
                        c+=2;
                }
            }
            System.out.println(c);
        }
    }
}
