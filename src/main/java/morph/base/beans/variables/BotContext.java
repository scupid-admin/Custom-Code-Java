package morph.base.beans.variables;

import morph.base.beans.User;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Optional;

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

    public Optional<Object> getFlowVariable(String key) {
        if (StringUtils.isEmpty(key) || flowVariables.get(key) == null) {
            return Optional.empty();
        }

        return Optional.of(flowVariables.get(key));
    }

    public Optional<Object> getUserVariable(String key) {
        if (StringUtils.isEmpty(key) || userVariables.get(key) == null) {
            return Optional.empty();
        }

        return Optional.of(userVariables.get(key));
    }

    public Optional<Object> getGlobalVariable(String key) {
        if (StringUtils.isEmpty(key) || globalVariables.get(key) == null) {
            return Optional.empty();
        }

        return Optional.of(globalVariables.get(key));
    }
}
