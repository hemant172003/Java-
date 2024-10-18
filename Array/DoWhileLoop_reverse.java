class DoWhileLoop_reverse {
    public static void main(String[] args) {

        // for int
        int[] a = {5, 1, 8};
        int i = a.length - 1;
        do {
            System.out.println(a[i]);
            i--;
        } while (i >= 0);

        // for char
        char[] ch = {'A', 'B', 'C'};
        i = ch.length - 1;
        
        do {
            System.out.println(ch[i]);
            i--;
        } while (i >= 0);

        // for byte
        byte[] b = {1, 2};
        i = b.length - 1;
       
        do {
            System.out.println(b[i]);
            i--;
        } while (i >= 0);

        // for short
        short[] s = {2, 3, 5};
        i = s.length - 1; 
       
        do {
            System.out.println(s[i]);
            i--;
        } while (i >= 0);

        // for long
        long[] l = {65161561561L, 564564448484L, 54556465465L};
        i = l.length - 1;  
        
        do {
            System.out.println(l[i]);
            i--;
        } while (i >= 0);

        // for double
        double[] d = {2.5552d, 5645.5151d, 9849.9849d};
        i = d.length - 1;  
       
        do {
            System.out.println(d[i]);
            i--;
        } while (i >= 0);

        // for float
        float[] f = {5.5f, 25.5f, 2.01f};
        i = f.length - 1;  
       
        do {
            System.out.println(f[i]);
            i--;
        } while (i >= 0);

        // for string
        String[] s1 = {"Hemant", "Manav", "Shivam"};
        i = s1.length - 1; 
        
        do {
            System.out.println(s1[i]);
            i--;
        } while (i >= 0);

        // for boolean
        boolean[] b1 = {true, false};
        i = b1.length - 1;
      
        do {
            System.out.println(b1[i]);
            i--;
        } while (i >= 0);
    }
}
