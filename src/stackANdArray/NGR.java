package stackANdArray;

import java.util.Stack;

public class NGR {


    public  static  int[] getNextGreaterRight(int arr[]) {
        int NGR[] = new int[arr.length];

        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.empty()){
                NGR[i]=-1;
                stack.push(arr[i]);
            }else {
                while(!stack.empty() && stack.peek()<=arr[i]){
                 stack.pop();
                }
                if(stack.empty()){
                    NGR[i]=-1;
                    stack.push(arr[i]);
                }else{
                    NGR[i]=stack.peek();
                    stack.push(arr[i]);
                }

            }
        }
        return NGR;
    }

    public  static int[] getNextSmallest(int arr[]){

        int NSE [] = new int [arr.length];
        Stack<Integer> stack= new Stack<>();
        for (int i=arr.length-1;i>=0;i--){

            while (!stack.isEmpty() && stack.peek()>= arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){

                NSE[i]=-1;
            }else{
                NSE[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return NSE;
    }

    public static int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int val=0;
        int leading=1;
        while(n>=0){
            val = digits[n]+leading;
            if (val >= 10){
                leading = val/10;
                System.out.println(val+" "+leading);
                digits[n]=val%10;

            }else{
                digits[n]=val;
                leading=0;
            }
            n--;
        }


        if(leading>0){
            int digits1[]=new int[digits.length+1];
            digits1[0]=leading;
            for(int i=0;i<digits.length;i++){
                digits1[i+1]= digits[i];
            }
            return digits1;
        }else{
            return digits;
        }

    }

    public static void main(String[] args) {
        int arra[]={9};

//        int NGR[]=getNextGreaterRight(arra);
        int NGR[]=plusOne(arra);


        for (int i=0;i<NGR.length;i++){
            System.out.print(NGR[i]+" ");
        }

       // System.out.println("jjd"+10%10);
    }
}
