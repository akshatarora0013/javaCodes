package oops.principle;

public class baseclass {
    int length;
    int breadth;
    int height;

    baseclass(){
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }
    //cube
    baseclass(int side){
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    baseclass(int l , int b , int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    baseclass(baseclass old){
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }
}
