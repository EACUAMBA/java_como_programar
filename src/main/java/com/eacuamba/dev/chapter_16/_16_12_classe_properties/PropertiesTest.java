package com.eacuamba.dev.chapter_16._16_12_classe_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties();
        table.setProperty("color", "green");
        table.setProperty("width", "256px");

        System.out.println("Apos definir as propriedades da table.");
        printProperties(table);

        table.setProperty("color", "pink");
        System.out.println("Após redefinir uma propriedade.");
        printProperties(table);

        saveProperties(table);

        System.out.println("Apos limpar");
        table.clear();
        printProperties(table);

        loadProperties(table);

        String color = table.getProperty("color");
        if(Objects.nonNull(color))
            System.out.println("A propriedade color existe e o valor é " + color);
        else
            System.out.println("A propriedade color não existe.");


    }

    public static void saveProperties(Properties table){
        try(FileOutputStream fileOutputStream = new FileOutputStream("/propriedades.properties")){
            table.save(fileOutputStream, "Propriedades salvas em " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            System.out.println("Após ter salvo:");
            printProperties(table);
        }catch(IOException ioException){
            System.out.println("Erro ao tentar salvar a propriedade.");
            ioException.printStackTrace();
        }
    }

    public static void loadProperties(Properties table){
        try(FileInputStream fileOutputStream = new FileInputStream("/propriedades.properties")){
            table.load(fileOutputStream);
            System.out.println("Após carregado do ficheiro:");
            printProperties(table);
        }catch(IOException ioException){
            System.out.println("Erro ao tentar salvar a propriedade.");
            ioException.printStackTrace();
        }
    }
    public static void printProperties(Properties table){

        Set<Object> set = table.keySet();

        System.out.printf("%-10s\t%10s%n", "keys", "values");
        for(Object o: set)
            System.out.printf("%-10s\t%10s%n", Objects.toString(o, "Vazio"), table.getProperty(Objects.toString(o)));

        System.out.printf("%nThis properties table has %d properties saved.", table.size());
        System.out.println("\n");
    }
}
