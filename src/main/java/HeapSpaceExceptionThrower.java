import java.util.LinkedList;

public class HeapSpaceExceptionThrower implements Runnable {

    String theLongestStringEver;


    public void run() {

        for(int s = 0; s < 15; s++){
            theLongestStringEver = theLongestStringEver + theLongestStringEver + "This is the longest string I have ever seen ... ";
        }


        for (int a = 0; a < 100000; a++) {
            LinkedList<String> list = new LinkedList<String>();
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10000; i++) {
                list.add(list.size()/2,theLongestStringEver);
            }
        }
    }
}
