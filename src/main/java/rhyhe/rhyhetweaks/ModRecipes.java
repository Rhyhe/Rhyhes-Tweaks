package rhyhe.rhyhetweaks;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeHelper;

public class ModRecipes {

	public static void initialize(){
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

		RecipeHelper.craftingManager.addRecipe(new ItemStack(ModItems.toolPickaxeSteeledGolden, 1), true, false, new Object[]{
			"SSS",
			" G ",
			'S', Item.ingotSteel,
			'G', Item.toolPickaxeGold
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(ModItems.toolAxeSteeledGolden, 1), true, false, new Object[]{
				"SS",
				"SG",
				'S', Item.ingotSteel,
				'G', Item.toolAxeGold
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(ModItems.toolShovelSteeledGolden, 1), true, false, new Object[]{
				"S",
				"G",
				'S', Item.ingotSteel,
				'G', Item.toolShovelGold
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(ModItems.toolSwordSteeledGolden, 1), true, false, new Object[]{
				"S",
				"S",
				"G",
				'S', Item.ingotSteel,
				'G', Item.toolSwordGold
		});

		RecipeHelper.craftingManager.addRecipe(new ItemStack(ModItems.toolHoeSteeledGolden, 1), true, false, new Object[]{
				"SS",
				" G",
				'S', Item.ingotSteel,
				'G', Item.toolHoeGold
		});

	}
}
