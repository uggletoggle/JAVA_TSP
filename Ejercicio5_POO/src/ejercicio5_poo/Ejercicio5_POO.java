package ejercicio5_poo;

/*
Escribir una clase Papel que contenga:
1.- Atributo texto, método escribir, que recibe una
cadena de caracteres para agregar al texto y el método
toString() que imprima el contenido del texto
Escribir una clase Birome que contenga:
2.- atributo cantidad de tinta, método escribir, que
reciba un texto y un papel sobre el cual escribir.
Cada letra escrita debe reducir la cantidad de tinta
contenida. Cuando la tinta se acabe imprimir un mensaje
de error indicando que la tinta se ha acabado.
*/

public class Ejercicio5_POO {
    
    public static void main(String[] args) {
        
        Papel p = new Papel();
        Birome bic = new Birome();
        
        bic.escribir("hola", p);
        bic.escribir(" mundo", p);
        System.out.println(p);
        bic.escribir(". Adios mundo", p);
        System.out.println(p);
    }
    
}
