package morph.base.actions;

/**
 * @author ishan
 * @since 12/06/17
 */
public abstract class Variable {

    private VariableType variableType;

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "variableType=" + variableType +
                '}';
    }
}