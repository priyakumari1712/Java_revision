public class StringE {
    public static void main(String[] args) {
    //    String mess_send = message();
    //    System.out.println(mess_send);
    
    String personalised = myGreet("priya Kumari");
    System.out.println(personalised);

    }

    //passing the argument-
    static String myGreet(String name){
        String greet = "Hello " + name;
        return greet;
    }

    static String message(){
        String mail = "Hello, this is a message from the function!";
        return mail;
    }
}
