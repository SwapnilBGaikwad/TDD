package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    private int no;
    private String s;

    public Greeting() {
    }

    public Greeting(int no) {
        this.no = no;
    }

    public Greeting(String s) {
        this.s = s;
    }

    public String getName() {
        if (s != null) {
            return s;
        }
        return "Greetings from Spring Boot! fact " + fact(no);
    }

    private int fact(int no) {
        int res = 1;
        for (int i = 1; i <= no; i++) {
            res *= i;
        }
        return res;
    }

    @Override
    public String toString() {
        return "toString";
    }
}
