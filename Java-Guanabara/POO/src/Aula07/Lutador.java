package Aula07;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //metodos publicos

    public void apresentar(){
        System.out.println("Apresetando: " + this.nome);
    }

    public void status(){
        System.out.println("nome: " + this.getNome());
        System.out.println("peso: " + this.getPeso());
        System.out.println("Ganhou" + this.getVitorias());
        System.out.println("Perdeu" + this.getDerrotas());
        System.out.println("Empates" +this.getEmpates());
    }

    public void ganharLuta(){
        this.vitorias +=1;
        
    }

    public void perderLuta(){
        this.derrotas+=1;
    }

    public void empatarLuta(){
        this.empates+=1;
    }


    //Construtor
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //metodos especiais

    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    // public void setCategoria(String categoria) {
    //     this.categoria = categoria;
    // }

    private void setCategoria() {
        if (this.peso < 52) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70) {
            this.categoria = "Leve";
        }else if (this.peso <= 84){
            this.categoria = "Médio";
        }else if (this.peso <= 120){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    

    

}
