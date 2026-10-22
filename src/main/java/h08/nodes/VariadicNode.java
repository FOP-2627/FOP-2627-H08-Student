package h08.nodes;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A node that supplies a string value with an arbitrary amount of operands(variadic operation):
 * {@link MyStringVariadicFunction}.
 */
public class VariadicNode implements Node {

    private final Object function;
    private final Node[] operands;

    /**
     * @param function the function to be applied to the operands
     * @param operands the operands to apply the function to
     */
    public VariadicNode(Object function, Node... operands) {
        this.function = function;
        this.operands = operands;
    }

    /**
     * Evaluates all operands and applies the variadic function to their results.
     *
     * @return the result of the variadic function application
     */
    @StudentImplementationRequired("H8.5.3")
    @Override
    public String evaluate() {
        // TODO: H8.5.3
        return org.tudalgo.algoutils.student.Student.crash("H8.5.3 - Remove if implemented");
    }
}
