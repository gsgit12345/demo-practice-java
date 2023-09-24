package org.example.memoryleak;

import java.util.ArrayList;
import java.util.List;

public class memoryleak {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
      //  Log.info("Debug Point 2");
    }

    public static void main(String[] args) {
       // Log.info("Debug Point 1");
       // new memoryleak().populateList();  //here memory leak possible due to static field
        //Log.info("Debug Point 3");
    }

}
