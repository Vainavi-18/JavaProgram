import java.util.*;
public class expense {
    public static void main(String args[])
    {
          expt obj=new expt();
          obj.track();
          
}
}
class expt {
    void track()
    {
        int total=0;
        while(true){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the expense name: ");
        String a = s.nextLine();
        System.out.println("Enter the expense price: ");
        int b= s.nextInt();
        System.out.println("enter a choice : ");
        int c=s.nextInt();
        total+=b;
      if(c==0){
        
            break;
        }
    }
    System.out.println("total expense : "+total);
}
}