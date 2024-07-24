package Aula12;

public class Main12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();

        m.locomover();
        r.locomover();

        r.reagir(false);
        r.reagir(13);

    }
}
