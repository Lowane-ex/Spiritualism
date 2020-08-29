
package net.mcreator.spiritualism.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.spiritualism.item.WoodSoulItem;
import net.mcreator.spiritualism.SpiritualismModElements;

@SpiritualismModElements.ModElement.Tag
public class SpiritualismItemGroup extends SpiritualismModElements.ModElement {
	public SpiritualismItemGroup(SpiritualismModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspiritualism") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WoodSoulItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
