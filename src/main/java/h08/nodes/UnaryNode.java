package h08.nodes;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A node that supplies a string value with one operand (unary operation): {@link MyStringFunction}.
 */
public class UnaryNode implements Node {

    private final Object function;
    private final Node operand;

    /**
     * @param function the function to be applied to the one operand
     * @param operand  the single operand
     */
    public UnaryNode(Object function, Node operand) {
        this.function = function;
        this.operand = operand;
    }

    /**
     * Evaluates the operand and applies the unary function to its result.
     *
     * @return the result of the unary function application
     */
    @StudentImplementationRequired("H8.5.1")
    @Override
    public String evaluate() {
        // TODO: H8.5.1
        return org.tudalgo.algoutils.student.Student.crash("H8.5.1 - Remove if implemented");
    }
}
