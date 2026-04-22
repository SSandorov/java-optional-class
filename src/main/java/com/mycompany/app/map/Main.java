package com.mycompany.app.map;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //? Uso del map()

        Optional<String> name = Optional.of("Gabriel");
        String nameUpperCase = name
            .map( String::trim )
            .map( String::toUpperCase )
            .orElse("Sin nombre");

        System.out.println("Nombre en mayuscula " + nameUpperCase);

        //? Uso del flatMap()
        Optional<Optional<String>> optionalOfOptional = Optional.of(Optional.of("Valor interno"));
        //* El map no puede acceder al valor interno, por lo que empleamos el flatMap para acceder a el
        Optional<String> resultMap = optionalOfOptional.flatMap( op -> op );

        System.out.println(resultMap);

    }
}
