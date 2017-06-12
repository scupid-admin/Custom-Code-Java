package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.actions.Variable;
import morph.base.actions.VariableScope;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class SetVariableAction implements Action {

    private VariableScope variableScope;
    private String variableKey;
    private Variable variable;

    public SetVariableAction(VariableScope variableScope, String variableKey, Variable
            variable) {
        this.variableScope = variableScope;
        this.variableKey = variableKey;
        this.variable = variable;
    }

    public VariableScope getVariableScope() {
        return variableScope;
    }

    public void setVariableScope(VariableScope variableScope) {
        this.variableScope = variableScope;
    }

    public String getVariableKey() {
        return variableKey;
    }

    public void setVariableKey(String variableKey) {
        this.variableKey = variableKey;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }


    @Override
    public String getName() {
        return "setVariableAction";
    }

    @Override
    public String toString() {
        return "SetVariableAction{" +
                "variableScope=" + variableScope +
                ", variableKey='" + variableKey + '\'' +
                ", variable=" + variable +
                '}';
    }
}
