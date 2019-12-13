import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ressource implements Componentressourcetask{
    public String nom;
    Ressource(){};

    public String getNom() {
        return nom;
    }

    public void saisieressource() {
        System.out.println("Entrer  le nom de la ressource");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
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




}
