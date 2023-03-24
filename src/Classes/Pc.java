package Classes;

public class Pc extends Maquinas{
    public boolean placaDeVideo= true;
    
    public Pc(String monitor,String teclado,String mouse, boolean placaDeVideo){
        super(monitor, teclado, mouse);
        this.placaDeVideo = placaDeVideo;
    }

    public boolean isPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(boolean placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void about(){
        System.out.printf("esse computador tem monitor :%s%nesse computador tem teclado: %s%nesse computador tem mouse: %s%nPossue Placa de Video : " + placaDeVideo,getMonitor(),getTeclado(),getMouse());
    }
    
}
