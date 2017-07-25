package morph.base.actions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import morph.base.actions.impl.GoToFlowAction;
import morph.base.actions.impl.PublishMessageAction;
import morph.base.actions.impl.SetVariableAction;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, visible = true, property =
        "name", defaultImpl = Void.class)
@JsonSubTypes({@JsonSubTypes.Type(value = PublishMessageAction.class, name = PublishMessageAction.PUBLISH),
        @JsonSubTypes.Type(value = GoToFlowAction.class, name = GoToFlowAction.GO_TO_FLOW),
        @JsonSubTypes.Type(value = SetVariableAction.class, name = SetVariableAction.SET_VARIABLE)})
public interface Action {

    String getName();
}
