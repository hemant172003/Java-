class DoWhileLoop {
    public static void main(String[] args) {

        // for int
        int[] a = {5, 1, 8};
        int i = 0;
        do {
            System.out.println(a[i]);
            i++;
        } while (i < a.length);

        // for char
        char[] ch = {'A', 'B', 'C'};
        i = 0;
        
        do {
            System.out.println(ch[i]);
            i++;
        } while (i < ch.length);

        // for byte
        byte[] b = {1, 2};
        i = 0;
       
        do {
            System.out.println(b[i]);
            i++;
        } while (i < b.length);

        // for short
        short[] s = {2, 3, 5};
        i = 0; 
       
        do {
            System.out.println(s[i]);
            i++;
        } while (i < s.length);

        // for long
        long[] l = {65161561561L, 564564448484L, 54556465465L};
        i = 0;  
        
        do {
            System.out.println(l[i]);
            i++;
        } while (i < l.length);

        // for double
        double[] d = {2.5552d, 5645.5151d, 9849.9849d};
        i = 0;  
       
        do {
            System.out.println(d[i]);
            i++;
        } while (i < d.length);

        // for float
        float[] f = {5.5f, 25.5f, 2.01f};
        i = 0;  
       
        do {
            System.out.println(f[i]);
            i++;
        } while (i < f.length);

        // for string
        String[] s1 = {"Hemant", "Manav", "Shivam"};
        i = 0; 
        
        do {
            System.out.println(s1[i]);
            i++;
        } while (i < s1.length);

        // for boolean
        boolean[] b1 = {true, false};
        i = 0;
      
        do {
            System.out.println(b1[i]);
            i++;
        } while (i < b1.length);
    }
}
