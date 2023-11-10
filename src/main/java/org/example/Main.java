package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

    ISum summer = ( a, b) -> a+b;
    }

    @FunctionalInterface
    public interface ISum {
        public int sum(int a, int b);
    }


}