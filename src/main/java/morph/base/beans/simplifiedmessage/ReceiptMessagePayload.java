package morph.base.beans.simplifiedmessage;

import com.altin.morphbase.message.beans.field.BaseReceiptField;
import com.altin.morphbase.message.beans.field.ReceiptAdjustmentField;
import com.altin.morphbase.message.beans.field.ReceiptElementField;
import com.altin.morphbase.message.enums.MessageType;

import java.util.List;

/**
 * @author ishan
 * @since 01/12/16
 */
public class ReceiptMessagePayload extends SimplifiedMessagePayload {

    //this added one more layer of hierarchy of json but no other way than repeating things. Curse you Java for not
    // supporting multiple inheritences
    private BaseReceiptField baseData;

    private List<ReceiptAdjustmentField> adjustments;

    private List<ReceiptElementField> elements;

    public ReceiptMessagePayload() {
        super(MessageType.receipt);
    }

    public BaseReceiptField getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseReceiptField baseData) {
        this.baseData = baseData;
    }

    public List<ReceiptAdjustmentField> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<ReceiptAdjustmentField> adjustments) {
        this.adjustments = adjustments;
    }

    public List<ReceiptElementField> getElements() {
        return elements;
    }

    public void setElements(List<ReceiptElementField> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "ReceiptMessagePayload{" +
                "baseData=" + baseData +
                ", adjustments=" + adjustments +
                ", elements=" + elements +
                "} " + super.toString();
    }
}