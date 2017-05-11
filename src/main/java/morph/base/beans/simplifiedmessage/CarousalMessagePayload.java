package morph.base.beans.simplifiedmessage;


import java.util.List;

/**
 * @author ishan
 * @since 30/11/16
 */
public class CarousalMessagePayload extends SimplifiedMessagePayload {

    private List<Element> carousalElements;

    public CarousalMessagePayload() {
        super(MessageType.carousel);
    }

    public List<Element> getCarousalElements() {
        return carousalElements;
    }

    public void setCarousalElements(List<Element> carousalElements) {
        this.carousalElements = carousalElements;
    }

    @Override
    public String toString() {
        return "CarousalMessagePayload{" +
                "carousalElements=" + carousalElements +
                "} " + super.toString();
    }
}