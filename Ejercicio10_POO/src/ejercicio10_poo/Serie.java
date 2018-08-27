package ejercicio10_poo;

public class Serie {

    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    public Serie(){
        temporadas = 3;
    }
    
    public Serie(String titulo, String creador){
        this();
        this.titulo = titulo;
        this.creador = creador;
    }
    
    public Serie(String titulo, String creador, String genero, int temporadas){
        this(titulo, creador);
        this.temporadas = temporadas;
        this.genero = genero;
    }

     public void entregar(){
        if (entregado == true){
            System.out.println("La serie ya está entregada");
        }
        entregado = true;
    }
    
    public void devolver(){
        if (entregado == false){
            System.out.println("La serie ya está devuelta");
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
