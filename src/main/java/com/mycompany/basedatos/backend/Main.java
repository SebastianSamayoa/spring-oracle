package com.mycompany.basedatos.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author jhoan
 */
@SpringBootApplication
@EntityScan(basePackages ="entidad")
@ComponentScan(basePackages ={"Controlador"})
public class Main {

    public static void main(String [] args){
        SpringApplication.run(Main.class, args);
    
    }
    
}
