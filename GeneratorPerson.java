package by.minsk.itakademy.arturzimin;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorPerson extends Person{

    public static void generatePerson(String name,String surname,int age){

        Person person=new Person(name,surname,age);
        Main.list.add(person);

    }

    public static String randomNameAndSurname(){
        byte[] array=new byte[8];
        new Random().nextBytes(array);
        String randomNameAndSurname=new String(array, Charset.forName("UTF-8"));
        return randomNameAndSurname;
    }
}
