package Chapter12ab;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();

    }

    private static void setDemo() {
        //Diamond operator gives date type a set could hold
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");


        System.out.println(fruit.size());
        //Hashsets don't count duplicates for the size such as "lemon" so the index count for this hashset will be 4
        System.out.println(fruit);

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            // iterator lets you keep going through each object in the collection
            // has next means to keep going until set value is false
            //i.next will return whatever type of object is in the collection
            //This loop works on any collection
        }

        for (String item : fruit) {
            System.out.println(item);
        }
        // this loop works barbecue the hashmap date type is a String
// String item is made in the loop it is not pre declared


        fruit.forEach(x -> System.out.println(x));

        // x is a name in the loop that is going to loop through the hashset
// -> is an action for what you to do in the loop

        fruit.forEach(System.out::println);

        //this loops means to call the print ln method and pass in whatever item it is on in the hashset


        /*these loops take a lambda expression a lambda expression is
         a short block of code which takes in
        parameters and returns a value. Lambda expressions are
        similar to methods, but they do not need a name, and
        they can be implemented right in the body of a method.
*/
    }

    private static void listDemo() {
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");


        System.out.println(fruit.size());
        System.out.println(fruit);

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : fruit) {
            System.out.println(item);
        }
        fruit.forEach(x -> System.out.println(x));


        fruit.forEach(System.out::println);
    }



    private static void queueDemo() {
        Queue <String>fruit = new LinkedList();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");


        System.out.println(fruit.size());
        System.out.println(fruit);

            var i = fruit.iterator();
        while(i.hasNext()){
                System.out.println(i.next());
            }

        for(String item :fruit){
                System.out.println(item);
            }

        fruit.forEach(x ->System.out.println(x));


        fruit.forEach(System.out::println);

        }
    private static void mapDemo() {
        /*Hashmaps use keys and values they correspond with each other such
        as "apple" is the key and its value is calories which is 95
         */

        //You use .put to add items in a Map

        //A Map is not a collection, so you cant use same methods to loop through it

        //Map you need to provide two data types in the diamond one for the key and one for the value

        // Need to use Wrapper class Interger because it is an object and int is not

        // Hashmaps also dont print duplicate values such as the calories in lemon
        Map<String, Integer> fruitcalories = new HashMap();
        fruitcalories.put("apple", 95);
        fruitcalories.put("lemon", 20);
        fruitcalories.put("banana", 105);
        fruitcalories.put("orange", 45);
        fruitcalories.put("lemon", 17);


        for (var entry: fruitcalories.entrySet()){
            System.out.println(entry.getValue());
        }

fruitcalories.forEach((k,v ) -> System.out.println("Fruit: " + k + "Calories " + v));
// k and v stands for key and value

    }


    }

