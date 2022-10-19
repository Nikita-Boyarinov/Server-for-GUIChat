public class MultiThread {
    public static void main(String[] args) {
        MyRunnableClass runnableClass = new MyRunnableClass();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }
}

class MyRunnableClass implements Runnable{
    @Override
    public void run() {
        // многопоточно
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        // многопоточно
    }
}
