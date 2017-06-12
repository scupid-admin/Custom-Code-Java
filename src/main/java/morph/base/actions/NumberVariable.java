package morph.base.actions;

/**
 * @author ishan
 * @since 12/06/17
 */
public class NumberVariable extends Variable {

    private double value;

    public NumberVariable() {
        setVariableType(VariableType.DOUBLE);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public NumberVariable value(final double value) {
        this.value = value;
        return this;
    }


    @Override
    public String toString() {
        return "DoubleVariable{" +
                "value=" + value +
                "} " + super.toString();
    }
}