package morph.base.beans.simplifiedmessage;


/**
 * @author ishan
 * @since 03/12/16
 */
public class ListMessagePayload extends CarousalMessagePayload {

    private boolean cover;

    public ListMessagePayload() {
        super();
        //shit hack
        this.setMessageType(MessageType.list);
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "ListMessagePayload{" +
                "cover=" + cover +
                "} " + super.toString();
    }
}