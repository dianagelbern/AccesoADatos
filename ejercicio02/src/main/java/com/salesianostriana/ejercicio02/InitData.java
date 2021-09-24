package com.salesianostriana.ejercicio02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentRepository repository;

    @PostConstruct
    public void init(){
        repository.saveAll(
                Arrays.asList(
                        new Monument("MX", "52", "Teotihuacán", "19.69261, -98.8436654", "Pirámide del sol", "Es la edificación más grande de Teotihuacán y una de las más grandes de Mesoamérica", "https://historiacivil.files.wordpress.com/2020/01/2.jpg"),
                        new Monument("IND", "91", "Agra", "27.173891, 78.042068", "Taj Mahal", "El Taj Mahal es considerado el más bello ejemplo de palacio, estilo que combina elementos de las arquitecturas islámica, persa, india e incluso turca.", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ee/%C4%90%E1%BB%81n_Taj_Mahal.jpg/1280px-%C4%90%E1%BB%81n_Taj_Mahal.jpg"),
                        new Monument("NY", "1", "New York", "19.314512, 99.112203", "Estatua de la Libertas", "Fue un regalo del pueblo francés al pueblo estadounidense en 1886 para conmemorar el centenario de la Declaración de Independencia de los Estados Unidos y como un signo de amistad entre las dos naciones.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Statue_of_Liberty_7.jpg/1200px-Statue_of_Liberty_7.jpg")
                )
        );
    }
}
