package semantic;

public class Id_Info {


    private String id;
    private int line;
    private Id_Info next;

    public Id_Info(String id, int line,Id_Info next){

        this.id = id;
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
}
