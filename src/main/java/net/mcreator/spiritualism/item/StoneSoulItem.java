
package net.mcreator.spiritualism.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.spiritualism.itemgroup.SpiritualismItemGroup;
import net.mcreator.spiritualism.SpiritualismModElements;

@SpiritualismModElements.ModElement.Tag
public class StoneSoulItem extends SpiritualismModElements.ModElement {
	@ObjectHolder("spiritualism:stone_soul")
	public static final Item block = null;
	public StoneSoulItem(SpiritualismModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SpiritualismItemGroup.tab).maxStackSize(64));
			setRegistryName("stone_soul");
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
