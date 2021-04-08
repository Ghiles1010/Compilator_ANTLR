package semantic.Errors;

public class Error_Type extends Error{

    String type1;
    String type2;

    public Error_Type(int line, String type1, String type2){

        super(line);

        this.type1 = type1;
        this.type2 = type2;
    }


    @Override
    public String toString() {

        String message = "";
        message = String.format("'%s' is incompatible with '%s'.", this.type1, this.type2);

        return super.toString() + message;
    }
}
