package Aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
  
    
    public ContaBanco() {
        
    }
    
    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }
    
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    // M�todos Personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
        this.setSaldo (50);
        } else if (t == "CP") {
        this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    

    public void fecharConta() {
        if (this.getSaldo()> 0){
            System.out.println("Ainda com saldo");
        }else if(this.getSaldo()< 0){
            System.out.println("Ainda em debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void depositar(float v) {
        if (this.isStatus()){
            //this.saldo += v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("DEposito realizado");
        }else {
            System.out.println("Erro");
        }
    }

    public void sacar(float v) {
        if(this.isStatus()){
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()- v);
            }else{
                System.out.println("sem saldo");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga: " + this.getDono());
        }else{
            System.out.println("Impossivel pagar conta fechada");
        }
    }
    
    public void estadoAtual(){
        System.out.println("--------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status" + this.isStatus());
    }
}
