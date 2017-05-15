package morph.base.beans.variables;

import morph.base.beans.User;

import java.util.Map;

/**
 * Created by jayeshathila
 * on 11/05/17.
 */
public class BotContext {

    private Map<String, Object> userVariables;
    private Map<String, Object> flowVariables;
    private Map<String, Object> globalVariables;
    private User user;

    public Map<String, Object> getUserVariables() {
        return userVariables;
    }

    public void setUserVariables(Map<String, Object> userVariables) {
        this.userVariables = userVariables;
    }

    public Map<String, Object> getFlowVariables() {
        return flowVariables;
    }

    public void setFlowVariables(Map<String, Object> flowVariables) {
        this.flowVariables = flowVariables;
    }

    public Map<String, Object> getGlobalVariables() {
        return globalVariables;
    }

    public void setGlobalVariables(Map<String, Object> globalVariables) {
        this.globalVariables = globalVariables;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
