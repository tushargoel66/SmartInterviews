
package si;

import java.util.Scanner;

public class Right {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int n=sc.nextInt();
            System.out.println("Case #"+k+":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j>=n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
