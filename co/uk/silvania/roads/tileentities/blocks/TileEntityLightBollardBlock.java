package co.uk.silvania.roads.tileentities.blocks;

import co.uk.silvania.roads.Roads;
import co.uk.silvania.roads.tileentities.entities.TileEntityLightBollardEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityLightBollardBlock extends BlockContainer {

	public TileEntityLightBollardBlock(int id) {
		super(id, Material.iron);
		this.setCreativeTab(Roads.tabRoads);
    	this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.95F, 0.75F);
        this.setLightValue(1.0F);
		this.setHardness(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityLightBollardEntity();
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
}