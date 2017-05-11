package morph.base.beans.simplifiedmessage;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author aapa
 */
public enum MessageType {
    statement,
    catalogue,
    location,
    carousel,
    /**
     * vertical carousal
     * https://messengerblog.com/platform-updates/introducing-messenger-platform-v1-3-and-new-ways-to-drive-the
     * -conversation/
     * https://developers.facebook.com/docs/messenger-platform/changelog
     * https://developers.facebook.com/docs/messenger-platform/send-api-reference/list-template
     */
    list,
    media,
    button,
    //https://developers.facebook.com/docs/messenger-platform/send-api-reference/receipt-template
    receipt,
    //https://developers.facebook.com/docs/messenger-platform/referral-params
    referral,
    url,
    fallback
}
