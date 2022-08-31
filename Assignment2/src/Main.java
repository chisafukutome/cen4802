public class Main {
    public static void main(String[] args) {
        int nth = 0;
        int num = 10;
        nth = fibonacci(num);
        System.out.println("The " + num + "th term of the Fibonacci sequence is " + nth);
    }//end main method

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } //when n is negative value
        else if (n <= 1) {
            return n;
        }//when n is 0 or 1

        //recursion (call function inside of a function)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }//end fibonacci method

}//end Main Class
