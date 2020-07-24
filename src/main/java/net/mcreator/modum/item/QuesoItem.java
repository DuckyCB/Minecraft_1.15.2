
package net.mcreator.modum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.modum.itemgroup.UMItemsItemGroup;
import net.mcreator.modum.ModumModElements;

@ModumModElements.ModElement.Tag
public class QuesoItem extends ModumModElements.ModElement {
	@ObjectHolder("modum:queso")
	public static final Item block = null;
	public QuesoItem(ModumModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(UMItemsItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(3).saturation(0.3f).build()));
			setRegistryName("queso");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
