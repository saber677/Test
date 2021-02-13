package day05;

import java.util.Arrays;

/**
 * @author luqiqi
 * @create 2021--07-20:46
 */
public class CompareTest {

    public static void main(String[] args) {
        ComparePractice[] arr=new ComparePractice[4];
        ComparePractice test=new ComparePractice();
        arr[0]=new ComparePractice("dingguo",100);
        arr[1]=new ComparePractice("cuawei",1000);
        arr[2]=new ComparePractice("eiaomi",90);
        arr[3]=new ComparePractice("appo",90);

        Arrays.sort(arr,test);
        test.MySelf(arr);



    }
}
