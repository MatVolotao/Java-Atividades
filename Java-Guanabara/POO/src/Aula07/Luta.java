package Aula07;

import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // metodos publicos
    public void marcaLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("DESAFIADO");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: // empate
                    System.out.println("empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // deasfiado vence
                    System.out.println("vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // desafiante vence
                    System.out.println("vitoria do " + this.desafiado.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            
                default:
                    System.out.println("Selecione uma opção valida!");
                    break;
            }

        }else{
            System.out.println("Não aprovada");
        }
    }

    // metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }


    
}
