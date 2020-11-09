package innopolis.lesson13.interpret;

/**
 * Created by ADivaev on 09.11.2020.
 */
public class Substract implements Expression {

    private final Expression left;
    private final Expression right;

    public Substract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
