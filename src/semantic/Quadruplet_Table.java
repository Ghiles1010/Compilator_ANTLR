package semantic;

import java.util.ArrayList;

public class Quadruplet_Table {

    private ArrayList<Quadruplet> quadruplets;

    public Quadruplet_Table(){

        this.quadruplets = new ArrayList<>();
    }


    public void print(){

        System.out.println("\nQuadruplets : \n");
        int i=0;
        for(Quadruplet q : this.quadruplets){

            System.out.println(i+" - "+q.toString());
            i++;
        }
    }

    public void add(Quadruplet quad){

        this.quadruplets.add(quad);
    }

    public int getSize(){
        return this.quadruplets.size();
    }

    public ArrayList<Quadruplet> getQuadruplets() {
        return quadruplets;
    }
}
