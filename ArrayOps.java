public class ArrayOps {
    public static void main(String[] args) {
        int[] x = new int[]{3, 0, 1};

        System.out.println(secondMaxValue(x));
        System.out.println(secondMaxValue(new int[] {0, 1, 2, 3, 4, 6}));

        System.out.println(isSorted(x));
        System.out.println(isSorted(new int[] {6,5,4,3,-12}));
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
        int max = array[0] ;
        int secMax = array[0];
        for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
        max = array[i];
        }
        for (int j=0; j<array.length; j++) {
            if (array [j]< max && array [j] > secMax) {
                secMax = array [j];
            }
        }
    }
    
        return secMax;
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
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                decreasing = true;
            }
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] > array[j - 1]) {
                increasing = true;
            }
        }
        if (increasing&&decreasing) {
            return false;
         } else {
            return true;
         }
   
}
}
