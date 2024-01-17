public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int array[] = allIndexOf("MMMM", 'M');
        for(int i=0 ; i<array.length ; i++){
        System.out.println(array[i]);
        }
    }

    public static String capVowelsLowRest (String string) {
        String capVowelsLowRest = "";
       for (int i =0 ; i<string.length() ; i++){
        char ch = string.charAt(i);
        if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'|| string.charAt(i) == 'o'|| string.charAt(i) == 'u') {
            ch = (char) (string.charAt(i) - 32);
        } else if ((string.charAt(i)>'A' && string.charAt(i) <'E') || (string.charAt(i)>'E' && string.charAt(i) <'I') || (string.charAt(i)>'I' && string.charAt(i) <'O') || (string.charAt(i)>'O' && string.charAt(i) <'U')|| (string.charAt(i)>'U' && string.charAt(i) <'`')) {
            ch = (char) (string.charAt(i) + 32);
        }else if (string.charAt(i)>=' ' && string.charAt(i)<'A' || string.charAt(i) == '`') {
            ch = (char) (string.charAt(i));
        }
        capVowelsLowRest += (char) (ch);
       }
        return capVowelsLowRest;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for(int i=0 ; i<string.length() ; i++){
            if (string.charAt(i) == chr) {
            count++;
        }
        }
        int[] indexArray = new int [count];
        int index = 0;
        for(int j=0 ; j<string.length(); j++){
            if (string.charAt(j) == chr) {
                indexArray[index]=j;
                index++;
            }
        }
    return indexArray;
}
}