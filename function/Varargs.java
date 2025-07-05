import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,6,7,9,67,34);
        
    }

    static void fun(int ...v){
System.out.println(Arrays.toString(v));
    }
}
