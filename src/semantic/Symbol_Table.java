package semantic;

import java.util.ArrayList;

public class Symbol_Table {

    ArrayList<Symbol> symbols;

    public Symbol_Table(){

        this.symbols = new ArrayList<>();
    }

    public boolean symbol_exists(String id){

        for(Symbol s : symbols){

            if( s.getId().equals(id) ){
                return true;
            }
        }
        return false;
    }

    public void add(Symbol symbol){
        this.symbols.add(symbol);
    }


}
