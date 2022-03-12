import java.util.*;
import java.io.*;

public class Tester {
    
    
    public boolean isPalindromePair(ArrayList<String> words) {
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i<words.size(); i++){
            String temp = words.get(i);
            
            StringBuilder str = new StringBuilder(temp);
            str.reverse();
            
            if(str.toString()==temp)
                return true;
            else{
                map.put(str.toString(),1);
                set.add(str.toString());
            }
            
        }
        
        for(String str : map.keySet()){
            if(set.contains(str))
                return true;
            
            else{
                int length = str.length();
                
                for(int i = 0; i<length-1; i++){
                    str=str.substring(1);
                    if(set.contains(str))
                        return true;
                }
            }
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        String[]input = {"do","dont","no","not","note","notes","den"};
        String word = "de";
    
        for(int i = 0; i<input.length; i++){
            String str = input[i];
            for(int j=0;j<str.length();j++)
            if(str.startsWith(word,j))
                System.out.println(str);
        }
        
    }
}
