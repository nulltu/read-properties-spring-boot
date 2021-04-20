package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;


public class MisPropiedades {
    @Autowired
    private Environment env;

    @Value("${propiedad.nombre}")
    private String nombre;

    public MisPropiedades() {
    }

    @Value("${propiedad.apellidos}")
    private String apellidos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void getPropiedades(){
        System.out.println(env.toString());
    }

    public String[] getProperty(){
        return  env.getDefaultProfiles();
    }
}
