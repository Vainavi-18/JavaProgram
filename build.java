public class build {
    public static void main(String args[]){
         
        //stringbuilder //when task1 is execute before task1 execute task2 start to execute beoz of this it produce wrong output compare to expected output and actual output
        StringBuilder sbf = new StringBuilder("Hello");//Multiple tasks run at same time


        //append method
        sbf.append(" World");   
        System.out.println("Append: "+sbf);

        //reverse method
        sbf.reverse(); 
        System.out.println("Reverse: "+sbf);

        //insert method
        StringBuffer sbc = new StringBuffer("Hello World");
        sbc.insert(1, "Hi");
        System.out.println("Insert: "+sbc);

        //delete method
        sbc.delete(1, 3);
        System.out.println("Delete: "+sbc);

        //replace method
        sbc.replace(0, 2, "Hi");
        System.out.println("Replace: "+sbc);

        //charAt method
        char c = sbc.charAt(2);
        System.out.println("CharAt: "+c);

        //capacity method
        System.out.println("Capacity: "+sbc.capacity());

        //trimtosize
        StringBuffer hi = new StringBuffer("     Hello World");
        hi.trimToSize();              
        System.out.println(hi);
        
     }
}
