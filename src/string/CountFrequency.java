package string;

import java.util.Scanner;

public class CountFrequency {

    public static  void printFrequency(String input){
        int frequency[]= new int[256];
       for(char ch:input.toCharArray()){
           frequency[ch]=frequency[ch]+1;
       }

       for(int i=0;i<256;i++){

           //System.out.println("Hello");
         if(frequency[i]!=0){
             System.out.println((char)(i)+" ->"+frequency[i]);
         }
       }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String  input= sc.nextLine();
        printFrequency(input);
    }
}
