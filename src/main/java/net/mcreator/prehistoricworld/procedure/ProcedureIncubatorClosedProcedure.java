package net.mcreator.prehistoricworld.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.prehistoricworld.block.BlockIncubator;
import net.mcreator.prehistoricworld.ElementsPrehistoricWorld;

@ElementsPrehistoricWorld.ModElement.Tag
public class ProcedureIncubatorClosedProcedure extends ElementsPrehistoricWorld.ModElement {
	public ProcedureIncubatorClosedProcedure(ElementsPrehistoricWorld instance) {
		super(instance, 20);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IncubatorClosedProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IncubatorClosedProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IncubatorClosedProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IncubatorClosedProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockIncubator.block.getDefaultState(), 3);
	}
}
