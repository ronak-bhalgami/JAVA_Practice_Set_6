//This program is done by Ronak Bhalgami(21CE009)
import java.lang.Thread;
class MyThreadA extends Thread
{
    public void run()
    {
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World");
        }
        System.out.println("End of MyThreadA");
    }
}
public class Thread_HelloWorld {
    public static void main(String[] args) {
        MyThreadA T1 = new MyThreadA();
        T1.start();
    }
    
}