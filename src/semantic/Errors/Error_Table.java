package semantic.Errors;

import java.util.ArrayList;

public class Error_Table {

    private ArrayList<Error> errors;

    public Error_Table(){

        this.errors = new ArrayList<>();
    }




    public void print(){

        if(! errors.isEmpty()) {

            System.out.println("\nThere is " + errors.size() + " error(s) : \n");
            for (Error e : this.errors) {

                System.err.println(e.toString());
            }
        }
    }

    public void add(Error err){

        this.errors.add(err);
    }

    public ArrayList<Error> getErrors() {
        return errors;
    }
}
