public class Swap {
    public static void main(String[] args) {
     

       exchange(5, 8);
      
        


    }

    static void exchange(int a , int b){
        int temp = a; // store the value of a in temp
        a = b;  // store the value of b in a
        b = temp; // store the value of temp in b
        System.out.println("a : " + a ); 
        System.out.println("b : " + b ); 
    }
}
