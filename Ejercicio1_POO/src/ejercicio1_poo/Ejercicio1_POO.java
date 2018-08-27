package ejercicio1_poo;

/*
Crear una clase libro que contenga:
1- ISBN, título, autor, numero de paginas
2- getters y setters
3-sobreescribir toString()

Crear dos objetos Libro y mostrarlos por pantalla
Indicar cuál de los dos tiene más páginas
*/

public class Ejercicio1_POO {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        
        libro1.setTitulo("El silencio de los inocentes");
        libro1.setAutor("Stephen King");
        libro1.setISBN("0998-09991-9122-0000");
        libro1.setPaginas(350);
        
        libro2.setTitulo("Terciopelo Azul");
        libro2.setAutor("Garcia Lorca");
        libro2.setISBN("099991-122-0001");
        libro2.setPaginas(221);
        
        if (libro1.getPaginas() > libro2.getPaginas()){
            System.out.println("El libro " + libro1.getTitulo() + " tiene mas páginas");
        } else if (libro2.getPaginas() > libro1.getPaginas()){
            System.out.println("El libro " + libro2.getTitulo() + " tiene mas páginas");
        } else{
            System.out.println("Ambos libros tienen la misma cantidad de páginas");
        }
    }
    
}
