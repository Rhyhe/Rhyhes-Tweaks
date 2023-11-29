package rhyhe.rhyhetweaks;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	// method is weird???
	private static final ToolMaterial steeledGold = new ToolMaterial()
		.setDurability(ToolMaterial.steel.getDurability() / 2)
		.setEfficiency(ToolMaterial.gold.getEfficiency(false), ToolMaterial.steel.getEfficiency(true))
		.setMiningLevel(ToolMaterial.steel.getMiningLevel())
		.setSilkTouch(ToolMaterial.gold.isSilkTouch());
	public static Item SteeledGoldenPickaxe = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolPickaxe("tool.pickaxe.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldenpickaxe", "steeledgoldenpickaxe.png");

	public static void initialize(){

	}


}
