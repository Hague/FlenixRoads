package co.uk.silvania.roads.roadblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import co.uk.silvania.roads.Roads;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RoadBlockArrows extends Block {
    public RoadBlockArrows(int par1) {
        super(par1, Material.rock);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(1.5F);
        this.setCreativeTab(Roads.tabRoads);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.825F, 1.0F);
    }
    
    public void roadBlockBounds(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        this.setBlockBounds(par1, par2, par3, par4, par5, par6);
    }
    
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	@SideOnly(Side.CLIENT)
	private Icon sides;
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemStack)
	{
	    int blockSet = world.getBlockMetadata(x, y, z) / 4;
	    int direction = MathHelper.floor_double((double)(entityliving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
	    int newMeta = (blockSet * 4) + direction;
	    world.setBlockMetadataWithNotify(x, y, z, newMeta, 0);
	}
    	
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
    	this.sides = iconRegister.registerIcon("Roads:TarmacPlain");
		icons = new Icon[16];
		
		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("Roads:" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}
    
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		if (side == 1) {
			return icons[meta];	
		} else
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
		list.add(new ItemStack(par1, 1, 0));
		list.add(new ItemStack(par1, 1, 4));
		list.add(new ItemStack(par1, 1, 8));
		list.add(new ItemStack(par1, 1, 12));
	}
}