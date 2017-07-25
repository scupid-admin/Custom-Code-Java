package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.actions.Variable;
import morph.base.actions.VariableScope;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class SetVariableAction implements Action {

    public static final String SET_VARIABLE = "setVariableAction";
    private VariableScope variableScope;
    private String variableKey;
    private String variableTitle;
    private Variable variable;

    public SetVariableAction(VariableScope variableScope, String variableKey, Variable variable) {
        this.variableScope = variableScope;
        this.variableKey = variableKey;
        this.variable = variable;
    }

    public SetVariableAction(String variableTitle, VariableScope variableScope, Variable variable) {
        this.variableTitle = variableTitle;
        this.variableScope = variableScope;
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

    public String getVariableTitle() {
        return variableTitle;
    }

    public void setVariableTitle(String variableTitle) {
        this.variableTitle = variableTitle;
    }

    @Override
    public String getName() {
        return SET_VARIABLE;
    }

    @Override
    public String toString() {
        return "SetVariableAction{" + "variableScope=" + variableScope + ", variableKey='" + variableKey + '\'' +
                ", variable=" + variable + '}';
    }
}
