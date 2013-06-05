package co.uk.silvania.roads.block;

import co.uk.silvania.roads.CommonProxy;
import co.uk.silvania.roads.Roads;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class RBYellowFull extends Block {

        public RBYellowFull (int id) {
            super(id, Material.rock);
            this.setHardness(1.0F);
    		this.setStepSound(Block.soundStoneFootstep);
    		this.setCreativeTab(Roads.tabRoads);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.825F, 1.0F);
        }
           
    	@SideOnly(Side.CLIENT)
    	private Icon sides;
    	@SideOnly(Side.CLIENT)
    	private Icon top;

    	public void registerIcons(IconRegister iconRegister) {
            this.top = iconRegister.registerIcon("Roads:TarmacYellowFull");
            this.sides = iconRegister.registerIcon("Roads:TarmacPlain");
    	}
    	
        public int getRenderType() {
            return 16;
            }

        public boolean renderAsNormalBlock() {
            return false;
        }
        
        public boolean isOpaqueCube() {
        	return false;
        }
       
        @SideOnly(Side.CLIENT)
        @Override
        public Icon getIcon(int side, int meta)
        {
        	if (side == 1)
        		return top;
        	return sides;
        }
    }