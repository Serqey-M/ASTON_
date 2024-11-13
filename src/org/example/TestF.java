package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.example.Main.factorial;

public class TestF {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,720},
                {-1,-1},
                {-5,-1}
    };
    }

    @DataProvider
    public Object[][] data1(){
        return new Object[][]{
                {-1,-1},
                {-5,-1}
        };
    }

    @Test(dataProvider = "data")
    public void testFactorial(Integer a, Integer b){
        Assert.assertEquals(factorial(a),b);
    }

    @Test(dataProvider = "data1")
    public void testFactorial1(Integer a, Integer b){
        System.setOut(new PrintStream(outputStreamCaptor));
        Assert.assertEquals(factorial(a),b);
        Assert.assertEquals(outputStreamCaptor.toString().trim(),"Невозможно посчитать факториал отрицательного числа");
        outputStreamCaptor.reset();
    }
}
