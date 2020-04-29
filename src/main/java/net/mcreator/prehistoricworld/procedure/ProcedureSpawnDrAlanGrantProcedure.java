package net.mcreator.prehistoricworld.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.prehistoricworld.entity.EntityDrAlanGrant;
import net.mcreator.prehistoricworld.ElementsPrehistoricWorld;

@ElementsPrehistoricWorld.ModElement.Tag
public class ProcedureSpawnDrAlanGrantProcedure extends ElementsPrehistoricWorld.ModElement {
	public ProcedureSpawnDrAlanGrantProcedure(ElementsPrehistoricWorld instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SpawnDrAlanGrantProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SpawnDrAlanGrantProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SpawnDrAlanGrantProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpawnDrAlanGrantProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityDrAlanGrant.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
