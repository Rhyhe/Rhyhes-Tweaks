package rhyhe.rhyhetweaks;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeHelper;

public class SteeledGoldenRecipes {

	public static void initialize(){
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
