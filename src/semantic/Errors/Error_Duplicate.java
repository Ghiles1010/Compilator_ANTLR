package semantic.Errors;

public class Error_Duplicate extends Error{


    public Error_Duplicate(int line, String token){

        super(line);

        this.token = token;

    }

    @Override
    public String toString() {


        String message = "";
        message = String.format("'%s' has been declared more than once.", this.token);

        return super.toString() + message;
    }


}
