
 
package Intern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author trinh
 */
public class Nal {
    
    public static void DemChucai(Map<String,String> bangtracuu, String str)
    {
        
        int count = 0;
        for(int i=0;i<str.length();i++)
       {
            if(i<str.length()-1)
            {
            String s = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+1));
           if(bangtracuu.containsKey(s))
           {
           count ++;
           i = i + 1;
           }
            }
       }
        System.out.println("So chu cai tieng viet: "+count);
    }
    
    public static boolean Check(String str) {
  String regex = "[^\\w\\s]";
  return Pattern.compile(regex).matcher(str).find();
}
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if(Check(str))
            System.out.println("Error");
        else
        {
        Map<String, String> bangTraCuu = new HashMap<>();
  bangTraCuu.put("aw", "ă");
  bangTraCuu.put("aa", "â");
  bangTraCuu.put("dd", "đ");
  bangTraCuu.put("ee", "ê");
  bangTraCuu.put("oo", "ô");
  bangTraCuu.put("ow", "ơ");
  bangTraCuu.put("uw", "ư");
        DemChucai(bangTraCuu, str);
       
    }
    }
}
