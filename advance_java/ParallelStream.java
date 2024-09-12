import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ParallelStream {
    public static void main(String[] args) {
         //suppose we have too many values in an array 
        int size = 10000;
        List<Integer> list = new ArrayList<>(size);
        Random ran = new Random();
        for(int i=0;i<size;i++){
            list.add(ran.nextInt(100));
        }
        // // befpre delay the stream is faster than parallel stream as parallel stream create thread first

        // long startSeq = System.currentTimeMillis();
        // int sum1 = list.stream().map(i->i*2).mapToInt(i->i).sum();
        // long endSeq = System.currentTimeMillis();

        // long startPara = System.currentTimeMillis();
        // int sum2 = list.parallelStream().map(i->i*2).mapToInt(i->i).sum();
        // long endPara = System.currentTimeMillis();
        // //currently without delay the sequense stream is faster but what if we apply the delay on the map
        // System.out.println(sum1+"-"+sum2);
        // System.out.println("Seq"+"-"+(endSeq-startSeq));
        // System.out.println("Parallel"+"-"+(endPara-startPara));
        // output:9894786-9894786
        // Seq-13
        // Parallel-26
        

        // parallel stream is faster than normal stream if a delay is provided

        long startSeq = System.currentTimeMillis();
        int sum1 = list.stream().map(i->{
            try{Thread.sleep(1);}catch(Exception e){}
            return i*2;
        }).mapToInt(i->i).sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum2 = list.parallelStream().map(i->{
            try{Thread.sleep(1);}catch(Exception e){}
            return i*2;
        }).mapToInt(i->i).sum();
        long endPara = System.currentTimeMillis();
        //currently without delay the sequense stream is faster but what if we apply the delay on the map
        System.out.println(sum1+"-"+sum2);
        System.out.println("Seq"+"-"+(endSeq-startSeq));
        System.out.println("Parallel"+"-"+(endPara-startPara));
        //output after the delay
        //986800-986800
        // Seq-10828
        // Parallel-1346
    }
}
