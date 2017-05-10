package morph.base.modules;

import morph.base.actions.Action;

import java.util.List;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
public interface Module {

    String getModuleName();

    List<Action> execute();

}
