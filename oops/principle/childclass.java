package oops.principle;

public class childclass extends baseclass{
    int weight;

    childclass(){
        weight = -1;
    }

    childclass(int l, int b, int h, int weight) {
        super(l, b, h);
//        this.length = l;
//        this.breadth = b;
//        this.height = h;
        this.weight = weight;
    }

}
