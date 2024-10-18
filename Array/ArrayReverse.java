class ArrayReverse {
    public static void main(String[] args) {
      
        int[] a = {5, 1, 8};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        // for char (Reverse order)
        char[] ch = {'A', 'B', 'C'};
        
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }

        // for byte (Reverse order)
        byte[] b = {1, 2};
        
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }

        // for short (Reverse order)
        short[] s = {2, 3, 5};
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }

        // for long (Reverse order)
        long[] l = {65161561561L, 564564448484L, 54556465465L};
        
        for (int i = l.length - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }

        // for double (Reverse order)
        double[] d = {2.5552d, 5645.5151d, 9849.9849d};
 
        for (int i = d.length - 1; i >= 0; i--) {
            System.out.println(d[i]);
        }

        // for float (Reverse order)
        float[] f = {5.5f, 25.5f, 2.01f};
        
        for (int i = f.length - 1; i >= 0; i--) {
            System.out.println(f[i]);
        }

        // for string (Reverse order)
        String[] s1 = {"Hemant", "Manav", "Shivam"};
       
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.println(s1[i]);
        }

        // for boolean (Reverse order)
        boolean[] b1 = {true, false};

        for (int i = b1.length - 1; i >= 0; i--) {
            System.out.println(b1[i]);
        }
    }
}
