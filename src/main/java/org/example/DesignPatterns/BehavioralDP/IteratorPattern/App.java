package org.example.DesignPatterns.BehavioralDP.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class App {

    /**
     * Iterator pattern is very commonly used design pattern in Java
     * This is used to get a way to access the elements of a collection object in
     * sequential manner without any need to know its underlying representation
     */

    public static void main(String[] args) {

//        NameRepository nameRepository = new NameRepository();

//		for(Iterator iter = nameRepository.getIterator(); iter.hasNext() ; ){
//			String name = (String) iter.next();
//			System.out.println(name);
//		}


        //How it works in Java
        List<String> names = List.of("Ana", "Bela", "Jani");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
