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
    @JsonProperty(SimplifiedMessageMapping.USER_ID)
    private String customerIAK;

    @JsonProperty(SimplifiedMessageMapping.BOT_ID)
    private String botId;

    /**
     * The main field that contains the message content
     */
    @JsonProperty(SimplifiedMessage.SimplifiedMessageMapping.MESSAGES)
    private List<SimplifiedMessagePayload> payloads;


    public String getCustomerIAK() {
        return customerIAK;
    }

    public void setCustomerIAK(String customerIAK) {
        this.customerIAK = customerIAK;
    }

    public List<SimplifiedMessagePayload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<SimplifiedMessagePayload> payloads) {
        this.payloads = payloads;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }

    public interface SimplifiedMessageMapping {
        String USER_ID = "user_id";
        String BOT_ID = "bot_id";
        String MESSAGE_TYPE = "type";
        String MESSAGES = "messages";
    }

    @Override
    public String toString() {
        return "SimplifiedMessage{" +
                "customerIAK='" + customerIAK + '\'' +
                ", botId='" + botId + '\'' +
                ", payloads=" + payloads +
                '}';
    }
}