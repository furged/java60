package Unit2;

public class MyMain {
    public static void main(String[] args) {
        Thread1 th1= new Thread1();
        Thread2 th2= new Thread2();
        System.out.println(th1.getPriority());
        th1.setPriority(10);
        System.out.println(th1.getPriority());
        System.out.println(th1.getName());
        th1.setName("My thread 1");
        System.out.println(th1.getName());
        th1.start();
        th2.start();
    }
}
