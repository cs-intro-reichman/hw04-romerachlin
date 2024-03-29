import java.util.Arrays;

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
        int array[] = allIndexOf("Hello world", 'l');
        int array1[] = allIndexOf("Hello world", 'o');
        int array2[] = allIndexOf("Hello world", ' ');
        int array3[] = allIndexOf("MMMM", 'M');
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
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
        String s = "";
     int k = 0;
     while((string.charAt(k)) == ' '){
     k++;
     }
     if(string.charAt(k) >= 'A' && string.charAt(k) <= 'Z'){  
        s = s + ((char)((string.charAt(k)) + 32));
    }else{
        s = s + (string.charAt(k));
    }
     for( int i = k + 1; i <= (string.length() - 1);i++){
        if(((string.charAt(i))) != ' '){
            if(string.charAt(i-1) == ' '){
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    s = s + (string.charAt(i));
                }else{
                    s = s + ((char)((string.charAt(i)) - 32));
                }
            }else{
                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){  
                    s = s + ((char)((string.charAt(i)) + 32));
                }else{
                    s = s + (string.charAt(i));
                }

                  
            }
        }
     }
    
    return s;

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
                indexArray[index++]=j;
            }
        }
    return indexArray;
}

}