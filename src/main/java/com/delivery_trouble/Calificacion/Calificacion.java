package com.delivery_trouble.Calificacion;

public class Calificacion {
    private double estrellas;
    private String observaciones;


    public Calificacion() {
    }
    

    public Calificacion(double estrellas, String observaciones) {
        this.estrellas = estrellas;
        this.observaciones = observaciones;
    }

    public double getEstrellas() {
        return this.estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Calificacion estrellas(double estrellas) {
        setEstrellas(estrellas);
        return this;
    }

    public Calificacion observaciones(String observaciones) {
        setObservaciones(observaciones);
        return this;
    }

}
