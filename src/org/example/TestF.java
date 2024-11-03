package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.Main.factorial;

public class TestF {
    @ParameterizedTest
    @CsvSource({"0,1","1,1","2,2","3,6","4,24","5,120","6,720"})
    public void testF(int a, int b){
        Assertions.assertEquals(factorial(a), b);
    }
}


