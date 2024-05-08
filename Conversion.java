class Conversion {

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
       
    public static boolean test1_EmptyString() {
        String input = "";
        String expected = "";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test2_SingleLowerCaseCharacter() {
        String input = "a";
        String expected = "A";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test3_SingleUpperCaseCharacter() {
        String input = "A";
        String expected = "A";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test4_AllLowerCaseCharacters() {
        String input = "hello world";
        String expected = "HELLO WORLD";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test5_AllUpperCaseCharacters() {
        String input = "HELLO WORLD";
        String expected = "HELLO WORLD";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test6_MixOfLowerCaseAndUpperCaseCharacters() {
        String input = "HeLLo WoRLd";
        String expected = "HELLO WORLD";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test7_StringWithSpecialCharacters() {
        String input = "HeLLo@WoRLd!";
        String expected = "HELLO@WORLD!";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test8_StringWithNumbers() {
        String input = "HeLLo123WoRLd";
        String expected = "HELLO123WORLD";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test9_LongString() {
        String input = "This is a very long string ";
        String expected = "THIS IS A VERY LONG STRING "";
        String actual = Conversion.convertToUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean test10_NullInput() {
        String actual = Conversion.convertToUpperCase(null);
        return actual == null;
    }
       public static void main(String[] args) {
  
           
           
           System.out.println("test1_EmptyString: "+test1_EmptyString() );
            System.out.println("test2_SingleLowerCaseCharacter: "+test2_SingleLowerCaseCharacter()  );
            System.out.println("test3_SingleUpperCaseCharacter: "+test3_SingleUpperCaseCharacter() );
            System.out.println("test4_AllLowerCaseCharacters: "+test4_AllLowerCaseCharacters() );
            System.out.println("test5_AllUpperCaseCharacters: "+test5_AllUpperCaseCharacters() );
           System.out.println("test6_MixOfLowerCaseAndUpperCaseCharacters : "+test6_MixOfLowerCaseAndUpperCaseCharacters() );
           System.out.println("ttest7_StringWithSpecialCharacters : "+test7_StringWithSpecialCharacters()  );
           System.out.println("test8_StringWithNumbers: "+test8_StringWithNumbers() );
           System.out.println("test9_LongString: "+test9_LongString() );
            System.out.println(" test10_NullInput: "+ test10_NullInput() );
       }
   
      
   }
