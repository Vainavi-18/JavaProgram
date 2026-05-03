public class buffer {
    public static void main(String args[]){

        //stringbuffer   //when after task1 executue task2 start to execute after task1 execute because of this it produce expected output compare to actual output
        StringBuffer sbf = new StringBuffer("Hello");

        //append method
        sbf.append(" World");   
        System.out.println("Append: "+sbf);


        //Convert character array → String using loop
        // String s="";
        // char a[] = {'h', 'e', 'l', 'l', 'o'};
        // for(int i=0;i<a.length;i++){
        //     s=s+a[i];
        // }
        // System.out.println(s);


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
        StringBuffer hi = new StringBuffer("     Hello World   ");
        hi.trimToSize();              
        System.out.println(hi);
        
     }
}