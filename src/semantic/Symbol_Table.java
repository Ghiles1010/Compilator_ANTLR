package semantic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Symbol_Table {

    //ArrayList<Symbol> symbols;
    private Map<String, Symbol> symbols;

    public Symbol_Table(){

        this.symbols =  new HashMap<>();
    }

    public boolean symbol_exists(String id){

        return symbols.get(id) != null;
    }

    public String getType(String id){

        String type = symbols.get(id).getType();

        if( type == null){
            return "";
        }

        return type;
    }


    public void add(Symbol symbol){
        symbols.put(symbol.getId(), symbol);
    }


    public void print(){
        System.out.println("\nTable de symboles : \n");
        System.out.println("\t\t----------------------------------------------------------------------------------------");
        System.out.format("%16s\t\t|%16s\t\t|%16s\t\t|%16s\t\t\n", "ID", "TYPE", "VALUE", "DECLARED");
        System.out.println("\t\t----------------------------------------------------------------------------------------");
        for(Map.Entry s : symbols.entrySet()){

            Symbol symbol = (Symbol) s.getValue();
            System.out.format("%16s\t\t|%16s\t\t|%16s\t\t|%16s\t\t\n", symbol.getId(), symbol.getType(), symbol.getValue(), symbol.isDeclared());
        }
        System.out.println("\t\t----------------------------------------------------------------------------------------");


    }


}
