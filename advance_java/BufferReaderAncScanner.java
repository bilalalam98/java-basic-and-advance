import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BufferReaderAncScanner {

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        //here people think print is method of system class 
        //but println is the method of printStream
        //basically out is the object of printStream class but this object is created as static reference variable in System class

        //now lets take an input form user



        // so as we know if we have out object maybe there will be an in object too but how to get it
        //but there are the chances it throw IOException so for that lets wrap it in try catch also this only allows me to use only one character also 
        // on entering the 'A' i got '97' this means this  the below funciton returns the ascii value of the character so to get the vlaue we can subtract 48 from it
        System.out.println("Enter a number for read()");
        try{
            int number = System.in.read();
        }
        catch(IOException e){
            System.out.println(e);
        }






         // but what if i want to  add multiple characters we have to use loop but java gives us a class to hand;e it 
         //  BufferedReader br = new BufferedReader(in:null) bvut its asking for parameter in and then the inputStreamReader also wants the in paramter 
         //so we will pass System.in to it but buffer reader is actually the resource so we have to close it after completing work 
    
        // we can take file ,system keyboard, network or anywhere as it uses input stream 
        System.out.println("Enter a number for Buffer Reader");
        try{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int num = Integer.parseInt(br.readLine());
        br.close();
        }catch(IOException e){
            System.out.println(e);
        }






        // now the more modern and better approach is using scanner which also takes system.in as a parameter
        System.out.println("Enter a number for scanner");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        // Scanner sc = new Scanner(System.in);
    }
}
