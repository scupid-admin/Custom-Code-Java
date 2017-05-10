package morph.base.modules.impl;


import morph.base.actions.Action;
import morph.base.actions.impl.GoToFlowAction;
import morph.base.modules.Module;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
@Service
public class SampleCustomModule implements Module {

    @Override
    public String getModuleName() {
        return "sample";
    }

    @Override
    public List<Action> execute() {
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new GoToFlowAction("next", false));
        return actions;
    }
}
