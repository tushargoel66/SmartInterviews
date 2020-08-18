
package si;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            boolean f=false;
            for(int i=2;i<n/2;i+=2){
                if((n-i)%2==0){
                    System.out.println("True");
                    f=true;
                    break;
                }
            }
            if(f==false)
                System.out.println("False");
        }
    }
}
