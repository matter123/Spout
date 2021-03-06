package org.getspout.unchecked.server.entity.objects;

import org.bukkit.entity.Arrow;
import org.getspout.unchecked.server.SpoutServer;
import org.getspout.unchecked.server.SpoutWorld;

public class SpoutArrow extends SpoutProjectile implements Arrow {
	/**
	 * Creates an entity and adds it to the specified world.
	 *
	 * @param server The server.
	 * @param world The world.
	 */
	public SpoutArrow(SpoutServer server, SpoutWorld world) {
		super(server, world, 10);
	}
}
