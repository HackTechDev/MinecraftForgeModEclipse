package ckathode.weaponmod.item;

import net.minecraft.item.ItemPickaxe;

import ckathode.weaponmod.BalkonsWeaponMod;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("tutorial:" + unlocalizedName);
	}

}
