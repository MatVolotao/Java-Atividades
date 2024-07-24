package Aula12;

public class Reptil extends Animal {
    private String corEscama;

    public void reagir (int hora){
        if (hora < 12) {
            System.out.println("Está dormindo");
        }else{
            System.out.println("Está acordado");
        }
    }
    
    public void reagir (boolean dono){
        if (dono) {
            System.out.println("reagiu ao positivo");
        }else{
            System.out.println("Corre se nao ele te come");
        }
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void som() {
        System.out.println("Som de Reptil");
    }

}
