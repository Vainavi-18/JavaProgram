import java.util.Random;
public class Rand {
    public static void main(String args[]){
        Random rn = new Random();

        //integer
        int a = rn.nextInt(1000);
        System.out.println(a);

        //boolean
        boolean b = rn.nextBoolean();
        System.out.println(b);

        //double
        double c = rn.nextDouble();
        System.out.println(c);

        //gaussian
        double d = 10+(2*rn.nextGaussian());
        System.out.println(d);
    }
}
