package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.actions.VariableScope;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class SetVariableAction implements Action {

    private final VariableScope variableScope;
    private final String variableKey;

    public SetVariableAction(VariableScope variableScope, String variableKey) {
        this.variableScope = variableScope;
        this.variableKey = variableKey;
    }

    public VariableScope getVariableScope() {
        return variableScope;
    }

    public String getVariableKey() {
        return variableKey;
    }

    @Override
    public String getName() {
        return "setVariableAction";
    }
}
