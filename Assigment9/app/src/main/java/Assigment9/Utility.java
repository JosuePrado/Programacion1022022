
package Assigment9;

public class Utility {
    public static int GetBiggest (int[] biggest){
        int more = 0;
        for(int i = 0; i < biggest.length; i++){
            if(biggest[i] > more){
            more = biggest[i];
            }
        }
        return more;
    }
    public static String[] Repeated(String sentence){
         
        String[] part= sentence.split(" ");
        int [] count = new int[part.length ];
         
        for( int i = 0;i < part.length; i++){
            part[i] = part[i].toLowerCase();
        }
        for( int j = 0;j < part.length; j++){
            for (String part1 : part) {
                if (part[j].equals(part1)) {
                    count[j] += 1; 
                }
            }
        } 
        int max = GetBiggest(count);  
        int max_w = 0;
        for(int m = 0;m < count.length; m++){
            if(max == count[m]){
                max_w = m;
                break;
            }
        }
        String maxStr = (max + "");
        String answer[] = {part[max_w], maxStr};
        return answer;
    }
}
