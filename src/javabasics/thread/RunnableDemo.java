package javabasics.thread;

public class RunnableDemo
{

    public static void main(String[] args) {


        System.out.println("Hello");

        for(int i=0;i<5;i++){
            Thread thread1= new Thread(new RunnableImpl(i));
            if(i==1){
                thread1.setPriority(Thread.MAX_PRIORITY);
            }
            if(i==4){
                thread1.setPriority(Thread.MIN_PRIORITY);
            }
            thread1.start();
        }

        System.out.println("World");



    }
}
