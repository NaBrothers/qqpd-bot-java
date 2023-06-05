package io.github.kloping.qqbot.entities.ex;

import io.github.kloping.qqbot.api.SenderAndCidMidGetter;
import io.github.kloping.qqbot.entities.qqpd.message.audited.MessageAudited;
import io.github.kloping.qqbot.impl.MessagePacket;
import lombok.Data;

/**
 * @author github.kloping
 */
@Data
public class PlainText implements SendAble {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public MessageAudited send(SenderAndCidMidGetter er) {
        MessagePacket packet = new MessagePacket();
        packet.setContent(toString());
        return er.send(packet);
    }

    @Override
    public String toString() {
        return text;
    }
}
