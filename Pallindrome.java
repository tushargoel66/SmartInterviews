
package si;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--!=0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            n-=1;
            boolean f=false;
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n--)){
                    System.out.println("No");
                    f=true;
                    break;
                }
            }
            if(f==false)
                System.out.println("Yes");
        }
    }
}
