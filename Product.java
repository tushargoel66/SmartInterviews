
package si;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt(),m=sc.nextInt();
            int a[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int n1=sc.nextInt(),m1=sc.nextInt();
            int b[][]=new int[n1][m1];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    int s=0;
                    for(int k=0;k<n;k++){
                        s=s+a[i][k]*b[k][j];
                    }
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
    }
}
