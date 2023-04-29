package multithreading;

import java.time.LocalDateTime;

public class sumdemo {
    public static void main(String[] args) {
        sumOfAddition s1=new sumOfAddition(1,Integer.MAX_VALUE/2);
        sumOfAddition s2=new sumOfAddition(Integer.MAX_VALUE/2+1,Integer.MAX_VALUE);
     LocalDateTime strattime=LocalDateTime.now();
        System.out.println("counting start "+strattime);
        s1.add();
        s2.add();
        LocalDateTime endtime=LocalDateTime.now();
        System.out.println(" counting complete " +endtime);
    }
}
