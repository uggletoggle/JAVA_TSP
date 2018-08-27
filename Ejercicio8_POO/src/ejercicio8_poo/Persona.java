package ejercicio8_poo;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni; // 8 cifras
    private char sexo; // H ó M
    private double peso; // kilogramos
    private double altura; // metros
    
    public Persona(){
        dni = generaDNI();
    }
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = generaDNI();
    }
    
    public Persona(String nombre, int edad, String dni, char sexo, 
            double peso, double altura){
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
    }
    
    public boolean esMayorDeEdad(){
        return (edad >= 18);
    }
    
    public int calcularIMC(){
        double calculo = (double) peso/(altura*altura);
        if (calculo < 20){
            return -1;
        }else if(calculo <=25 && calculo >= 20){
            return 0;
        } else return 1;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return "{Persona: nombre=" + nombre + " edad=" + edad + " dni=" + 
                dni + " sexo=" + sexo + " peso=" + peso + " altura=" 
                + altura + '}';
    }
    
    private boolean comprobarSexo(char sexo){
        return (this.sexo == sexo);
    }
    
    private String generaDNI(){
        StringBuilder resultado = new StringBuilder("");
        
        Random generador = new Random();
        int aleatorio = (int) (generador.nextDouble() * (199999999 - 100000001) 
                + 100000001); //genera numero aleatorio que varía en las últimas 8 cifras.
        
        Integer obj_aleatorio = aleatorio;
        String str_aleatorio = obj_aleatorio.toString();
        
        for( int i = 1; i < str_aleatorio.length(); i++){
            resultado.append(str_aleatorio.charAt(i));
        }
        
        return resultado.toString();
    }
    
}
