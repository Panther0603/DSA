package javabasics.thread;

public class MyThreadClassImpl extends Thread{

    public  void run(){

       for(int i=0;i<10;i++){
           System.out.println("Thread run ........... Thread Name is "+Thread.currentThread().getName());
           try{
               Thread.sleep(1000);
           }catch (Exception e){

           }
       }
    }

    public static void main(String[] args) {


        for (int i=0;i<3;i++){
            MyThreadClassImpl myThreadClass= new MyThreadClassImpl();
            myThreadClass.start();
            Thread.currentThread().setName("Thread Name"+i);
        }

    }
}
