
package si;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int swap=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    if(a[i]>a[j+1]){
                        int te=a[j];
                        a[j]=a[j+1];
                        a[j+1]=te;
                        swap++;
                    }
                }
            }
            System.out.println(swap);
        }
    }
        
}
