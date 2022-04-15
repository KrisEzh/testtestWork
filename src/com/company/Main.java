package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {




    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Anna");
        names.add("Dave");

        names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .forEach(name->System.out.println(name));



    }

}

