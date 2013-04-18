package co.uk.silvania.roads;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RBWhiteFull extends Block {

        public RBWhiteFull (int id, int texture, Material material) {
                super(id, texture, material);
        }
        
        public int getBlockTextureFromSide(int side){
        	if(side == 1){
        		return 13;
        	}else{
        		return 1;
        		}
        	}
        
        @Override
        public String getTextureFile () {
                return CommonProxy.BLOCK_PNG;
        }

}