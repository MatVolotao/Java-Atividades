
package Aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("est� tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("N�o � possivel rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
}
