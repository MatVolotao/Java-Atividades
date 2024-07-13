package Aula04;

public class Caneta04 {
    public String modelo;
    private float ponta;
    private boolean tampada;
    
    public Caneta04(){
        
    }
    
    public Caneta04(String m, float p) {
        this.modelo = m;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
    
    
}
