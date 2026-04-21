package com.mycompany.app;

import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //* La clase Optional es una clase contenedora disenada para manejar los casos de NullPointerException
        //* de una manera mas elegante y util

        //* Es una clase contenedora que puedo o no contener un valor
        //* Disenada para evitar el uso del null
        //* En lugar de retornar un null retorna un Optional vacio

        Optional<String> name = Optional.of("Gabriel");

        if (name.isPresent()) {
            System.out.println("El nombre esta presente");
        }

        String value = null;
        //* El ofNullable nos devuelve un objeto vacio si recibe un Null
        Optional<String> nick = Optional.ofNullable(value);

        if(nick.isPresent()) {
            System.out.println("El nick esta presente");
        } else {
            System.out.println("Vacio");
        }

        Optional<String> greeting = Optional.of("Hola mundo");

                //* ifPresent recibe como argumento un consumer
        greeting.ifPresent(message -> System.out.println("Soy Gabriel: " + message));
    }
}
