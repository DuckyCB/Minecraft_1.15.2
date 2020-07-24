
package net.mcreator.modum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.modum.ModumModElements;

@ModumModElements.ModElement.Tag
public class SliceofcheeseItem extends ModumModElements.ModElement {
	@ObjectHolder("modum:sliceofcheese")
	public static final Item block = null;
	public SliceofcheeseItem(ModumModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(1).saturation(0.3f).build()));
			setRegistryName("sliceofcheese");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
