package javabasics.singleton;

public class SingletonClassDemo2 {


    public static void main(String[] args) {
        // in this we also call the same Singleton class instance ,
        // we will check weather the object are same or not


        SingleTonDemo singleTonDemo= new SingleTonDemo();
        SingletonLazyClassImpl singletonLazyClass=SingletonLazyClassImpl.getInstance();
        SingletonLazyClassImpl singletonLazyClass1=singleTonDemo.getLazyInstance();

        if(singletonLazyClass==singletonLazyClass1){
            System.out.println("Yes it a singleton class with lazy initialization with another class reference also");
        }

        SingleTonEagerImpl singleTonEager= SingleTonEagerImpl.singleTonEager;
        SingleTonEagerImpl singleTonEager1=singleTonDemo.getEagerInstance();

        if(singleTonEager==singleTonEager1){
            System.out.println("Yes it a singleton class with eager initialization with another class reference also");
        }
    }
}
