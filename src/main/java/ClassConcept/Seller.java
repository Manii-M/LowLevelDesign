package ClassConcept;

import ClassConcept.Interfaces.Flyable;

public class Seller {
    void sell(Bird b){
        //check based on the bird price and color and name
        System.out.println("inside bird sell");

    }
    void sell(Flyable f){
        System.out.println("inside flyable");
    }
}
