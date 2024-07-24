package Aula07;
public class Main {
    public static void main(String[] args) {
        Lutador number1 = new Lutador("Pretty father","Portugal",31, 1.75f,69f,11,2,1);
        Lutador n[] = new Lutador[3];
        n[0] = new Lutador("Pretty boy","alemanha",30, 1.72f,69f,11,2,1);
        n[1] = new Lutador("Pretty girl","brazil",32, 1.75f,60f,9,2,1);
        n[2] = new Lutador("Pretty child","italia",33, 1.69f,57f,10,2,1);
        // number1.apresentar();

        Luta UFC = new Luta();
        UFC.marcaLuta(n[0], n[1]);
        UFC.lutar();
    }
}
