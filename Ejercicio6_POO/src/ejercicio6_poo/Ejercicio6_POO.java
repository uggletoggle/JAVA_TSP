package ejercicio6_poo;

/*
Escribir una clase Corcho que contenga:
1.- Atributo bodega(String) y enBotella(boolean)
Escribir una clase Botella que contenga:
2.- Atributo corcho
Escribir una clase Sacacorchos que contenga:
3.- Atributo tieneCorcho(boolean)
    Métodos: destapar() recibe Botella. Validar casos
             limpiar() quita el corcho del sacacorcho si es
             que lo tiene.
*/

public class Ejercicio6_POO {

    public static void main(String[] args) {
        
        Botella SantaJulia = new Botella();
        Botella Toro = new Botella();
        Sacacorchos sacacorchos = new Sacacorchos();
        
        System.out.println("1");
        sacacorchos.destapar(SantaJulia);
        System.out.println("2");
        sacacorchos.destapar(Toro);
        sacacorchos.limpiar();
        System.out.println("3");
        sacacorchos.destapar(Toro);
        sacacorchos.limpiar();
        System.out.println("4");
        sacacorchos.destapar(SantaJulia);
    }
    
}
