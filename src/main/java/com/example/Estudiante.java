package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(){

    }
    
    public Estudiante(String nombre, int edad, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
             this.edad = edad;
        }else{
            System.out.println("edad no valida");
        }
       
    }

    public int getEdad() {
        return edad;
    }

     public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public boolean haAprobado(){
        return (promedio >= 3.0);
    
        }
    

    public void mostrarInfo(){
        System.out.println("el estudiante: " + nombre);
        System.out.println("tiene: " + edad + " años");
        System.out.println("su promedio es: " + promedio);
        
         if (haAprobado()) {
            System.out.println("Aprobo");
            
        }else{
            System.out.println("reprobo");
        }
        
    }
}

    