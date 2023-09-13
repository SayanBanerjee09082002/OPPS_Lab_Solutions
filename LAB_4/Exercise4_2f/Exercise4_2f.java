package LAB_4.Exercise4_2f;

class Exercise1 {
    public static int[] cloneArray(int[] arr) {
        int[] clone = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            clone[i] = arr[i];
        return clone;
    }

    public static int[] cloneArray(int[] arr, int len) {
        int[] clone = new int[len];

        if (len < 0 || len > arr.length)
            throw new IllegalArgumentException("Invalid subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i];

        return clone;
    }

    public static int[] cloneArray(int[] arr, int start, int len) {
        int[] clone = new int[len];

        if (start < 0 || start >= arr.length || len < 0 || start + len > arr.length)
            throw new IllegalArgumentException("Invalid start index or subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i + start];

        return clone;
    }

    public static double[] cloneArray(double[] arr) {
        double[] clone = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
            clone[i] = arr[i];
        return clone;
    }

    public static double[] cloneArray(double[] arr, int len) {
        double[] clone = new double[len];

        if (len < 0 || len > arr.length)
            throw new IllegalArgumentException("Invalid subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i];

        return clone;
    }

    public static double[] cloneArray(double[] arr, int start, int len) {
        double[] clone = new double[len];

        if (start < 0 || start >= arr.length || len < 0 || start + len > arr.length)
            throw new IllegalArgumentException("Invalid start index or subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i + start];

        return clone;
    }

    public static float[] cloneArray(float[] arr) {
        float[] clone = new float[arr.length];
        for (int i = 0; i < arr.length; i++)
            clone[i] = arr[i];
        return clone;
    }

    public static float[] cloneArray(float[] arr, int len) {
        float[] clone = new float[len];

        if (len < 0 || len > arr.length)
            throw new IllegalArgumentException("Invalid subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i];

        return clone;
    }

    public static float[] cloneArray(float[] arr, int start, int len) {
        float[] clone = new float[len];

        if (start < 0 || start >= arr.length || len < 0 || start + len > arr.length)
            throw new IllegalArgumentException("Invalid start index or subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i + start];

        return clone;
    }

    public static char[] cloneArray(char[] arr) {
        char[] clone = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            clone[i] = arr[i];
        return clone;
    }

    public static char[] cloneArray(char[] arr, int len) {
        char[] clone = new char[len];

        if (len < 0 || len > arr.length)
            throw new IllegalArgumentException("Invalid subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i];

        return clone;
    }

    public static char[] cloneArray(char[] arr, int start, int len) {
        char[] clone = new char[len];

        if (start < 0 || start >= arr.length || len < 0 || start + len > arr.length)
            throw new IllegalArgumentException("Invalid start index or subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i + start];

        return clone;
    }

    public static boolean[] cloneArray(boolean[] arr) {
        boolean[] clone = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++)
            clone[i] = arr[i];
        return clone;
    }

    public static boolean[] cloneArray(boolean[] arr, int len) {
        boolean[] clone = new boolean[len];

        if (len < 0 || len > arr.length)
            throw new IllegalArgumentException("Invalid subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i];

        return clone;
    }

    public static boolean[] cloneArray(boolean[] arr, int start, int len) {
        boolean[] clone = new boolean[len];

        if (start < 0 || start >= arr.length || len < 0 || start + len > arr.length)
            throw new IllegalArgumentException("Invalid start index or subarray length");

        for (int i = 0; i < len; i++)
            clone[i] = arr[i + start];

        return clone;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArray(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void printArray(boolean[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

public class Exercise4_2f {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] clone1 = Exercise1.cloneArray(arr);
        int[] clone2 = Exercise1.cloneArray(arr, 4);
        int[] clone3 = Exercise1.cloneArray(arr, 3, 5);

        System.out.print("Clone1 = ");
        Exercise1.printArray(clone1);
        System.out.println("");
        System.out.print("Clone2 = ");
        Exercise1.printArray(clone2);
        System.out.println("");
        System.out.print("Clone3 = ");
        Exercise1.printArray(clone3);
    }
}
