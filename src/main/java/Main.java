import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        System.out.println("input \"1\" for OutOfMemoryError in java heap memory space.\n" +
                "input \"2 or any command\" for OutOfMemoryError in permanent memory space." );

        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        if(command.equals("1")) {
            for (int i = 0; i < 100; i++) {
                new Thread(new HeapSpaceExceptionThrower()).start();
            }
        }else{
            new PermanentSpaceExceptionThrower();
        }
    }

}
