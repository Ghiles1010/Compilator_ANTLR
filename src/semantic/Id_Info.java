package semantic;

public class Id_Info {


    private String id;
    private int line;
    private Id_Info next;
    private  String value;

    public Id_Info(String id, String value, int line,Id_Info next){

        this.id = id;
        this. value = value;
        this.line = line;
        this.next = next;
    }

    public String getId() {
        return id;
    }

    public int getLine() {
        return line;
    }

    public Id_Info getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }
}
