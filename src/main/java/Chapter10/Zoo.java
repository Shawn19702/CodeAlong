package Chapter10;

public class Zoo {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makesound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makesound();
        feed(sasha);

        sasha = new Cat();
        sasha.makesound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    public static void feed(Animal animal){

        if (animal instanceof Dog){
            System.out.println("here's your dog food");
        }else if (animal instanceof Cat){
            System.out.println("here's your cat food");
        }

    }
}
