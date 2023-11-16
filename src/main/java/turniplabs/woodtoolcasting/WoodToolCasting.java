package turniplabs.woodtoolcasting;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeHelper;


public class WoodToolCasting implements ModInitializer {
    public static final String MOD_ID = "Wood_Tool_Casting";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

		RecipeHelper.craftingManager.addRecipe(new ItemStack(Item.toolPickaxeStone, 1), true, false, new Object[]{
			"CCC",
			" P ",
			'C', Block.cobbleStone,
			'P', Item.toolPickaxeWood
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(Item.toolShovelStone, 1), true, false, new Object[]{
			"C",
			"H",
			'C', Block.cobbleStone,
			'H', Item.toolShovelWood
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(Item.toolAxeStone, 1), true, false, new Object[]{
			"CC",
			"CA",
			'C', Block.cobbleStone,
			'A', Item.toolAxeWood
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(Item.toolSwordStone, 1), true, false, new Object[]{
			"C",
			"C",
			"S",
			'C', Block.cobbleStone,
			'S', Item.toolSwordWood
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(Item.toolHoeStone, 1), true, false, new Object[]{
			"CC",
			" O",
			'C', Block.cobbleStone,
			'O', Item.toolHoeWood
		});

		LOGGER.info("Wood Tool Casting mod initialized.");
	}
}
