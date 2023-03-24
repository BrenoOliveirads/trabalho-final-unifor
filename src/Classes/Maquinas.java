package Classes;
public abstract class Maquinas implements IAparelho{//a e b
    private String monitor;
    private String teclado;
    private String mouse;
  
    
    public Maquinas(String monitor, String teclado, String mouse) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }
    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public void ligar(){
    }
    public void desligar(){
    }
    

    
 }