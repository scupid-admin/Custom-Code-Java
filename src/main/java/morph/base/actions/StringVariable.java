package morph.base.actions;

/**
 * @author ishan
 * @since 12/06/17
 */
public class StringVariable extends Variable {

    private String value;

    public StringVariable() {
        setVariableType(VariableType.STRING);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringVariable value(final String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "StringVariable{" +
                "value='" + value + '\'' +
                "} " + super.toString();
    }
}