package day05;

import java.util.Comparator;

/**
 * @author luqiqi
 * @create 2021--12-14:55
 */
public class Employee implements Comparator {
    private  String name;
    private  int age;
    private  Day05Test birthday;

    public Employee() {

    }

    public Employee(String name, int age, Day05Test birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Day05Test birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Day05Test getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee && o2 instanceof Employee){
            Employee e1=(Employee)o1;
            Employee e2=(Employee)o2;

            if(e1.getBirthday().getYear()-e2.getBirthday().getYear()!=0){
                return e1.getBirthday().getYear()-e2.getBirthday().getYear();
            }
            if (e1.getBirthday().getMonth()-e2.getBirthday().getMonth()!=0){
                return e1.getBirthday().getMonth()-e2.getBirthday().getMonth();
            }
                return e1.getBirthday().getDay()-e2.getBirthday().getDay();

        }
        throw new RuntimeException("输入错误");
    }

//    @Override
////    public int compareTo(Object o) {
////        if(o instanceof Employee){
////            Employee e=(Employee)o;
////            return this.getName().compareTo(e.getName());
////        }
////        throw new RuntimeException("****$$$$");
////    }

}
