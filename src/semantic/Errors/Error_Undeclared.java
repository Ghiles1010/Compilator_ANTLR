package semantic.Errors;

public class Error_Undeclared extends Error {


    public Error_Undeclared(int line, String token){

        super(line);
        this.token = token;
    }

    @Override
    public String toString() {

        String message = "";
        message = String.format("'%s' has not been declared.", this.token);
        return super.toString() + message;
    }
}
