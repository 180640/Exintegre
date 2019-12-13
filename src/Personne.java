import java.util.Scanner;

public abstract class Personne implements Componentteampersonne, Componentressourcetask {
    public String nom;
    public String prenom;
    public String statut;
    Personne () {

    };

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public static Personne getStatut (String s){
        if (s == "Worker"){
            return new Worker();
        }
        else if (s == "Manager"){
            return new Manager();
        }
        else {
            return null;
        }
    };

    public void saisiepersonne() {
        System.out.println("Entrer  le nom de la personne");
        Scanner lectureClavier = new Scanner(System.in);
        nom = lectureClavier.next();

        System.out.println("Entrer  le prénom de la personne");
        Scanner lectureClavier2 = new Scanner(System.in);
        prenom = lectureClavier2.next();

        System.out.println("Entrer  le staut de la personne");
        Scanner lectureClavier3 = new Scanner(System.in);
        statut = lectureClavier3.next();
    }
}
