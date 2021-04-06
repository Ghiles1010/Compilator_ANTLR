package semantic;

import semantic.Assembly.Assembly_Code;
import semantic.Errors.Error_Table;

public class Program {


    Quadruplet_Table quad_table;
    Error_Table error_table;
    Assembly_Code code;

    public Program(Quadruplet_Table quad_table, Error_Table error_table){

        this.quad_table = quad_table;
        this.error_table = error_table;
        this.code = error_table.getErrors().isEmpty() ?
                new Assembly_Code(quad_table.getQuadruplets()) : null;

    }



    public Quadruplet_Table getQuad_table() {
        return quad_table;
    }

    public Error_Table getError_table() {
        return error_table;
    }

    public Assembly_Code getCode() { return code; }
}
