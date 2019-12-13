import java.util.ArrayList;
import java.util.Scanner;

public class Team implements Componentteampersonne {
    public String nom;
    private ArrayList<Worker> team;
    Team() {};

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }

    public void addWorker(Worker w){
        team.add(w);
    }
    public ArrayList<Worker> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Worker> team) {
        this.team = team;
    }

    public void saisieteam() {
        System.out.println("Entrer  le nom de la team");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();
    }

    @Override
    public String getPrenom() {
        return null;
    }



}
