package semantic;

import semantic.Errors.Error_Table;

public class Program {


    Quadruplet_Table quad_table;
    Error_Table error_table;

    public Program(Quadruplet_Table quad_table, Error_Table error_table){

        this.quad_table = quad_table;
        this.error_table = error_table;
    }



    public Quadruplet_Table getQuad_table() {
        return quad_table;
    }

    public Error_Table getError_table() {
        return error_table;
    }
}
