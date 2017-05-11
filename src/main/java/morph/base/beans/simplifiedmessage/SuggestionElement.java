package morph.base.beans.simplifiedmessage;


/**
 * @author ishan
 * @since 30/11/16
 */
public class SuggestionElement {

    public enum SuggestionType {
        LOCATION,
        TEXT
    }

    private String title;

    private SuggestionType suggestionType = SuggestionType.TEXT;

    private String payload;

    private String imageUrl;

    private ActionPayload actionPayload;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SuggestionType getSuggestionType() {
        return suggestionType;
    }

    public void setSuggestionType(SuggestionType suggestionType) {
        this.suggestionType = suggestionType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ActionPayload getActionPayload() {
        return actionPayload;
    }

    public void setActionPayload(ActionPayload actionPayload) {
        this.actionPayload = actionPayload;
    }

    @Override
    public String toString() {
        return "SuggestionElement{" +
                "title='" + title + '\'' +
                ", suggestionType=" + suggestionType +
                ", payload='" + payload + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", actionPayload=" + actionPayload +
                '}';
    }
}