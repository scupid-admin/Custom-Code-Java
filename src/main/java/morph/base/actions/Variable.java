package morph.base.actions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author ishan
 * @since 12/06/17
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "variableType",
        visible = true, defaultImpl = StringVariable.class)
@JsonSubTypes({@JsonSubTypes.Type(value = StringVariable.class, name = "STRING"),
        @JsonSubTypes.Type(value = StringArrayVariable.class, name = "STRING_ARRAY"),
        @JsonSubTypes.Type(value = NumberVariable.class, name = "DOUBLE")})
public abstract class Variable {

    private VariableType variableType;

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "variableType=" + variableType +
                '}';
    }
}