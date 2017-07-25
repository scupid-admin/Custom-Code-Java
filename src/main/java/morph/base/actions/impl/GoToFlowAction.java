package morph.base.actions.impl;

import morph.base.actions.Action;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class GoToFlowAction implements Action {

    public static final String GO_TO_FLOW = "goToFlow";
    private final String nextFlowKey;


    public GoToFlowAction(String nextFlowKey, boolean rerunCurrectFlow) {
        this.nextFlowKey = nextFlowKey;
    }

    public String getNextFlowKey() {
        return nextFlowKey;
    }

    @Override
    public String getName() {
        return GO_TO_FLOW;
    }
}
