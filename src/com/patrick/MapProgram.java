package com.patrick;

import java.util.HashMap;
import java.util.Map;

//step 1 this class
public class MapProgram {

    //step 2 run our code from this class
    public static void main(String[] args) {

        //step 3 create map object
        //<String, String> = key, value
        Map<String, String> languages = new HashMap<>();
        //step 7
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-orientated, " +
                    "platform independent language");
            System.out.println("Java added successfully");
            System.out.println("#########################################");
        }
        languages.put("Java", "a compiled high level, object-orientated, " +
                "platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming " +
                "language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Thererin lies MADNESS!!");

        //step 4 run
        System.out.println(languages.get("Java"));
        /*result; note called value by key
        a compiled high level, object-orientated, platform independent language
         */

        //step 5 demonstrate value being overwritten, used key to call new messsage
        languages.put("Java", "this is a Java course!");
        System.out.println(languages.get("Java"));
        //run
        /*
        this is a Java course!
         */

        //step 6
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this is a Java course");
            //Java is already in the map
            //note 2nd line is not overwritten
            //add step 7 above to illustrate, then run
            /*
            Java added successfully
            #########################################
            a compiled high level, object-orientated, platform independent language
            this is a Java course!
            Java is already in the map
             */

        }

        System.out.println("==================================================================");
        //step 8 keyset
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
            /*
            Java : this is a Java course!
            BASIC : Beginners All Purpose Symbolic Instruction Code
            Lisp : Thererin lies MADNESS!!
            Python : an interpreted, object-oriented, high-level programming language with dynamic semantics
            Algol : an algorithmic language
             */
            //note random order

        }

    }

}
