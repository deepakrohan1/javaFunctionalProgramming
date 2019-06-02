package com.deepakrohan.lambdas;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Method References
 *
 * 1. Reference to a static Method              | Containing Class :: staticMethodName
 * 2. Reference to an instance method of a
 *      particular object                       | containingObject :: instanceMethodName
 * 3. Reference to an instance method of an
 *      arbitary object of a given type         | containingType :: methodName
 * 4. Refernce to a constructor                 | ClassName:: new
 */
public class MethodReferences {


    public static void main(String[] args) {
        // Regular way of doing this

        String[] nameArray = {"Sam","Olivia","Pter"};

        Arrays.sort(nameArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });

        //Using Lambda
        Arrays.sort(nameArray, ((o1,o2) ->  o1.compareToIgnoreCase(o2)));

        //Method references
        Arrays.sort(nameArray, String::compareToIgnoreCase);

        /**
         * printing the elements of an array
         */

        System.out.println(Arrays.asList(nameArray));

        Arrays.asList(nameArray).forEach(System.out::println);

        Stream.of(nameArray).forEach(System.out::println);


    }
}
