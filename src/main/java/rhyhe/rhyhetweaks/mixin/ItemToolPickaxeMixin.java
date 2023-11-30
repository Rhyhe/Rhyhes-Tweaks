package rhyhe.rhyhetweaks.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.player.inventory.InventoryPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = ItemToolPickaxe.class, remap = false)
public class ItemToolPickaxeMixin {

    @Unique
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        InventoryPlayer inventory = entityplayer.inventory;
        ItemStack torches = null;
        int slot = 0;

        for(int i = 0; i < inventory.mainInventory.length; i++){
            ItemStack item = inventory.getStackInSlot(i);
            if(item == null) continue;
            if(item.itemID == Block.torchCoal.id){
                torches = item;
                slot = i;
            }
        }

        if(torches == null){
            return false;
        }

        torches.useItem(entityplayer, world, blockX, blockY, blockZ, side, xPlaced, yPlaced);

        if(torches.stackSize == 0){
            inventory.mainInventory[slot] = null;
        }

        return true;

    }
}
