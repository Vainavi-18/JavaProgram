import java.util.*;
public class Math {
    public static void main(String[] args) {

        int n = -10;
        int a = 5, b = 8;

        System.out.println("Basic Arithmetic");
        System.out.println(Math.abs(n));
        System.out.println( Math.max(a, b));
        System.out.println( Math.min(a, b));

        // Rounding
        double x = 10.3;
        double y = 4.3;
        
        System.out.println("Rounding");
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println( Math.round(y));

        // Exponents & Roots
        System.out.println("Exponents & Roots");
        System.out.println("Enter two valus for power and root:");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Math.pow(c,d));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(27));

        // Trigonometry (angles in radians)
        System.out.println("Trigonometry");
        Scanner sca = new Scanner(System.in);
        double angle = sca.nextDouble();
        double ang = Math.toRadians(angle);  // converting degrees to radians
        
        System.out.println( Math.sin(ang));
        System.out.println( Math.cos(ang));
        System.out.println(Math.tan(ang));
    }
}