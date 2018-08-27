package ejercicio3_poo;

/*
Crear una clase fraccion que cuente con dos atributos: dividendo y divisor,
que se asignan en el constructor, y se imprimen como X/Y en el método 
toString()

1.- Crear un método sumar que reciba otra fracción y devuelva una nueva 
fracción con la suma de ambas
2.- Crear un método multiplicar que reciba otra fracción y devuelva una 
nueva fracción con el producto de ambas.
*/

public class Ejercicio3_POO {

    public static void main(String[] args) {
        
        Fraccion a = new Fraccion(-1,1);
        Fraccion b = new Fraccion(1,4);
        
        Fraccion s = a.sumar(b);
        Fraccion m = a.multiplicar(b);
        System.out.println(s);
        System.out.println(m);
    }
    
}
