import java.util.Scanner;
public class todolist {
    public static void main(String[] args) {
        todolist1 b = new todolist1();
        b.todo();
    }
}

class todolist1{
     void todo(){
        System.out.println("Enter a message:");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.isBlank()){
            System.out.println("No message entered");
        return;
        } 
        else 
            System.out.println("Your message: " + a);
        System.out.println("thank you for your message");  
          
    }
}
