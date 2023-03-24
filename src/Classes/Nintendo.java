package Classes;

public class Nintendo extends Consoles{
    private int ano;
    private String modelo;

    public Nintendo(int quantidadeDeControles, int memoria, int ano,String modelo){
        super(quantidadeDeControles, memoria);
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}