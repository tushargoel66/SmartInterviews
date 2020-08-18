package si;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Frequency {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        HashMap<Integer ,Integer> hm=new HashMap();
        for(int i=0;i<n;i++){
            if(hm.containsKey(Integer.parseInt(s[i])))
                hm.put(Integer.parseInt(s[i]), hm.get(Integer.parseInt(s[i]))+1);
            else
                hm.put(Integer.parseInt(s[i]),1);
        }
        int q=Integer.parseInt(br.readLine());
        while(q--!=0){
            int que=Integer.parseInt(br.readLine());
            System.out.println(hm.get(que));
        }
        
                
    }
    
}
