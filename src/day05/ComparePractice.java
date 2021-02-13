package day05;

import java.util.Comparator;

/**
 * @author luqiqi
 * @create 2021--07-20:47
 */
public class ComparePractice implements Comparator {
    private String name;
    private double price;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPricee(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public ComparePractice(){

    }
    public ComparePractice(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void MySelf(ComparePractice[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].getName()+" "+arr[i].getPrice());
        }
    }


    ///////////////方式一：实现Comparable接口 重写compareTo（）方法
//    @Override
//    public int compareTo(Object o) {
//        if(o instanceof ComparePractice){
//            ComparePractice str=(ComparePractice)o;
//            if(this.getPrice()>str.getPrice()){
//                return 1;
//            }else if(this.getPrice()<str.getPrice()){
//                return -1;
//            }else {
//                return this.getName().compareTo(str.getName());
//            }
//        }
//        throw new RuntimeException("你输错了傻逼");
//    }
//*****************************

    ///////////方式二：实现Comparator接口，重写compare（）方法
public int compare(Object o1, Object o2) {
    if(o1 instanceof ComparePractice&& o2 instanceof ComparePractice){
        ComparePractice c1=(ComparePractice) o1;
        ComparePractice c2=(ComparePractice) o2;
        if(c1.getPrice()>c2.getPrice()){
            return -1;
        }else if(c1.getPrice()<c2.getPrice()){
            return 1;
        }else {
            return  c1.getName().compareTo(c2.getName());
        }
    }
    throw new RuntimeException("wocanima");
}

}
