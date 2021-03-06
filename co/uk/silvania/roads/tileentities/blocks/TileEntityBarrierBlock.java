package co.uk.silvania.roads.tileentities.blocks;

import java.util.List;

import co.uk.silvania.roads.Roads;
import co.uk.silvania.roads.tileentities.entities.TileEntityBarrierEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityBarrierBlock extends BlockContainer {

	public TileEntityBarrierBlock(int id) {
		super(id, Material.iron);
		this.setCreativeTab(Roads.tabRoads);
		this.setHardness(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBarrierEntity();
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }
	
	public void setBlockBoundsBasedOnState(IBlockAccess block, int x, int y, int z) {
		int meta = block.getBlockMetadata(x, y, z);
    	if (meta == 0) {
        	this.setBlockBounds(0.0F, 0.25F, 0.875F, 1.0F, 0.75F, 1.0F);
    	} else if (meta == 1) {
        	this.setBlockBounds(0.0F, 0.25F, 0.0F, 0.125F, 0.75F, 1.0F);
    	} else if (meta == 2) {
        	this.setBlockBounds(0.0F, 0.25F, 0.0F, 1.0F, 0.75F, 0.125F);
    	} else
        	this.setBlockBounds(0.875F, 0.25F, 0.0F, 1.0F, 0.75F, 1.0F);
	}
	
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB axis, List list, Entity entity) {
       	super.addCollisionBoxesToList(world, x, y, z, axis, list, entity);
    }
	
}
