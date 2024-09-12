import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTryWithResource {

    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number for Buffer Reader");
        // int number = 0;
        // BufferedReader br = null;
        // try{
        // // InputStreamReader in = new InputStreamReader(System.in);
        // // br = new BufferedReader(in);
        // // optimized way
        // br = new BufferedReader(new InputStreamReader(System.in));
        // number = Integer.parseInt(br.readLine());
        // }catch(IOException e){
        //     System.out.println(e);
        // }finally{
        //     br.close();
        // }


        //now more optimized approach is that a new try with resouces where dont need to ake finally block but the class should be autocloseable  and buffer reader 
        //  is of nature autocloseable

        
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int number = Integer.parseInt(br.readLine());
        System.out.println(number);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}