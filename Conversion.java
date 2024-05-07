public class Converion {

 public static String convertToUpperCase(String input) {
 
        char[] charsArray= new char[input.length()];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {   
                c = Character.toUpperCase(c);
            }
            charsArray[index++] = c;
        }

        return new String(charsArray, 0, index);
    }
    public static void main(String[] args) {
        String input = "UnItTeStIng";
        String output= convertToUpperCase(input);
        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }

   
}
