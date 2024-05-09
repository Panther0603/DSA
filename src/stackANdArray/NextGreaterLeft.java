package stackANdArray;

import java.util.Stack;

public class NextGreaterLeft {

    public static   int [] getNextLeftIndex(int arr[],int n){

        int [] NGL =new int[n];
        Stack<Integer>  stack= new Stack<>();

        for(int i=0;i<n;i++){
            while( stack.peek() <= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                NGL[i]=-1;
            }else {
                NGL[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return  NGL;
    }



}
