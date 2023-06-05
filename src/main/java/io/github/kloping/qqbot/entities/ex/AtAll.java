package io.github.kloping.qqbot.entities.ex;

import io.github.kloping.qqbot.api.SenderAndCidMidGetter;
import io.github.kloping.qqbot.entities.qqpd.message.audited.MessageAudited;
import io.github.kloping.qqbot.impl.MessagePacket;

/**
 * @author github.kloping
 */
public class AtAll implements SendAble {

    @Override
    public MessageAudited send(SenderAndCidMidGetter er) {
        MessagePacket packet = new MessagePacket();
        packet.setContent("@everyone");
        return er.send(packet);
    }
}
