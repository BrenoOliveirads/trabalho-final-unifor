package Classes;
public abstract class Consoles implements IAparelho{//c e d
    public int quantidadeDeControles;
    public int memoria;


    public Consoles(int quantidadeDeControles, int memoria) {
        this.quantidadeDeControles = quantidadeDeControles;
        this.memoria = memoria;
    }
    public int getQuantidadeDeControles() {
        return quantidadeDeControles;
    }
    public void setQuantidadeDeControles(int quantidadeDeControles) {
        this.quantidadeDeControles = quantidadeDeControles;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }


    public void ligar(){
    }
    public void desligar(){
    }
    
 }
