package org.example.Tests;

import org.example.Calculator.Calculator;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Test {

    private Calculator calculator = new Calculator();

    @org.junit.Test
    public void testSum() {
        ArrayList<Integer> resCalc = new ArrayList<>();
        ArrayList<Integer> resStand = new ArrayList<>();
        for (var i = 0; i < 10; i++) {
            var rnd = new Random();
            Integer first = rnd.nextInt(20);
            Integer second = rnd.nextInt(20);
            resCalc.add(calculator.sum(first, second));
            resStand.add(first + second);
        }
        assertEquals(resStand,resCalc);
    }
    @org.junit.Test
    public void tessProd() {
        ArrayList<Integer> resCalc = new ArrayList<>();
        ArrayList<Integer> resStand = new ArrayList<>();
        for (var i = 0; i < 10; i++) {
            var rnd = new Random();
            Integer first = rnd.nextInt(20);
            Integer second = rnd.nextInt(20);
            resCalc.add(calculator.prod(first, second));
            resStand.add(first * second);
        }
        assertEquals(resStand,resCalc);
    }
    @org.junit.Test
    public void tessSub() {
        ArrayList<Integer> resCalc = new ArrayList<>();
        ArrayList<Integer> resStand = new ArrayList<>();
        for (var i = 0; i < 10; i++) {
            var rnd = new Random();
            Integer first = rnd.nextInt(20);
            Integer second = rnd.nextInt(20);
            resCalc.add(calculator.sub(first, second));
            resStand.add(first - second);
        }
        assertEquals(resStand,resCalc);
    }
}
