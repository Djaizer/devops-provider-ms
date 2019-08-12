package com.adminos.algorythms;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class BasicAlgorythms {

    public static void main(String[] args) {
        System.out.println("eee");
        System.out.println("factorial: " + factorial(6));
        personalFunction((e, t) -> asList((e + t).split("")));

    }

    static long factorial(int i) {
        return i == 1 ? i :  i * factorial(--i);
    }

    static void personalFunction(Square r){
      r.doctorStrange(4, "rrrta");
    }

    static void foo(List<String> list) {
     list.stream().filter(String::isEmpty).collect(Collectors.toList());
          }




    static void bubbleSorting(Integer [] arr) {
      //  for(int i = 0)
    }

}
