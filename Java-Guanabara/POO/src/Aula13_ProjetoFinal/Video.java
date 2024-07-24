package Aula13_ProjetoFinal;

public class Video implements ActionsVideos {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzir;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzir = false;
    }

    
    @Override
    public void play() {
        // TODO Auto-generated method stub
        this.reproduzir = true;

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        this.reproduzir = false;
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }

    

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzir=" + reproduzir + "]";
    }

    

}
