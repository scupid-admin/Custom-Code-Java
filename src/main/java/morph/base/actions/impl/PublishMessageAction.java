package morph.base.actions.impl;

import morph.base.actions.Action;
import morph.base.beans.simplifiedmessage.SimplifiedMessage;

/**
 * Created by jayeshathila
 * on 10/05/17.
 */
public class PublishMessageAction implements Action {

    public static final String PUBLISH = "publish";

    private String name;
    private SimplifiedMessage simplifiedMessage;

    public PublishMessageAction() {
        setName(PUBLISH);
    }

    public SimplifiedMessage getSimplifiedMessage() {
        return simplifiedMessage;
    }

    public void setSimplifiedMessage(SimplifiedMessage simplifiedMessage) {
        this.simplifiedMessage = simplifiedMessage;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return PUBLISH;
    }
}
