package org.getspout.unchecked.server.entity.objects;

import java.util.List;

import org.bukkit.entity.FallingSand;
import org.bukkit.inventory.ItemStack;
import org.getspout.unchecked.server.SpoutServer;
import org.getspout.unchecked.server.SpoutWorld;
import org.getspout.unchecked.server.block.BlockID;
import org.getspout.unchecked.server.entity.Damager;
import org.getspout.unchecked.server.entity.SpoutEntity;
import org.getspout.unchecked.server.msg.Message;
import org.getspout.unchecked.server.msg.SpawnVehicleMessage;
import org.getspout.unchecked.server.util.Position;

public class SpoutFallingBlock extends SpoutEntity implements FallingSand {
	private final int type;

	/**
	 * Creates an entity and adds it to the specified world.
	 *
	 * @param server The server.
	 * @param world The world.
	 * @param blockId The id of the block used for this entity. Can be sand or
	 *            gravel.
	 */
	public SpoutFallingBlock(SpoutServer server, SpoutWorld world, int blockId) {
		super(server, world);
		if (blockId == BlockID.SAND) {
			type = 70;
		} else if (blockId == BlockID.GRAVEL) {
			type = 71;
		} else {
			throw new IllegalArgumentException("Unknown falling block type!");
		}
	}

	@Override
	public Message createSpawnMessage() {
		int x = Position.getIntX(location);
		int y = Position.getIntY(location);
		int z = Position.getIntZ(location);
		return new SpawnVehicleMessage(id, type, x, y, z);
	}

	@Override
	public List<ItemStack> getLoot(Damager damager) {
		return null;
	}
}
