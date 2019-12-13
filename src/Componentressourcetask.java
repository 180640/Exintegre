import java.util.ArrayList;
import java.util.Date;

public interface Componentressourcetask {
    public String getNom();
    public ArrayList<Ressource> getListtask();
    public void addRessource(Ressource r);
    public long getDuree();
    public Date getDatedebut();
    public Date getDatefin();
    public String getSkill();
}
