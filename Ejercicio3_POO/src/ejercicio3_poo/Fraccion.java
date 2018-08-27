package ejercicio3_poo;

public class Fraccion {

    private int dividendo;
    private int divisor;
    
    public Fraccion(int dividendo, int divisor){
        
        if (divisor == 0){
            throw new UnsupportedOperationException("El denominador debe ser distinto de 0");
        }
        
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        if (divisor == 0){
            throw new UnsupportedOperationException("El denominador debe ser distinto de 0");
        }
        this.divisor = divisor;
    }
    
    
    
    @Override
    public String toString(){
        return dividendo + "/" + divisor;
    }
    
    public Fraccion sumar(Fraccion f){
        
        Fraccion resultado;
        
        int denominador = f.getDivisor()*this.divisor;
        int factor1 = (denominador/f.getDivisor())*f.getDividendo();
        int factor2 = (denominador/this.divisor)*this.dividendo;
        int numerador = factor1 + factor2;
        
        resultado = new Fraccion(numerador, denominador);
        return simplificar(resultado);
       
    }
    
    public Fraccion multiplicar(Fraccion f){
        
        Fraccion multiplicacion, resultado;
        
        int num = f.getDividendo()*this.dividendo;
        int den = f.getDivisor()*this.divisor;
        
        multiplicacion = new Fraccion(num, den);
        resultado = simplificar(multiplicacion);
        return resultado;
    }
    
    private Fraccion simplificar(Fraccion f){
        
        int num = f.getDividendo();
        int den = f.getDivisor();
        int mayor = (num>den)?num:den;
        
        for(int i=2; i <= mayor; i++){
            if(num % i == 0 && den%i ==0){
                num /= i;
                den /= i;
            }
        }
       
        return new Fraccion(num, den);
    }
}
