package stackANdArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextSmallestLeft {

    public  static  int [] getNextSmallestElementLeft(int arr[],int n){

        int []NSL= new int[n];
        Stack<Integer> stack= new Stack<>();
        for(int i =0;i<n;i++){
            if (!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                NSL[i]=-1;
            }else {
                NSL[i]=arr[i];
            }
            stack.push(arr[i]);
        }
        return  NSL;
    }

    public  static List<Integer>  getNextSmallestElement(int arr[],int n){

        List<Integer> NSL= new ArrayList<>();
        Stack<Integer> stack= new Stack<>();
        for (int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
            NSL.add(-1);
            }else {
                NSL.add(arr[i]);
            }
            stack.push(arr[i]);
        }
        return  NSL;
    }

    public static void main(String[] args) {

    }
}

