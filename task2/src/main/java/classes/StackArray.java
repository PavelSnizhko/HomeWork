package classes;

import java.util.Arrays;

public class StackArray implements ArrayMethods {
   int maxSize;
   int [] array;
   private int top;

   public StackArray(int size){
       maxSize = size;
       array = new int[size];
       top = -1;
   }

   public boolean isEmpty(){
       return (top == -1);
   }

   public  void put(int a){
       int i = ++top;
       array[i] = a;
   }

   public int pop(){
       if (isEmpty()){
           System.out.println("Stack is empty");
            return 0;
       }
       else return array[top--];//потом буде перезапис не потрібно видаляти
   }

   public int get(){
       if (isEmpty()){
           System.out.println("Stack is empty");
           return 0;
       }
       else return array[top];
   }
    @Override
    public  String toString(){
        return maxSize +" "+ Arrays.toString(array) +" "+top;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(4);
        s.put(1);
        s.put(3);
        System.out.println(s.toString());
    }
}
