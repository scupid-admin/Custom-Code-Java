package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.actions.VariableScope;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class SetVariableAction implements Action {

    private VariableScope variableScope;
    private String variableKey;
    private Object value;

    public SetVariableAction(VariableScope variableScope, String variableKey, Object value) {
        this.variableScope = variableScope;
        this.variableKey = variableKey;
        this.value = value;
    }

    public SetVariableAction(VariableScope variableScope, String variableKey) {
        this(variableScope, variableKey, null);
    }

    public VariableScope getVariableScope() {
        return variableScope;
    }

    public String getVariableKey() {
        return variableKey;
    }

    public Object getValue() {
        return value;
    }

    public void setVariableScope(VariableScope variableScope) {
        this.variableScope = variableScope;
    }

    public void setVariableKey(String variableKey) {
        this.variableKey = variableKey;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return "setVariableAction";
    }
}
