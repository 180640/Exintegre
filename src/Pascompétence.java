import java.util.ArrayList;
import java.util.Date;

public class Pascompétence implements Strategytaskworker {
    Worker W;
    String s;
    Task t;
    String S;
    Date DB, DF,db,df;
    float out, out2;
    boolean ok ;
    public void association (ArrayList<Worker> T, Task t){
        S = t.getSkill();
        DB = t.getDatedebut();
        DF = t.getDatefin();
        ArrayList<Task> y;
        for (int i = 0; i < T.size(); i++ ){
            W = T.get(i);
            s = W.getSkill();
            if (S == s){
                y = W.getTache();
                for (int j = 0; j< y.size(); j++){
                    t = y.get(j);
                    df = t.getDatefin();
                    out = df.compareTo(DB);
                    if (out < 0){
                        t = y.get(j+1);
                        db = t.getDatedebut();
                        out2 = DF.compareTo(db);
                        if (out2 < 0) {

                        }
                    }
                }
            }
        }
    }
}
