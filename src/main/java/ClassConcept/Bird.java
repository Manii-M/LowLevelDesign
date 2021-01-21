package ClassConcept;

import ClassConcept.Interfaces.Flyable;

abstract class Bird{
    private String BirdName;
    private String BirdColor;

    public String getBirdName(){
        return BirdName;
    }

    public void setBirdName(String birdName) {
        BirdName = birdName;
    }

    public String getBirdColor() {
        return BirdColor;
    }

    public void setBirdColor(String birdColor) {
        BirdColor = birdColor;
    }

    public void fly(){
        System.out.println(this.getBirdName()+ "Bird stasurted flying ");
    }

    public static void main(String[] args)
    {
        KingFisher k = new KingFisher();
        k.setBirdName("Eagle");
        k.setBirdColor("Brown");
        k.Fly();
        Eagle e = new Eagle();
        e.Fly();
        Bird b = new KingFisher();
        Seller s = new Seller();
        s.sell(b);//based on the type it will call the sell methods
        s.sell(b);//runtime polymorphism
        Flyable f = new Eagle();
        s.sell(f);
    }


}