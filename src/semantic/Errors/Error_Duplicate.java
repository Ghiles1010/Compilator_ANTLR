package semantic.Errors;

public class Error_Duplicate extends Error{


    public Error_Duplicate(int line, String token){

        super(line, token);

    }

    @Override
    public String toString() {


        String line_message = String.format("Error at line %d. ", this.line);
        String message = "";

        message = String.format("'%s' has been declared more than once.", this.token);

        return line_message + message;
    }
}
