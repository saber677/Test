package day11;

/**
 * @author luqiqi
 * @create 2021--28-19:11
 */
public class Practice  {
    public static void main(String[] args) {

        //创建Runnable实现类的对象
        myThread a=new myThread();
        myThread b=new myThread();
        myThread c=new myThread();

        //创建Thread类的对象，将Runnable实现类的对象作为形参传入
        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }
 }
   class  myThread implements Runnable {
       //////////////////线程0，1，2对应以下数组索引的位置
       int [] test=new int[]{1,1,3};

       //同步监视器
       Foo foo = new Foo();

       public myThread() {
    }

    //重写run()方法
    @Override
    public void run() {

           //获取当前线程的名字
            Thread name=new Thread().currentThread();
            String name2=name.getName();

            //同步代码块
            synchronized (foo){

            //  判断线程是否是Thread-0
            if("Thread-0".equals(name2)){
                if (test[0] == 1) {
                    try {
                        foo.first(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[0] == 2) {
                    try {
                        foo.second(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[0] == 3){
                    try {
                        foo.third(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    throw new RuntimeException("输入的数组只能是1，2，3，"+name2+"线程进不去");
                }
            }

            //判断线程是否是Thread-1
            else if("Thread-1".equals(name2)){
                if (test[1] == 1) {
                    try {
                        foo.first(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[1] == 2) {
                    try {
                        foo.second(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[1] == 3){
                    try {
                        foo.third(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    throw new RuntimeException("输入的数组只能是1，2，3，"+name2+"线程进不去");
                }
            }

            //判断线程是否是Thread-2
            else if ("Thread-2".equals(name2)){
                if (test[2] == 1) {
                    try {
                        foo.first(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[2] == 2) {
                    try {
                        foo.second(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (test[2] == 3){
                    try {
                        foo.third(this);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    throw new RuntimeException("输入的数组只能是1，2，3，"+name2+"线程进不去");
                }
            }
        }
    }
}

////判断类
class Foo {
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        //进来的打印 1
        System.out.println(new Thread().currentThread().getName()+"线程的数组索引是1");
    }

    public void second(Runnable printSecond) throws InterruptedException {
        //进来的打印 2
        System.out.println(new Thread().currentThread().getName()+"线程的数组索引是2");
    }

    public void third(Runnable printThird) throws InterruptedException {
        //进来的打印 3
        System.out.println(new Thread().currentThread().getName()+"线程的数组索引是3");
    }
}
