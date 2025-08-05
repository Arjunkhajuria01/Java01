//this loop is exactly similar to While loop except the fact it is bounded to execute atleast once.
public class Do_While_Loop_16 {
    public static void main(String[] args) {
        //for eg u have created a while loop , in which the first condition becomes false and there is nothing executed
        // so do while loop will execute the condition at least onve
        int b= 10;
        do{
            System.out.println("I GOT EXECUTED");
b++;
        }while(b<5);
    }
}
