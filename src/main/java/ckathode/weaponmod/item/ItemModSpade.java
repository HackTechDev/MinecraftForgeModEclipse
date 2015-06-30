package ckathode.weaponmod.item;

import net.minecraft.item.ItemSpade;

import ckathode.weaponmod.BalkonsWeaponMod;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName("tutorial:" + unlocalizedName);
	}
}
