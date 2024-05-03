package oops;

public class singleton {
    public static void main(String[] args) {
        help obj1 = help.getInstance();
        help obj2 = help.getInstance();
        help obj3 = help.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
class help{
    private help(){

    }
    private static help instance;
    public static help getInstance(){
        if (instance == null){
            instance = new help();
        }
        return instance;
    }
}
