package oops.Generics;

import java.util.Arrays;

public class CustomGENArraylist<T> {
     private Object[] data;
     private static int DEFAULT_SIZE = 10;
     private int size = 0;

      public CustomGENArraylist(){
          this.data = new Object[DEFAULT_SIZE];
      }

      public void add(T num){
          if (this.isFull()){
              resize();
          }
          data[size++] = num;
      }
      public T remove(){
          T removed = (T)data[--size];
          return removed;
      }
      public T get(int index){
          return (T) data[index];
      }
      public void set(int index , int value){
          data[index] = value;
      }

      private boolean isFull() {
          return size == data.length;
      }

      private void resize(){
          Object[] temp = new Object[data.length*2];
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
        CustomGENArraylist<Integer> list = new CustomGENArraylist<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


    }
}
