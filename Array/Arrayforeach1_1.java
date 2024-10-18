class Arrayforeach1_1 {
    public static void main(String[] args) {
        // for int
        int[] a = {5, 1, 8, 34, 2332};
        for (int num : a) {
            System.out.println(num);
        }

        // for char
        char[] ch = {'A', 'B', 'C', 'D', 'E'};
        for (char c : ch) {
            System.out.println(c);
        }

        // for byte
        byte[] b = {1, 2, 3, 4, 5};
        for (byte num : b) {
            System.out.println(num);
        }

        // for short
        short[] s = {2, 3, 5, 23, 31};
        for (short num : s) {
            System.out.println(num);
        }

        // for long
        long[] l = {65161561561L, 564564448484L, 54556465465L, 98493843L, 9838499393L};
        for (long num : l) {
            System.out.println(num);
        }

        // for double
        double[] d = {2.5552d, 5645.5151d, 9849.9849d, 9394.94839d};
        for (double num : d) {
            System.out.println(num);
        }

        // for float
        float[] f = {5.5f, 25.5f, 2.01f};
        for (float num : f) {
            System.out.println(num);
        }

        // for string
        String[] s1 = {"Shivam", "Hemant", "Manav", "Ram", "Rohit"};
        for (String str : s1) {
            System.out.println(str);
        }

        // for boolean
        boolean[] b1 = {true, false};
        for (boolean bool : b1) {
            System.out.println(bool);
        }
    }
}
