package morph.base.beans.variables;

import morph.base.beans.User;

import java.util.List;
import java.util.Map;

/**
 * Created by jayeshathila
 * on 11/05/17.
 */
public class BotContext {

    private Map<String, List<Object>> userVariables;
    private Map<String, List<Object>> flowVariables;
    private Map<String, List<Object>> globalVariables;
    private User user;

    public Map<String, List<Object>> getUserVariables() {
        return userVariables;
    }

    public void setUserVariables(Map<String, List<Object>> userVariables) {
        this.userVariables = userVariables;
    }

    public Map<String, List<Object>> getFlowVariables() {
        return flowVariables;
    }

    public void setFlowVariables(Map<String, List<Object>> flowVariables) {
        this.flowVariables = flowVariables;
    }

    public Map<String, List<Object>> getGlobalVariables() {
        return globalVariables;
    }

    public void setGlobalVariables(Map<String, List<Object>> globalVariables) {
        this.globalVariables = globalVariables;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
