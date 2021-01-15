import Interfaces.Flyable;

public class Eagle extends Bird implements Flyable {

    public void Fly(){
        super.fly();
        System.out.println("Eagle is Flapping wings and taking off....");
    }

//    public static void main(String[] args)
//    {
////        System.out.println("hello world");
//
//    }
}
