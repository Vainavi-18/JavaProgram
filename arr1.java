import java.util.Arrays;
class arr{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[]=new int[5];   

        //arraycopy method
        //System.arraycopy(a, 0, b, 0, 5);
        // for (int i = 0; i < b.length; i++) {
        //     System.out.println(b[i]);
        
        //copyof method
        // b = Arrays.copyOf(a, 3);

        // for (int i = 0; i < b.length; i++) {
        //     System.out.println(b[i]);

        //clone method
        
        b = a.clone();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}