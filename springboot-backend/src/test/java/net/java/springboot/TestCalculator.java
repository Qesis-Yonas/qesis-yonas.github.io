package net.java.springboot;


import net.java.springboot.testpractice.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCalculator {

    @Autowired
    private Calculator calculator;


    @Before
    public void getCalculatorInstance(){
        calculator=new Calculator();
    }

    @Test
    public void testAdd(){
        //Given
        int x=1;
        int y=3;

        int expected= 4;

        //when
        int result= calculator.add(x,y);

        //then
        assertEquals(expected, result);
    }

}
