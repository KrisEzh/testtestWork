package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {




    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); //Создаем лист
        names.add("Bob");
        names.add("Anna");
        names.add("Dave");   //Добавляем в него имена


        List<String> result = new ArrayList<>(); //Создаем лист, который будет результатом
        for (String name : names) {              //Проходимся по нашему листу с именами
            String s = name.substring(0, 0) + name.substring(1);  //В листе с именами работаем с каждой строкой
            result.add(s);                                        //Получившуюся строку добавляем в список result
        }
        Collections.sort(result);              //Сортируем наш новый лист
        System.out.println(result);            //Выводим в консоль

    }





}

