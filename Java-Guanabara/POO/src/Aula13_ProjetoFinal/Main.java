package Aula13_ProjetoFinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        
        System.out.println(v[0].toString());
        System.out.println(v[1]);

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubili", 22, "M","JubaUser");
        g[1] = new Gafanhoto("Rubens", 27, "M","RubensUser");

        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0],v[1]);
        vis[0].avaliar();
        System.out.println(vis[0]);
    }
}
