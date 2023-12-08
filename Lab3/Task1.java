package Lab3;

public class Task1 {
    
    public static void main(String args[]) {

        String path = "АБвrде 123ЖзИ";
        char[] word_inp = path.toCharArray();
        char[] word_out = new char[word_inp.length];
        int j = 0;

        for(int i = 0; i <= word_out.length-1; i++) {

            if (Character.isUpperCase(word_inp[i])) word_out[j++] = word_inp[i];
        }
        
        System.out.println(word_out);
    }
}
