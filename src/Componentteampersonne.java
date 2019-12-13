import java.util.ArrayList;
import java.util.Date;

public interface Componentteampersonne {
    public abstract String getNom();
    public abstract void addWorker(Worker w);
    public abstract ArrayList<Worker> getTeam();
    public abstract String getPrenom();

}
