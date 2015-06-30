package ckathode.weaponmod.item;

import net.minecraft.item.ItemAxe;

import ckathode.weaponmod.BalkonsWeaponMod;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("weaponmod:" + unlocalizedName);
	}
}
