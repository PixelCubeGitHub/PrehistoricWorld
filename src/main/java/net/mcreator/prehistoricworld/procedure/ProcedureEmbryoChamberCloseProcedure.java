package net.mcreator.prehistoricworld.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.prehistoricworld.block.BlockEmbryoChamber;
import net.mcreator.prehistoricworld.ElementsPrehistoricWorld;

@ElementsPrehistoricWorld.ModElement.Tag
public class ProcedureEmbryoChamberCloseProcedure extends ElementsPrehistoricWorld.ModElement {
	public ProcedureEmbryoChamberCloseProcedure(ElementsPrehistoricWorld instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EmbryoChamberCloseProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EmbryoChamberCloseProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EmbryoChamberCloseProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EmbryoChamberCloseProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockEmbryoChamber.block.getDefaultState(), 3);
	}
}
