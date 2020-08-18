
package si;

import java.util.HashMap;
import java.util.Scanner;

public class Triple_Trouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> hm=new HashMap();
            for(int i=0;i<n;i++){
                int tem=sc.nextInt();
                if(hm.containsKey(tem))
                    hm.put(tem,hm.get(tem)+1);
                else
                    hm.put(tem,1);
            }    
            for(int i:hm.keySet()){
                if(hm.get(i)==1)
                    System.out.println(i);
            }
        }
    }
}
