package day05;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author luqiqi
 * @create 2021--12-14:59
 */
public class SpecialTest {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet(new Employee());
        Employee e1=new Employee("liudehu",55,new Day05Test(1997,1,18));
        Employee e2=new Employee("caonima",51,new Day05Test(1998,9,18));
        Employee e3=new Employee("canimba",50,new Day05Test(1997,8,12));
        Employee e4=new Employee("wangtong",15,new Day05Test(1999,3,18));
        Employee e5=new Employee("awei",5,new Day05Test(1997,9,28));

        tree.add(e1);
        tree.add(e2);
        tree.add(e3);
        tree.add(e4);
        tree.add(e5);
//   //迭代器
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("**************************************");

        ////foreach方法 结果是错误的
//        for (Object object:tree){
//            System.out.println(tree);
//        }

    }
}

