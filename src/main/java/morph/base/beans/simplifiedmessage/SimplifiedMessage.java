package morph.base.beans.simplifiedmessage;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 *
 * @author ishan
 * @since 30/11/16
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimplifiedMessage {

    /**
     * Represents the customer interface account key
     */
    private String userId;

    private String botId;

    /**
     * The main field that contains the message content
     */
    private List<SimplifiedMessagePayload> messages;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<SimplifiedMessagePayload> getMessages() {
        return messages;
    }

    public void setMessages(List<SimplifiedMessagePayload> messages) {
        this.messages = messages;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    @Override
    public String toString() {
        return "SimplifiedMessage{" +
                "userId='" + userId + '\'' +
                ", botId='" + botId + '\'' +
                ", messages=" + messages +
                '}';
    }
}