package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneDirectory {
    HashMap<String, ArrayList<String>> telephoneDirectory = new HashMap<>();

    public void addPhone(String name, String telephoneNumber){
        if (telephoneDirectory.containsKey(name)) {
            ArrayList<String> number = telephoneDirectory.get(name);
            number.add(telephoneNumber);
            telephoneDirectory.replace(name, number);
        } else {
            ArrayList<String> number = new ArrayList<>();
            number.add(telephoneNumber);
            telephoneDirectory.put(name, number);
        }
    }

    public void getPhone(String name){
        System.out.println(telephoneDirectory.get(name));
    }

}
