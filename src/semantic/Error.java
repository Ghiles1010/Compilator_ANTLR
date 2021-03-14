package semantic;


public class Error {

    private ERROR_TYPES type;
    private int line;

    public Error(ERROR_TYPES type, int line){

        this.type = type;
        this.line = line;
    }

}
