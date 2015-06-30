package ckathode.weaponmod.item;

import net.minecraft.item.ItemHoe;

import ckathode.weaponmod.BalkonsWeaponMod;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("weaponmod:" + unlocalizedName);
	}

}
