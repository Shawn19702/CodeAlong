package Chapter10;

public class Cat extends Animal{
    @Override
    public void makesound(){
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("I am a cat. I scratch things");
    }
}
