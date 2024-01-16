public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(secondMaxValue(new int[]{2,8,3,7,8}));
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
            int secMax = array[1] ;
        if (array[0]<=array[1]) {    
             max = array[1] ;
             secMax = array[0] ;
        }
        if (array.length>1) {  
        for (int i = 2; i < array.length; i++) {
        if (array[i] >= max) {
        secMax = max ;
        max = array[i];
        } else if (array[i]<max && array[i]>secMax) {
            secMax = array[i];
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
