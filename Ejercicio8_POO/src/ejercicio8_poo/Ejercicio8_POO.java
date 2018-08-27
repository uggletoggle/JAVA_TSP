package ejercicio8_poo;

import java.util.Scanner;

/*
Crear una clase llamda Persona que contenga:
1.- nombre, edad, dni, sexo, peso, altura
2.- constructor por defecto, constructor con nombre edad y sexo,
    constructor con todos los atributos
3.- Métodos:
    calcularIMC() devuelve -1 0 ó 1 de acuerdo al cálculo
    esMayorDeEdad()
    comprobarSexo(char sexo)
    toString() devuelve toda la info
    generaDNI() invocado por el constructor y privado
    setters excepto de DNI

    En el Main pedir por teclado nombre, edad, sexo, peso y altura
    Crear 3 objetos Persona, el primer objeto tendrá las variables pedidas
    por teclado, el segundo objeto obtendrá todos los anteriores menos el 
    peso y la altura y el último por defecto. Usar setters para este último.
*/ 

public class Ejercicio8_POO {

    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre");
        String n = teclado.nextLine();
        System.out.println("Edad");
        int edad = teclado.nextInt();
        System.out.println("DNI");
        teclado.nextLine();
        String dni = teclado.nextLine();
        System.out.println("Sexo");
        char sexo = teclado.nextLine().charAt(0);
        System.out.println("Peso");
        double peso = teclado.nextDouble();
        System.out.println("Altura");
        double altura = teclado.nextDouble();
        */
        Persona persona1, persona2, persona3;
        
        //persona1 = new Persona(n, edad, dni, sexo, peso, altura);
        //persona2 = new Persona(n, edad, sexo);
        persona3 = new Persona();
        
        persona3.setAltura(1.8);
        persona3.setEdad(22);
        persona3.setNombre("Adrian");
        persona3.setSexo('H');
        persona3.setPeso(80);
        
        if (persona3.esMayorDeEdad()){
            System.out.println(persona3.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona3.getNombre() + " no es mayor de edad");
        }
        
        switch(persona3.calcularIMC()){
            case -1 : System.out.println("Bajo peso");break;
            case 0 : System.out.println("Peso normal");break;
            case 1 : System.out.println("Sobrepeso");break;
        }
        
        System.out.println(persona3);
    }
    
}
