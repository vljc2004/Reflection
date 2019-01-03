package com.company;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class<?> birdClass = Class.forName("com.company.Bird");
        Bird bird = (Bird) birdClass.newInstance();
        //Field field = birdClass.getDeclaredField("walks");
        //field.setAccessible(true);
        //field.set(bird, true);


        Field[] fields = birdClass.getDeclaredFields();

        Map<String,Object> valores = new HashMap<>();

        for(int i=0; i<= fields.length-1; i++){
            fields[i].setAccessible(true);
            System.out.println("Val: "+fields[i]);
            System.out.println("Type: "+ fields[i].getType().getSimpleName() );
            if( fields[i].getType().getSimpleName().equals("Map") ){
                System.out.println("is a MAP");
                valores = bird.getDatos();
                System.out.println("valores" + valores.toString());
            }
        }

        System.out.println("Inicia: "+bird.toString());



        System.out.println("Finaliza: "+bird.toString());

    }
}
