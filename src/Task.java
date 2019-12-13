import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Task implements Strategytaskworker, Componentressourcetask {
    public String nom, date;
    public long duree;
    public Date datedebut, datefin;

    public String skill;
    public ArrayList<Ressource> listressource;
    int n;

    Task()  {
    }
    ;
    public void saisietask() throws ParseException {
        System.out.println("Entrer  le nom de la tâche");
        Scanner lectureClavier = new Scanner (System.in);
        nom = lectureClavier.next();

        System.out.println("Entrer  la date du début de la tâche");
        Scanner lectureClavier2 = new Scanner (System.in);
        date = lectureClavier2.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy hh:mi:ss");
        datedebut = sdf1.parse(date);

        System.out.println("Entrer  la date de fin de la tâche");
        Scanner lectureClavier3 = new Scanner (System.in);
        date = lectureClavier3.next();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy hh:mi:ss");
        datefin = sdf2.parse(date);

        duree = (datefin.getTime() - datedebut.getTime());

        System.out.println("Entrer  la compétence requise ");
        Scanner lectureClavier4 = new Scanner (System.in);
        skill = lectureClavier4.next();

        System.out.println("Entrer  le nombre de ressources");
        Scanner lectureClavier5 = new Scanner (System.in);
        n = lectureClavier5.nextInt();
        for (int i = 0; i<n; i++){
            Ressource r = new Ressource();
            r.saisieressource();
            listressource.add(r);
        }
    }

    public void setListtask(ArrayList<Ressource> listressource) {
        this.listressource = listressource;
    }

    public ArrayList<Ressource> getListtask() {
        return listressource;
    }

    public void addRessource(Ressource r) {
        listressource.add(r);
    }

    public long getDuree() {
        return duree;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public String getSkill() {
        return skill;
    }



    @Override
    public String getNom() {
        return null;
    }


    @Override
    public void association(ArrayList<Worker> T, String S) {

    }
}
