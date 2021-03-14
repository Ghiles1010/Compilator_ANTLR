package semantic.Errors;

import semantic.Errors.Error;

import java.util.ArrayList;

public class Error_Table {

    ArrayList<Error> errors;

    public Error_Table(ArrayList<Error> errors){

        this.errors = errors;
    }




    public void print(){

        for(Error e : this.errors){

            System.out.println(e.toString());
        }
    }

}
