package Utils;

public class Utils {
    private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    public char[] getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(char[] alphabet) {
        this.alphabet = alphabet;
    }
    public int letraParaNumero(char c){

        for(int i=0; i < alphabet.length; i++)
            if(Character.toLowerCase(c) == alphabet[i])
                return i;

        System.out.println("Letra Incorreta!");
        return -1;
    }
}
