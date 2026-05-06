public class classes {
    public static void main(String args[]){
        samp o=new samp();
        samp o2=new samp();
        // o.add();
        o.a=50;
        o2.a=150;
        o.b=100;
        o2.b=200;
        System.out.println(o.a);
        System.out.println(o.b);
        System.out.println(o2.a);
        System.out.println(o2.a);
    }   
}
class samp {
    int a=20;
    static int b=30;
    void add(){
        int a=10;
        System.out.println(a);
    }
}
