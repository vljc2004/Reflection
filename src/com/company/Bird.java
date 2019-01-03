package com.company;


import java.util.HashMap;
import java.util.Map;

public class Bird extends Animal {
    private boolean walks;

    private String cadena;

    private Map<String,Object> datos;

    public boolean isWalks() {
        return walks;
    }

    public String getCadena() {
        return "hola*";
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Bird() {
        super("bird");
    }

    public Bird(String name, boolean walks) {
        super(name);
        setWalks(walks);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String eats() {
        return "grains";
    }

    @Override
    protected String getSound() {
        return "chaps";
    }

    public boolean walks() {
        return walks;
    }

    public void setWalks(boolean walks) {
        this.walks = walks;
    }

    public Map<String, Object> getDatos() {
        this.datos = new HashMap<String,Object>();
        datos.put("uno",(String) "Hola");
        return datos;
    }

    public void setDatos(Map<String, Object> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "walks=" + walks +
                ", cadena='" + cadena + '\'' +
                '}';
    }
}