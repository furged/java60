package Unit2;

public class Thread2 extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0)
                    System.out.println(i);
                Thread.sleep(2000);
            }}
            catch(InterruptedException e) {
                System.out.println(e.getMessage());

        }
    }
}
