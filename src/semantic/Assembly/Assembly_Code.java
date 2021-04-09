package semantic.Assembly;
import semantic.Quadruplet;
import java.util.ArrayList;

public class Assembly_Code {

    ArrayList<Quadruplet> quads;
    ArrayList<ASM> code;
    boolean errors;

    String AX = "";

    public Assembly_Code(ArrayList<Quadruplet> quads, boolean errors){

        this.errors = errors;

        if(!errors) {

            code = new ArrayList<>();
            this.quads = quads;

            Generate_assembly();
        }
    }
    
    private void Generate_assembly(){

        Quadruplet quad;

        for(int i = 0; i < quads.size(); i++){

            quad = quads.get(i);

            switch (quad.getQ1()){

                case "+":
                    get_in_acc(quad.getQ2(), quad.getQ3(), i);
                    Gen("ADD", quad.getQ3());
                    AX = quad.getQ4();
                    break;

                case "-":
                    get_in_acc(quad.getQ2(), "", i);
                    Gen("SUB", quad.getQ3());
                    AX = quad.getQ4();
                    break;

                case "*":
                    get_in_acc(quad.getQ2(), quad.getQ3(), i);
                    Gen("MULT", quad.getQ3());
                    AX = quad.getQ4();
                    break;

                case "/":
                    get_in_acc(quad.getQ2(), "", i);
                    Gen("DIV", quad.getQ3());
                    AX = quad.getQ4();
                    break;

                case "=":
                    get_in_acc(quad.getQ2(), "", i);
                    Gen("MOVE", "AX", quad.getQ4());
                    AX = quad.getQ4();
                    break;


                case "READ":
                    Gen("INPUT", quad.getQ2());
                    break;

                case "PRINT" :
                    Gen("OUTPUT", quad.getQ2());
                    break;
                case "BR" : //branchement incotionnel
                    Gen("JMP", quad.getQ2() );
                    break;
                default:
                    if(quad.getQ1().startsWith("B")) //les branchements conditionnels
                    {
                       Gen("MOV", "AX", quad.getQ3());
                       Gen("CMP", "AX", quad.getQ4());
                       Gen("J".concat(quad.getQ1().substring(1)), quad.getQ2());


                    }

            }

        }

    }


    public void print(){

        if(! errors) {

            System.out.println("\nCode assembleur : \n");
            for (ASM asm : code) {

                System.out.println(asm.toString());
            }
        }

        else {

            System.err.println("Program has not compiled due to errors.");
        }
    }


    private void Gen(String instruction, String operator){

        ASM asm = new ASM(instruction.toUpperCase(), operator);
        this.code.add(asm);
    }


    private void Gen(String instruction, String op1, String op2){

        ASM asm = new ASM(instruction.toUpperCase(), op1, op2);
        this.code.add(asm);
    }


    private void get_in_acc(String x, String y, int index){

        if (AX.isEmpty()) {
            Gen("MOVE", x, "AX");
            return;
        }

        if(AX.equals(x)){

            return;
        }


        if (AX.equals(y)) {

            quads.get(index).setQ2(y);
            quads.get(index).setQ3(x);
            return;
        }

        Gen("MOVE", "AX", AX);
        Gen("MOVE", x, "AX");
        AX = x;
    }
}
