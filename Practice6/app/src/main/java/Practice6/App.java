
package Practice6;

public class App {
   

    public static void main(String[] args) {
        Vigenere Msj = new Vigenere();
        System.out.println("Criptograma: "+ Msj.encrypt("ATACAR AL ANOCHECER" , "Limon"));
        System.out.println(Msj.desecripter("LBMQNC IW OZZKSSOOZ", "Limon"));
        //final String[] c = Utility.Repeated("This is a repeated word test this is a A");
        //System.out.println(Arrays.toString(c));//Should print [a, 3]
        //final String[] c1 = Utility.Repeated("This is a repeated word test this this this this this this");
        //System.out.println(Arrays.toString(c1));//Should print [this, 7]
        //final String[] c2 = Utility.Repeated("This is a repeated word test this word word word");
        //System.out.println(Arrays.toString(c2));//Should print [word, 4]
        //System.out.println("\n" );
        //final String[] d = Utility.RepeatedWords("This is a repeated word test this is a A");
        //System.out.println(Arrays.toString(d));//Should print [this,2,is,2,a, 3, repeated,1, word,1,test,1]
        //final String[] d1 = Utility. RepeatedWords("This is a repeated word test this this this this this this");
        //System.out.println(Arrays.toString(d1)) ;//Should print [this,7,is,1,a, 1, repeated,1, word,1,test,1]
        //final String[] d2 = Utility. RepeatedWords("This is a repeated word test this word word word");
        //System.out.println(Arrays.toString(d2));//Should print [this,2,is,1,a, 1, repeated,1, word,3,test,1]

    }
}
