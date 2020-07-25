
package net.mcreator.modum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.modum.ModumModElements;

@ModumModElements.ModElement.Tag
public class ChocolateBarItem extends ModumModElements.ModElement {
	@ObjectHolder("modum:chocolate_bar")
	public static final Item block = null;
	public ChocolateBarItem(ModumModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("chocolate_bar");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 8;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
