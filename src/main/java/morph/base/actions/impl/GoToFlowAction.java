package morph.base.actions.impl;

import morph.base.actions.Action;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class GoToFlowAction implements Action {

    private final String nextFlowKey;
    private final boolean rerunCurrentFlow;

    public GoToFlowAction(String nextFlowKey, boolean rerunCurrectFlow) {
        this.nextFlowKey = nextFlowKey;
        this.rerunCurrentFlow = rerunCurrectFlow;
    }

    public String getNextFlowKey() {
        return nextFlowKey;
    }

    public boolean isRerunCurrentFlow() {
        return rerunCurrentFlow;
    }

    @Override
    public String getName() {
        return "goToFlowAction";
    }
}
