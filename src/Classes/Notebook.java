package Classes;

public class Notebook extends Maquinas {
    private boolean placaDeVideo;

    public Notebook(String monitor, String teclado, String mouse, boolean placaDeVideo) {
        super(monitor, teclado, mouse);
        this.placaDeVideo = placaDeVideo;
    }

    public boolean isPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(boolean placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void about() {
        System.out.printf("esse Notebook tem monitor :%s%nesse Notebook tem teclado: %s%nesse Notebook tem mouse: %s%nPossue Placa de Video : " + placaDeVideo,getMonitor(),getTeclado(),getMouse());
    }

}
