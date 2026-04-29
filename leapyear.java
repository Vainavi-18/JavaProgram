public class leapyear {
    public static void main(String args[]){
        int year=2022;

        //  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //     System.out.println(year + " is a Leap Year");
        // } else {
        //     System.out.println(year + " is NOT a Leap Year");
        // }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                }
                else {
                    System.out.println(year + " is NOT a Leap Year");
                }
            } 
            else {
                System.out.println(year + " is a Leap Year");
            }
        } 
        else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }   
}
