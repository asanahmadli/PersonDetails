package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {

        // create a `counter`
        int counter = 0;
        StringBuilder result = new StringBuilder();
        while (counter < personArray.length) {

            Person currentPerson = personArray[counter];
            String str = currentPerson.toString();
            result.append(str);
            counter++;
        }
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result.toString();
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        int counter = 0;
        for (int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            String str = currentPerson.toString();
            result += str;
            counter++;
        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        return result;
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        int counter = 0;
        String[] str = new String[personArray.length];
        for (String a : str) {
            Person p = personArray[counter];
            result += p.toString();
            counter++;
        }
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
