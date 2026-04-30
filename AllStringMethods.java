class AllStringMethods {
    public static void main(String[] args) {

        String s = "  Hello World  ";
        String s2 = "hello world";

        
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

        
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.compareTo(s2));
        System.out.println(s.contains("World"));

       
        System.out.println(s.charAt(1));
        System.out.println(s.substring(2, 7));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));

       
        System.out.println(s.strip());
        System.out.println(s.replace("l", "x"));
        System.out.println(s.repeat(3));
        System.out.println(s.toUpperCase());
        
      
    }
}
