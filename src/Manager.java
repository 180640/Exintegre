import java.util.ArrayList;
import java.util.Date;

public class Manager extends Personne {

    private static Manager instance = null;
    ArrayList<Worker> T;
    String S;
    Task t;

    Manager() {

    }

    ;

    public static Manager getManager() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    private Strategytaskworker strategy;

    public Manager(ArrayList<Worker> T, Task t,  Strategytaskworker strategy) {
        this.T = T;
        this.t= t;
        this.strategy = strategy;
    }

    void choix() {
        strategy.association(T, t);
    }


    @Override
    public ArrayList<Ressource> getListtask() {
        return null;
    }

    @Override
    public void addRessource(Ressource r) {
    }

    @Override
    public long getDuree() {
        return 0;
    }

    @Override
    public Date getDatedebut() {
        return null;
    }

    @Override
    public Date getDatefin() {
        return null;
    }

    @Override
    public String getSkill() {
        return null;
    }

    @Override
    public void addWorker(Worker w) {
    }

    @Override
    public ArrayList<Worker> getTeam() {
        return null;
    }
}
