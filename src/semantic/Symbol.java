package semantic;

public class Symbol {
    private String id;
    private String type;
    private String value;
    private boolean declared;


    public Symbol(String id, String type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.declared = true;
    }

    public Symbol(String id, String type, String value, boolean declared) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.declared = declared;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public boolean isDeclared() {
        return declared;
    }
}


