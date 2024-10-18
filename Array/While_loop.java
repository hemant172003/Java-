class While_loop {
    public static void main(String[] args) {

        int[] a = {5, 1, 8};
        
        int i = 0;
        while (i < a.length) {
            System.out.println(a[i]);
            i++;
        }

        // for char 
        char[] ch = {'A', 'B', 'C'};
        
        i = 0;  
        while (i < ch.length) {
            System.out.println(ch[i]);
            i++;
        }

        // for byte 
        byte[] b = {1, 2};

        i = 0;  
        while (i < b.length) {
            System.out.println(b[i]);
            i++;
        }

        // for short
        short[] s = {2, 3, 5};

        i = 0;  
        while (i < s.length) {
            System.out.println(s[i]);
            i++;
        }

        // for long 
        long[] l = {65161561561L, 564564448484L, 54556465465L};
        
        i = 0; 
        while (i < l.length) {
            System.out.println(l[i]);
            i++;
        }

        // for double 
        double[] d = {2.5552d, 5645.5151d, 9849.9849d};
       
        i = 0;  
        while (i < d.length) {
            System.out.println(d[i]);
            i++;
        }

        // for float 
        float[] f = {5.5f, 25.5f, 2.01f};
    
        i = 0;  // reset the counter
        while (i < f.length) {
            System.out.println(f[i]);
            i++;
        }

        // for string 
        String[] s1 = {"Hemant", "Manav", "Shivam"};
    
        i = 0;  // reset the counter
        while (i < s1.length) {
            System.out.println(s1[i]);
            i++;
        }

        // for boolean 
        boolean[] b1 = {true, false};
 
        i = 0;  
        while (i < b1.length) {
            System.out.println(b1[i]);
            i++;
        }
    }
}
