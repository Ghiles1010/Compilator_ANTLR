package semantic.Errors;


public abstract class Error {

    protected int line;
    protected String token;



    public Error(int line, String token){

        this.line = line;
        this.token = token;
    }


}
