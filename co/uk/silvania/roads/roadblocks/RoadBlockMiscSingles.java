package co.uk.silvania.roads.roadblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import co.uk.silvania.roads.Roads;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RoadBlockMiscSingles extends Block {
    public RoadBlockMiscSingles(int par1) {
        super(par1, Material.rock);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(1.5F);
        this.setCreativeTab(Roads.tabRoads);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    }
    
    public void roadBlockBounds(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        this.setBlockBounds(par1, par2, par3, par4, par5, par6);
    }
    
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	@SideOnly(Side.CLIENT)
	private Icon sides;
    	
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
    	this.sides = iconRegister.registerIcon("Roads:TarmacPlain");
		icons = new Icon[7];
		
		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("Roads:" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}
    
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBoundsForItemRender();
    }
    
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		if (side == 1) {
			return icons[meta];	
		}
		if (meta == 5 && side == 0) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 5 && side == 2) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 5 && side == 3) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 5 && side == 4) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 5 && side == 5) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 6) {
			return Block.dirt.getIcon(side, meta);
		}
		if (meta == 6 && side == 1) {
			return Block.dirt.getIcon(side, meta);
		}
		
		return sides;
	}

    public int getRenderType() {
    	return 0;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
	public boolean renderAsNormalBlock() {
		return false;
	}
    
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list) {
		for (int var4 = 0; var4 < 7; ++var4) {
			list.add(new ItemStack(par1, 1, var4));
		}
	}

    @Override
    public int damageDropped(int meta) {
    	return meta;
    }
}