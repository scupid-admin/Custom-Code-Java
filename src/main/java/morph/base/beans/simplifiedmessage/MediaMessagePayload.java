package morph.base.beans.simplifiedmessage;

/**
 * @author ishan
 * @since 28/01/17
 */
public class MediaMessagePayload extends SimplifiedMessagePayload {

    private String mediaUrl;

    private String mediaType;

    public MediaMessagePayload() {
        super(MessageType.media);
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "MediaListPayload{" +
                "mediaUrl='" + mediaUrl + '\'' +
                ", mediaType='" + mediaType + '\'' +
                "} " + super.toString();
    }
}