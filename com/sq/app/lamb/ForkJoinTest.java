package com.sq.app.lamb;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/27 下午3:58
 * @Version 1.0
 */
public class ForkJoinTest extends RecursiveTask<Long>{

    private Long start;

    private Long end;

    private static final Long TOTAL = 1000L;

   /* public ForkJoinTest(){

    }

    public ForkJoinTest(Long start, Long end) {
        this.start = start;
        this.end = end;
    }
*/
    @Override
    protected Long compute() {
        /*if(end - start <= TOTAL){
            long sum = 0;
            for(Long l = start;l<end;l++){
                sum+= l;
            }
            return sum;
        }else {
            long middle = (end-start)/2;
            ForkJoinTest left = new ForkJoinTest(start,middle);
            left.fork();

            ForkJoinTest right = new ForkJoinTest(middle+1,end);
            right.fork();


            return left.join()+right.join();
        }*/
        return null;
    }

    /*public static void main(String[] args) {
        Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();

        ForkJoinTask<Long> task = new ForkJoinTest(0L,5000L);

        long sum = pool.invoke(task);

        System.out.println("===result===" + sum);

        Instant end = Instant.now();

        System.out.println(Duration.between(start,end).getSeconds());
    }*/

    //@Test
    /*public  void test(){

        Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();

        ForkJoinTask<Long> task = new ForkJoinTest(0L,5000L);

        long sum = pool.invoke(task);

        System.out.println("===result===" + sum);

        Instant end = Instant.now();

        System.out.println(Duration.between(start,end).getSeconds());
    }


    @Test
    public void testParallel(){
        Instant start = Instant.now();

        //并行流计算 累计求和
        Long result = LongStream.rangeClosed(0,1000L).parallel().reduce(0,Long::sum);
        System.out.println(result);



        Instant end = Instant.now();

        System.out.println(Duration.between(start,end).getSeconds());
    }*/
}
