package net.mcreator.prehistoricworld.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;

import net.mcreator.prehistoricworld.block.BlockEmbryoChamberOpen;
import net.mcreator.prehistoricworld.ElementsPrehistoricWorld;

import java.util.Random;

@ElementsPrehistoricWorld.ModElement.Tag
public class ProcedureEmbryoChamberOpenProcedure extends ElementsPrehistoricWorld.ModElement {
	public ProcedureEmbryoChamberOpenProcedure(ElementsPrehistoricWorld instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EmbryoChamberOpenProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EmbryoChamberOpenProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EmbryoChamberOpenProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EmbryoChamberOpenProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockEmbryoChamberOpen.block.getDefaultState(), 3);
		{
			TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (inv != null && (inv instanceof TileEntityLockableLoot)) {
				ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot((int) (0));
				if (stack != null) {
					if (stack.attemptDamageItem((int) 1, new Random(), null)) {
						stack.shrink(1);
						stack.setItemDamage(0);
					}
				}
			}
		}
	}
}
