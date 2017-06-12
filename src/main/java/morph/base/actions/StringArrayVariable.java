package morph.base.actions;

import java.util.List;

/**
 * @author ishan
 * @since 12/06/17
 */
public class StringArrayVariable extends Variable {

    private List<String> values;

    public StringArrayVariable() {
        setVariableType(VariableType.STRING_ARRAY);
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public StringArrayVariable values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return "StringArrayVariable{" +
                "values=" + values +
                "} " + super.toString();
    }
}