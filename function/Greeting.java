import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        int ans = sum2(2,4);
        System.out.println("The sum is: " + ans);
    }
// return the value
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number : ");
        int n = sc.nextInt();
        System.out.println("enter your second number : ");
        int m = sc.nextInt();
        int sum = n + m;
        return sum;
    }

    // passing the arguments 
    static int sum2(int n, int m){
        int sum = n + m;
        return sum;
    }
}
