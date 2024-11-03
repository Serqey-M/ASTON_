package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.Main.factorial;

public class TestF {

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
    };
    }

@Test(dataProvider = "data")
    public void testFactorial(Integer a, Integer b){
    Assert.assertEquals(factorial(a),b);
    }

}
