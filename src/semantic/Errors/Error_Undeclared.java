package semantic.Errors;

public class Error_Undeclared extends Error {


    public Error_Undeclared(int line, String token){

        super(line, token);
    }

    @Override
    public String toString() {


        String line_message = String.format("Error at line %d. ", this.line);
        String message = "";

        message = String.format("'%s' has not been declared.", this.token);

        return line_message + message;
    }
}
