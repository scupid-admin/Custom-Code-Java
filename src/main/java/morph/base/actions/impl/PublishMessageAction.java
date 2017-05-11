package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.beans.simplifiedmessage.SimplifiedMessage;

/**
 * Created by jayeshathila
 * on 10/05/17.
 */
public class PublishMessageAction implements Action {

    private SimplifiedMessage simplifiedMessage;

    public SimplifiedMessage getSimplifiedMessage() {
        return simplifiedMessage;
    }

    public void setSimplifiedMessage(SimplifiedMessage simplifiedMessage) {
        this.simplifiedMessage = simplifiedMessage;
    }

    @Override
    public String getName() {
        return "publish";
    }
}
