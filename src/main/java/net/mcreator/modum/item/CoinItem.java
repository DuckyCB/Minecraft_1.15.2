
package net.mcreator.modum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.modum.itemgroup.UMItemsItemGroup;
import net.mcreator.modum.ModumModElements;

@ModumModElements.ModElement.Tag
public class CoinItem extends ModumModElements.ModElement {
	@ObjectHolder("modum:coin")
	public static final Item block = null;
	public CoinItem(ModumModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(UMItemsItemGroup.tab).maxStackSize(64));
			setRegistryName("coin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
