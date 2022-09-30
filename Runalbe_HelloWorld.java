class MyThreadRunable1 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello World");
        }
        System.out.println("End of MyThreadRunable1");
    }
}

public class Runalbe_HelloWorld {
    public static void main(String[] args) {
        MyThreadRunable1 M1 = new MyThreadRunable1();
        Thread T1 = new Thread(M1);
        T1.start();
    }
}
