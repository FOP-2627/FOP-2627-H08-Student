package h08.nodes;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A node that supplies a string value with two operands (binary operation): {@link MyStringBiFunction}.
 */
public class BinaryNode implements Node {

    private final Object function;
    private final Node lhs;
    private final Node rhs;

    /**
     * @param function the binary function to be applied to the two operands
     * @param lhs      the left-hand-side/first operand
     * @param rhs      the right-hand-side/second operand
     */
    public BinaryNode(Object function, Node lhs, Node rhs) {
        this.function = function;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    /**
     * Evaluates both operands and applies the binary function to their results.
     *
     * @return the result of the binary function application
     */
    @StudentImplementationRequired("H8.5.2")
    @Override
    public String evaluate() {
        // TODO: H8.5.2
        return org.tudalgo.algoutils.student.Student.crash("H8.5.2 - Remove if implemented");
    }
}
