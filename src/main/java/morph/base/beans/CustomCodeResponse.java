package morph.base.beans;

import morph.base.actions.Action;

import java.util.List;

/**
 * @author ishanjain
 * @since 24/07/17
 */
public class CustomCodeResponse {

    private List<Action> actions;

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "CustomCodeResponse{" + "actions=" + actions + '}';
    }
}