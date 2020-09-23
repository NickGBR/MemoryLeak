import java.io.*;
import java.util.LinkedList;

public class PermanentSpaceExceptionThrower{

   private static LinkedList<Double> list = new LinkedList<Double>();
   private static LinkedList<String> list2 = new LinkedList<String>();
   private static LinkedList<Integer> list3 = new LinkedList<Integer>();


    private String theLongestStringEver = "";

    public PermanentSpaceExceptionThrower(){
        for(int s = 0; s < 99999999; s++){
            if(s%100000==0) {
                System.out.println("Static list getting longer, it has " + s + " elements!");
            }
           list.add(s,Math.random());
           String name = "Name " + s;
           list2.add(s,name);
           list3.add(name.length());
        }
    }
}
