package ckathode.weaponmod;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityScorpioid extends EntityMob {

	public EntityScorpioid(World w) {
		super(w);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class,
				1.0D, false));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityPlayer.class, 0, true));
		setSize(0.7F, 0.5F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(80.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.17D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(5D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(35.0D);
	}

	@Override
	protected boolean isAIEnabled() {
		return true;
	}

	@Override
	protected String getLivingSound() {
		return "realmsofchaos:mob.scorpioid.say";
	}

	@Override
	protected String getHurtSound() {
		return "realmsofchaos:mob.scorpioid.hurt";
	}

	@Override
	protected String getDeathSound() {
		return "realmsofchaos:mob.scorpioid.hurt";
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL
				&& this.isValidLightLevel() && this.posY <= 16
				&& super.getCanSpawnHere();
	}
}