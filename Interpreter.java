import java.beans.Expression;

public class Interpreter {
    public static Expression getDogExpression() {
        Expression bob = new TerminalExpression("Bob");
        Expression tod = new TerminalExpression("Tod");
        return new OrExpression(bob, tod);
    }

    public static Expression getCatExpression() {
        Expression edek = new TerminalExpression("Edek");
        Expression kot = new TerminalExpression("kot");
        return new AndExpression(edek, kot);
    }

    public static void main(String[] args) {
        Expression isDog = getDogExpression();
        Expression isCat = getCatExpression();

        System.out.println("Is Kacper a dog?" + isDog.Interpreter("Kacper"));
        System.out.println("Edek to kot?" + isCat.Interpreter("Edek"));

    }
}
