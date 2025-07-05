public class Scope {
    public static void main(String[] args) {
        int a = 10;
        {
             a = 45;
             System.out.println(a);   // block scope
        }
        System.out.println(a);
        // System.out.println(c);

    }

    static void FuncScope(){
        int c = 56;
       // c is accessed only the insisde the given function
       
    }

    
}
