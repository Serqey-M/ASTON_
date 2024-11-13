package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.example.Main.factorial;



public class TestF {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @ParameterizedTest
    @CsvSource({"0,1","1,1","2,2","3,6","4,24","5,120","6,720"})
    public void testF(int a, int b){
        Assertions.assertEquals(factorial(a), b);
    }


    @ParameterizedTest
    @CsvSource({"-1,-1","-5,-1"})
    public void testF1(int a, int b){
        System.setOut(new PrintStream(outputStreamCaptor));
        Assertions.assertEquals(factorial(a), b);
        Assertions.assertEquals("Невозможно посчитать факториал отрицательного числа", outputStreamCaptor.toString().trim());
        }

}




