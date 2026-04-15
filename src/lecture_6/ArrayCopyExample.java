package lecture_6;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};


//        int[] copiedArray = new int[originalArray.length];

        // Using arraycopy method to copy elements
//        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        int[] copiedArray = originalArray.clone();

        copiedArray[0] = 10;



        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Copied Array:");
        printArray(copiedArray);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
