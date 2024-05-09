package javabasics.singleton;

public class SingleTonDemo {

    public  SingletonLazyClassImpl getLazyInstance(){
        return SingletonLazyClassImpl.getInstance();
    }

    public SingleTonEagerImpl getEagerInstance( ) {

        return SingleTonEagerImpl.singleTonEager;
    }


    public static void main(String[] args) {

        SingleTonEagerImpl singleTonEager1=SingleTonEagerImpl.singleTonEager;
        SingleTonEagerImpl singleTonEager2=SingleTonEagerImpl.singleTonEager;


        // we are that the two different class have the same object instance or not
        // if yes then it will a singleton otherwise it will act as a normal class

//        What Is Singleton Class In Java?
//        A singleton class in Java is a special class that allows only one instance (or object) of itself to be created.
//        Imagine it like a unique key that opens a special door. No matter how many times you try to create a new object from a singleton class,
//        you'll always get the same instance that was created initially.

        // Eager Singleton class  instance is created as soon as the class is loaded,
        // ensuring that the instance is always available when needed.

        if(singleTonEager1 == singleTonEager2){
            System.out.println("first class hash code"+singleTonEager1.hashCode());
            System.out.println("second class hash code"+singleTonEager2.hashCode());
            System.out.println();
            System.out.println("Yes it a singleton class with eager initialization");
        }



        // for lazy initialization of singleton class

        SingletonLazyClassImpl singletonLazyClass1=SingletonLazyClassImpl.getInstance();
        SingletonLazyClassImpl singletonLazyClass2= SingletonLazyClassImpl.getInstance();


        if(singletonLazyClass1==singletonLazyClass2){
            System.out.println("first class hash code"+singletonLazyClass1.hashCode());
            System.out.println("second class hash code"+singletonLazyClass2.hashCode());
            System.out.println();
            System.out.println("Yes it a singleton class with lazy initialization");
        }
    }
}
