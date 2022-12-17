
public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {//считаем через target
        int s = (int) target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM).result();
        return s;
    }

    @Override
    public int mult(int arg0, int arg1) {//считаем через target
        int m = (int) target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.MULT).result();
        return m;
    }

    @Override
    public int pow(int a, int b) {//считаем через target
        int p = (int) target.newFormula().addOperand(a).addOperand(b)
                .calculate(Calculator.Operation.POW).result();
        return p;
    }
}

