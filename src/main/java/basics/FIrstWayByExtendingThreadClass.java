package basics;


import java.util.concurrent.TimeUnit;

public class FIrstWayByExtendingThreadClass {
    public static void main(String[] args) {

        System.out.println("Main thread start here");
        MyFirstTask myFirstTask= new MyFirstTask();
        MyFirstTask anotherTask= new MyFirstTask();
        System.out.println("Main thread End here");
    }

}

class MyFirstTask extends Thread{

    private static int count;
    private  int id;

    public MyFirstTask(){
        id=count++;
        this.start();
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Id"+id+"Lorem Ipsum:"+i);
            try {
                TimeUnit.NANOSECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
