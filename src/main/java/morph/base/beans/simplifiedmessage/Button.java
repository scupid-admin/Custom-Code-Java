package morph.base.beans.simplifiedmessage;

/**
 * @author ishan
 * @since 30/11/16
 */
public class Button {

    public enum WebviewHeightRatio {
        FULL("full"),
        COMPACT("compact"),
        TALL("tall");

        private final String key;

        WebviewHeightRatio(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }

    public enum ButtonType {
        POSTBACK,
        URL,
        CALL,
        SHARE,
        BUY
    }

    private String title;

    private String url;

    private String payload;

    private ActionPayload actionPayload;

    private WebviewHeightRatio webviewHeightRatio;

    private ButtonType buttonType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public WebviewHeightRatio getWebviewHeightRatio() {
        return webviewHeightRatio;
    }

    public void setWebviewHeightRatio(WebviewHeightRatio webviewHeightRatio) {
        this.webviewHeightRatio = webviewHeightRatio;
    }

    public ButtonType getButtonType() {
        return buttonType;
    }

    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }

    public ActionPayload getActionPayload() {
        return actionPayload;
    }

    public void setActionPayload(ActionPayload actionPayload) {
        this.actionPayload = actionPayload;
    }

    @Override
    public String toString() {
        return "Button{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", payload='" + payload + '\'' +
                ", webviewHeightRatio=" + webviewHeightRatio +
                ", buttonType=" + buttonType +
                '}';
    }
}