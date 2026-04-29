class operators {
    public static void main(String args[]) {

        int a = 4;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println((a + b));
        System.out.println((a - b));
        System.out.println((a * b));
        System.out.println((a % b));
        System.out.println((a / b)); // decimal division

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println((a > b));
        System.out.println((a < b));
        System.out.println((a == b));
        System.out.println((a != b));
        System.out.println((a >= b));
        System.out.println((a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println(((a > b) && (a < b)));
        System.out.println(((a > b) || (a < 5)));
        System.out.println( (!(a > b)));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = a;
        System.out.println(x);

        x += b;
        System.out.println(x);

        x -= b;
        System.out.println(x);

        x *= b;
        System.out.println( x);

        x /= b;
        System.out.println(x);

        x %= b;
        System.out.println( x);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int y = 5;
        System.out.println(++y);
        System.out.println(y++);
        System.out.println(--y);
        System.out.println(y--);

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println( (a & b));
        System.out.println((a | b));
        System.out.println((a ^ b));
        System.out.println((~a));

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int result = (a > b) ? a : b;
        System.out.println(result);

        // Task (Tricky Expression)
        // System.out.println("\nTask Expression:");
        // int temp = a; // keep original value safe
        // int value = temp++ + ++temp + --temp;
        // System.out.println("Result = " + value);
        // System.out.println("Final value of a = " + temp);
    }
}
