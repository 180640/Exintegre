import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {
    public void main (){
        int n;
        String S;
        Task t;
        ArrayList<Worker> T = new ArrayList<>();
        Manager M = new Manager();
        M.saisiepersonne();
        Team te = new Team();
        te.saisieteam();
        System.out.println("Entrer le nombre de worker de  la team :");
        Scanner lectureClavier = new Scanner(System.in);
        n = lectureClavier.nextInt();
        for (int i=0;i<n;i++){
            Worker p =  new Worker();
            p.saisieworker();
            te.addWorker(p);
        }

        Task t = new Task();
        System.out.print("");




        if (S == null){
            Strategytaskworker pascompetences = new Pascompétence();
            Manager s = new Manager(T,t, pascompetences);
        }
        else {
            Strategytaskworker competencerequises = new Compétencerequises();
            Manager u = new Manager(T,t, competencerequises);
        }
    }
}
