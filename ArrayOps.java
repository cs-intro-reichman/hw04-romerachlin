public class ArrayOps {
    public static void main(String[] args) {
        int[] x = new int[]{3, 0, 1};

        System.out.println(findMissingInt(x));
        System.out.println(findMissingInt(new int[] {0, 1, 2, 3, 4, 6}));
    }
    
    public static int findMissingInt (int [] array) {
       for (int toBeFound= 0; toBeFound<=array.length ; toBeFound++) {
        if (!contains(array, toBeFound)) {
            return toBeFound;
        }
       }

       return -1;
    }

    public static boolean contains(int[] array, int toFind) {
        for (int j=0; j<array.length;j++) {
            if (toFind == array[j]) {
                return true;
            }
        }

        return false;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i<array1.length; i++) {
            if (!contains(array2, array1[i])) {
                return false;
                }
            }
        for (int j = 0; j<array2.length; j++) {
        if (!contains(array1, array2[j])) {
            return false;
        }
    }
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
