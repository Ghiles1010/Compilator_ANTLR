package semantic;

import java.util.ArrayList;

public class Quadruplet_Table {

    ArrayList<Quadruplet> quadruplets;

    public Quadruplet_Table(ArrayList<Quadruplet> quadruplets){

        this.quadruplets = quadruplets;
    }


    public void print(){
        int i=0;
        for(Quadruplet q : this.quadruplets){

            System.out.println(i+"_"+q.toString());
            i++;
        }
    }
}
