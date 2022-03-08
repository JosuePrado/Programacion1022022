package Practice6;
import java.util.Arrays;
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
    public static String[] RepeatedWords(String sentence){
         
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
        
        String[] strCount = new String[count.length];
        for(int i = 0;i < count.length; i++){
             strCount[i] = String.valueOf(count[i]);
        }
        int n = 0;
        String answer[] = new String[12];
        for(int m = 0;m < count.length; m++){
            if(m < 6){
                answer[n] = part[m];
                n++;
                answer[n] = strCount[m];//como transformo un array int a un array String?
                n++;
            }    
        }

        return answer;
    }
   
}
