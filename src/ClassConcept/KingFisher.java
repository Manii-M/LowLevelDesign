import Interfaces.Flyable;

public class KingFisher extends Bird implements Flyable {

    public void Fly(){
        super.fly();
        System.out.println("kingfisher is taking off and fly in sky.... ");
    }

}
