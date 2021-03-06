package org.getspout.unchecked.server.msg.handler;

import org.getspout.unchecked.server.entity.SpoutPlayer;
import org.getspout.unchecked.server.msg.EntityActionMessage;
import org.getspout.unchecked.server.net.Session;

/**
 * A {@link MessageHandler} which handles {@link Entity} action messages.
 */
public final class EntityActionMessageHandler extends MessageHandler<EntityActionMessage> {
	@Override
	public void handle(Session session, SpoutPlayer player, EntityActionMessage message) {
		switch (message.getAction()) {
			case EntityActionMessage.ACTION_SNEAKING:
				player.setSneaking(true);
				break;
			case EntityActionMessage.ACTION_STOP_SNEAKING:
				player.setSneaking(false);
				break;
			default:
				// TODO: bed support
				return;
		}
	}
}
