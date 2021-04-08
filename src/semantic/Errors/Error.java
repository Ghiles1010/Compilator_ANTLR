package semantic.Errors;


public abstract class Error {

    protected int line;
    protected String token;



    public Error(int line){

        this.line = line;
    }


    @Override
    public String toString() {
        String line_message = String.format("Error at line %d, ", this.line);
        return line_message;
    }
}
