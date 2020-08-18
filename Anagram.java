
package si;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--!=0){
            String s[]=br.readLine().split(" ");
            int c[]=new int[26];
            int c1[]=new int[26];
            for(int i=0;i<s[0].length();i++)
               c[s[0].charAt(i)-'a']++;
            for(int i=0;i<s[1].length();i++)
               c1[s[1].charAt(i)-'a']++;
            boolean f=false;
            for(int i=0;i<26;i++){
                if(c[i]!=c1[i]){
                    System.out.println("False");
                    f=true;
                    break;
                }
            }
            if(f==false)
                System.out.println("True");
        }
    }
}
