package javabasics.singleton;

import com.sun.source.tree.BreakTree;

public class SingletonLazyClassImpl {

    private  static SingletonLazyClassImpl singletonLazyClass;

   // reason behind marking constructor as  private member is that only the class member can use this function
    // no instance can be created and initialized using constructors
    // instead of that we create a sub function to do that
    // instead of that we create a sub function to do that
    private SingletonLazyClassImpl(){

    }

    public static SingletonLazyClassImpl getInstance() {
       if(singletonLazyClass==null){
           singletonLazyClass=new SingletonLazyClassImpl();
       }
       return singletonLazyClass;
    }

}
