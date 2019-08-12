package com.adminos.algorythms;

import java.util.List;


public interface Square {

    List<String> calculdadate(Integer e, String t);


     default  void doctorStrange(Integer e, String t) {
        System.out.println(calculdadate(e, t));
    }


}
