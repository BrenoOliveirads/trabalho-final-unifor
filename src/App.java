import Classes.Maquinas;
import Classes.Notebook;
import Classes.Pc;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pc a = new Pc("144hz", "RedDragon", "logtec", true);
        Notebook b = new Notebook("Padrão", "Padrão", "touch", false);

        ArrayList<Maquinas> aparelhos = new ArrayList<Maquinas>();
        
        a.about();
        System.out.println();
        System.out.println();
        b.about();


    }
}
