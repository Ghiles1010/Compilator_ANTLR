package semantic;

import java.util.ArrayList;

public class Quadruplet_Table {

    ArrayList<Quadruplet> quadruplets;

    public Quadruplet_Table(ArrayList<Quadruplet> quadruplets){

        this.quadruplets = quadruplets;
    }


    public void print(){

        for(Quadruplet q : this.quadruplets){

            System.out.println(q.toString());
        }
    }
}
