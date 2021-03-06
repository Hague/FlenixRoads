package co.uk.silvania.roads;

import co.uk.silvania.roads.tileentities.ContainerRoadPainter;
import co.uk.silvania.roads.tileentities.GuiRoadPainter;
import co.uk.silvania.roads.tileentities.entities.TileEntityRoadPainterEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
 

		public GuiHandler() {
		}
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityRoadPainterEntity) {
                        return new ContainerRoadPainter(player.inventory,/* (TileEntityRoadPainterEntity) tileEntity,*/ world, x, y, z);
                }	
        	}
        }
			return null;	
    }

        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityRoadPainterEntity) {
                        return new GuiRoadPainter(player.inventory,/* (TileEntityRoadPainterEntity) tileEntity,*/ world, x, y, z);
                }	
        	}
        }
			return null;
    }
}