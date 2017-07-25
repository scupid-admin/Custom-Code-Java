package morph.base.beans.simplifiedmessage;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

/**
 * @author ishan
 * @since 30/11/16
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, visible = false, property
        = "type", defaultImpl = Void.class)
@JsonSubTypes({@JsonSubTypes.Type(value = TextMessagePayload.class, name = "statement"),
        @JsonSubTypes.Type(value = CarousalMessagePayload.class, name = "carousel"),
        @JsonSubTypes.Type(value = ListMessagePayload.class, name = "list"),
        @JsonSubTypes.Type(value = MediaMessagePayload.class, name = "media")})
public abstract class SimplifiedMessagePayload {

    private List<SuggestionElement> suggestionElements;

    private MessageType messageType;

    public SimplifiedMessagePayload(MessageType messageType) {
        this.messageType = messageType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public List<SuggestionElement> getSuggestionElements() {
        return suggestionElements;
    }

    public void setSuggestionElements(List<SuggestionElement> suggestionElements) {
        this.suggestionElements = suggestionElements;
    }

    @Override
    public String toString() {
        return "SimplifiedMessagePayload{" +
                "suggestionElements=" + suggestionElements +
                ", messageType=" + messageType +
                '}';
    }
}