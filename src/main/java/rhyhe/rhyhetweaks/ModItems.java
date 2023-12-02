package rhyhe.rhyhetweaks;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.*;
import turniplabs.halplibe.helper.ItemHelper;

public class ModItems {
	// method is weird???
	private static final ToolMaterial steeledGold = new ToolMaterial()
		.setDurability(ToolMaterial.steel.getDurability() / 2)
		.setEfficiency(ToolMaterial.iron.getEfficiency(false), ToolMaterial.steel.getEfficiency(true))
		.setMiningLevel(ToolMaterial.steel.getMiningLevel())
		.setSilkTouch(ToolMaterial.gold.isSilkTouch());

	public static Item toolPickaxeSteeledGolden = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolPickaxe("tool.pickaxe.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldenpickaxe", "tool_pickaxe_steeledgold.png");
	public static Item toolAxeSteeledGolden = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolAxe("tool.axe.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldenaxe", "tool_axe_steeledgold.png");
	public static Item toolShovelSteeledGolden = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolShovel("tool.shovel.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldenshovel", "tool_shovel_steeledgold.png");
	public static Item toolSwordSteeledGolden = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolSword("tool.sword.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldensword", "tool_sword_steeledgold.png");
	public static Item toolHoeSteeledGolden = ItemHelper.createItem(RhyheTweaks.MOD_ID, new ItemToolHoe("tool.hoe.steeledgold", ItemHelper.findOpenIds(1), steeledGold), "steeledgoldenhoe", "tool_hoe_steeledgold.png");

	public static void initialize(){

	}


}
