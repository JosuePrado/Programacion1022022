
package Practice6;
public class Vigenere {

        public String encrypt(String msj,String key){
            String result = ""; 
            String keyMay = key.toUpperCase();
            String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            char[] keyMsj = new char[msj.length()]; 
            char[] msjArray = msj.toUpperCase().toCharArray();
            int count = 0, posX = 0, posY = 0, res;
          
            for(int i = 0; i< msjArray.length; i++){
              if(msj.charAt(i) == ' '){
                  i++;
              }
              keyMsj[i] = keyMay.charAt(count);
              count++;
              if(count == keyMay.length()){
                  count = 0;
              }
          }
          for(int i = 0; i < msjArray.length; i++){
                if(msj.charAt(i)==' ')
                {
                    result+=" ";
                    i++;
                }
                for(int j=0; j < ABC.length(); j++){
                    if(msjArray[i] == ABC.charAt(j)){
                        posX=j;
                   
                    }
                    if(keyMsj[i]==ABC.charAt(j)){
                        posY=j;
                   
                    }
                }
                res=(posX + posY) % 27;
                result += ABC.charAt(res);
            }    
       
        return result;
        }
        public String desecripter(String result, String key){
            String msg = "";
            String keyMay = key.toUpperCase();
            String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            char[] resultArray = result.toUpperCase().toCharArray();
            char[] keyArray = new char[result.length()];
            int count = 0, posX = 0, posY = 0, res;
            for(int i = 0; i < result.length(); i++){
                if(result.charAt(i) == ' '){
                    i++;
                }
                keyArray[i] = keyMay.charAt(count);
                count++;
                if(count == keyMay.length()){
                    count = 0;
                }                
            }
            for(int i = 0; i < result.length(); i++){
                if(result.charAt(i) == ' '){
                    msg += " ";
                    i++;
                }
                for(int j = 0; j < ABC.length(); j++){
                    if(resultArray[i] == ABC.charAt(j)){
                        posX = j; 
                    }
                    if(keyArray[i] == ABC.charAt(j)){
                        posY = j; 
                    }

                }
                res=(posX-posY);
                if(res < 0){
                    res = res + 27; 
                }
                msg += ABC.charAt(res);
            } 
     
            
            return msg;
        }
} 