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

    }

}
