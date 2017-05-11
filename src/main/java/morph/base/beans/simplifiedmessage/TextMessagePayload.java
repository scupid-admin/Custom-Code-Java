package morph.base.beans.simplifiedmessage;

import java.util.List;

/**
 * @author ishan
 * @since 30/11/16
 */
public class TextMessagePayload extends SimplifiedMessagePayload {

    private String text;

    private List<Button> buttons;

    public TextMessagePayload() {
        super(MessageType.statement);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public TextMessagePayload text(final String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "TextMessagePayload{" +
                "text='" + text + '\'' +
                ", buttons=" + buttons +
                "} " + super.toString();
    }
}