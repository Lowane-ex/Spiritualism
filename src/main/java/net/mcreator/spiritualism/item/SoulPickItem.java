
package net.mcreator.spiritualism.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.spiritualism.itemgroup.SpiritualismItemGroup;
import net.mcreator.spiritualism.SpiritualismModElements;

import java.util.List;

@SpiritualismModElements.ModElement.Tag
public class SoulPickItem extends SpiritualismModElements.ModElement {
	@ObjectHolder("spiritualism:soul_pick")
	public static final Item block = null;
	public SoulPickItem(SpiritualismModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(SpiritualismItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u0412\u044B \u0441\u043B\u044B\u0448\u0438\u0442\u0435 \u0442\u0440\u0435\u0441\u043A \u043A\u0430\u043C\u043D\u044F"));
			}
		}.setRegistryName("soul_pick"));
	}
}
