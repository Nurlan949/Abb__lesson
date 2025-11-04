package practices_1.practica_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Elephant> elephant = new ArrayList<>();
//        Stack<Elephant> elephantStack = new Stack<>();
        Set<Elephant> elephantSet = new HashSet<>();


        Elephant elephantA = new Elephant("qbdo", "black", 10);
        Elephant elephantB = new Elephant("qbdo", "blue", 15);
        Elephant elephantC = new Elephant("fwef", "green", 5);
        Elephant elephantD = new Elephant("fwef", "green", 5);

//        elephantStack.push(elephantA);
//        elephantStack.push(elephantB);
//        elephantStack.push(elephantC);
//        System.out.println(elephantStack.pop());
//        System.out.println(elephantStack.peek());
//
        elephantSet.add(elephantA);
        elephantSet.add(elephantB);
        elephantSet.add(elephantC);
        elephantSet.add(elephantD);
        System.out.println(elephantSet);
//        elephant.add(elephantA);
//        elephant.add(elephantB);
//        elephant.add(elephantC);
//        for (Elephant elephant1 : elephant) {
//            System.out.println(elephant1);
//        }

    }
}
