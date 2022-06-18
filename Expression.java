public interface Expression {
    public boolean Interpreter(String context);
}

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }

}

public class OrExpression implements Expression {

    private Expression ex1;
    private Expression ex2;

    public OrExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public boolean interpret(String context) {
        return ex1.interpret(context) || ex2.interpret(context);
    }
}

public class AndExpression implements Expression {

    private Expression ex1;
    private Expression ex2;

    public AndExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public boolean interpret(String context) {
        return ex1.interpret(context) && ex2.interpret(context);
    }
}