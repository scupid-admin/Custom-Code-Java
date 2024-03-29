package morph.base.actions.impl;

import morph.base.actions.Action;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public class GoToFlowAction implements Action {

    public static final String GO_TO_FLOW = "goToFlow";
    private String nextFlowKey;
    private String nextFlowTitle;
    private String name;

    public GoToFlowAction() {
        setName(getName());
    }

    public GoToFlowAction(String nextFlowKey) {
        setName(getName());
        this.nextFlowKey = nextFlowKey;
    }

    public String getNextFlowKey() {
        return nextFlowKey;
    }

    public String getNextFlowTitle() {
        return nextFlowTitle;
    }

    public void setNextFlowTitle(String nextFlowTitle) {
        this.nextFlowTitle = nextFlowTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return GO_TO_FLOW;
    }
}
