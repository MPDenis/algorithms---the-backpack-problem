package ClassWork;

public class Recursion {

    private static void iterPrint(int i) {
        while (i >= 0)
            System.out.print(i-- + " ");
    }

    private static void recPrint(int i) {
        if (i >= 0) {
            System.out.print(i + " ");
            recPrint(--i);
        }
//        System.out.print(" rec" + i);
    }

    private static void shiftArray(char[] a, int size) {
        int i;
        int pos = a.length - size;
        char temp = a[pos];
        for (i = pos + 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[i - 1] = temp;
    }

    private static void getAnagram(char[] a, int size) {
        if (size == 1)
            return;
        for (int i = 0; i < size; i++) {
            getAnagram(a, size - 1);
            if (size == 2)
                System.out.print(String.copyValueOf(a) + " ");
            shiftArray(a, size);
        }
    }

    private static int binRecSearch(int[] a, int value, int low, int high) {
        int mid = (low + high) / 2;
        if (a[mid] == value)
            return mid;
        else if (low > high)
            return -1;
        else {
            if (value < a[mid])
                return binRecSearch(a, value, low, mid);
            else
                return binRecSearch(a, value, mid + 1, high);
        }
    }

    public static int getIndex(int[] a, int value) {
        return binRecSearch(a, value, 0, a.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(getIndex(arr, 3));

//        String input = "Master";
//        char[] arr = input.toCharArray();
//        getAnagram(arr, arr.length);

//        iterPrint(10);
//        System.out.println();
//        recPrint(3);
//        System.out.println();
//        System.out.println("HelloWorld");

    }

}
