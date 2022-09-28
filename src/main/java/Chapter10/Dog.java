package Chapter10;

public class Dog extends Animal{
    @Override
    public void makesound(){
        System.out.println("woof");
    }
    public void fetch(){
        System.out.println("fetch is fun!");
    }
}
