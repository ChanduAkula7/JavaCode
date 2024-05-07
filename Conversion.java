public class Conversion {

 public static String convertToLower(String input) {
 
        char[] chars = new char[input.length()];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            chars[index++] = c;
        }

        return new String(chars, 0, index);
    }
    public static void main(String[] args) {
        String inputString = "UnitTesting";
        String output= convertToLower(inputString);
        System.out.println("Input String: " + inputString);
        System.out.println("Output String: " + outputString);
    }

   
}
