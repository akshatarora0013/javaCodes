package oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
     private int[] data;
     private static int DEFAULT_SIZE = 10;
     private int size = 0;

      public CustomArraylist(){
          this.data = new int[DEFAULT_SIZE];
      }

      public void add(int num){
          if (this.isFull()){
              resize();
          }
          data[size++] = num;
      }
      public int remove(){
          int removed = data[--size];
          return removed;
      }
      public int get(int index){
          return data[index];
      }
      public void set(int index , int value){
          data[index] = value;
      }

      private boolean isFull() {
          return size == data.length;
      }

      private void resize(){
          int[] temp = new int[data.length*2];
          for (int i = 0; i < data.length; i++) {
              temp[i] = data[i];
          }
          data = temp;
      }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


    }
}
