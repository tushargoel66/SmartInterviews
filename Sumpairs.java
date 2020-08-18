
package si;

import java.util.Arrays;
import java.util.Scanner;

public class Sumpairs {
    
    static boolean check(int a[], int k){
        int p1=0,p2=a.length-1;
        while(p1<p2){
            if(a[p1]+a[p2]<k)
                p1++;
            else if(a[p1]+a[p2]>k)
                p2--;
            else
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt(),k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            if(check(a,k))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
