public class FunctionOverloading{
    public static void main(String[] args) {
        fun(2,4);
        fun(3,5,8);
    }

    static void fun(int a, int b){
        int sum = a + b;
      System.out.println(sum);
       
    }

    static void fun(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
       
    }
}