package com.li.generalmapper;

import com.li.generalmapper.Model.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralmapperApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(GeneralmapperApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLombok () {
        Animal animal = new Animal("dog" ,"male" , "wang wang..." );
        Animal animal1 = new Animal();
        animal1.setType("cat");
        animal1.setSex("male");
        animal1.setPettishVoices("meow meow...");
//        animal.setType("dog");
//        animal.setSex("male");
//        animal.setPettishVoices("wang wang...");
        //System.out.println(animal.getSex() + " "+ animal.getType() + " "+ animal.getPettishVoices());
        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        log.info(animal.toString());
        log.info(animal1.toString());
    }

}
