package ejercicio10_poo;

public class Videojuego {

    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;
    
    public Videojuego(){
        horas = 10;
    }
    
    public Videojuego(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
    }
    
    public Videojuego(String titulo, int horas, String genero, String compania){
        this(titulo, horas);
        this.genero = genero;
        this.compania = compania;
    }

    public void entregar(){
        if (entregado == true){
            System.out.println("El videojuego ya está entregado");
        }
        entregado = true;
    }
    
    public void devolver(){
        if (entregado == false){
            System.out.println("El videojuego ya está devuelto");
        }
        entregado = false;
    }
    
    public boolean isEntregado(){
        return entregado;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
    
}
