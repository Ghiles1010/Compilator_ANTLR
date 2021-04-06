package semantic.Assembly;
import semantic.Quadruplet;
import java.util.ArrayList;

public class Assembly_Code {

    ArrayList<Quadruplet> quads;
    ArrayList<ASM> code;

    String AX = "";

    public Assembly_Code(ArrayList<Quadruplet> quads){

        code = new ArrayList<>();
        this.quads = quads;

        Generate_assembly();
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


            }

        }

    }


    public void print(){

        for (ASM asm : code) {

            System.out.println(asm.toString());
        }
    }


    void Gen(String instruction, String operator){

        ASM asm = new ASM(instruction.toUpperCase(), operator);
        this.code.add(asm);
    }


    void Gen(String instruction, String op1, String op2){

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
