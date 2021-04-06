package semantic.Assembly;

public class ASM {

    String instruction;
    String op1;
    String op2;

    public ASM(String instruction, String operator) {
        this.instruction = instruction;
        this.op1 = operator;
        this.op2 = "";
    }

    public ASM(String instruction, String op1, String op2) {
        this.instruction = instruction;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public String toString() {

        String second = op2.isEmpty() ? "" : ", " + op2;
        return instruction + " " + op1 + second;
    }
}
