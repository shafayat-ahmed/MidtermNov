package math.problems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int fiboSeq[] =new int [40];

        for(int i=0;i<fiboSeq.length;i++){
            if(i<2){
                fiboSeq[i]=i;
            }
            else{
                fiboSeq[i]=fiboSeq[i-2] + fiboSeq[i - 1];
            }
        }

        System.out.println(Arrays.toString(fiboSeq));

    }
}

