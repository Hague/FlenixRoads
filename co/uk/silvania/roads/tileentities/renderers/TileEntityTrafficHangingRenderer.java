package co.uk.silvania.roads.tileentities.renderers;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.roads.Roads;
import co.uk.silvania.roads.client.models.TrafficHangingModel;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class TileEntityTrafficHangingRenderer extends TileEntitySpecialRenderer {
	
	private final TrafficHangingModel model;
	private final boolean powered;
		
	public TileEntityTrafficHangingRenderer(boolean power) {
		this.model = new TrafficHangingModel();
		this.powered = power;
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		int i = te.getBlockMetadata();
		int meta = 180;

		if (i == 3) {
			meta = 0;
		}

		if (i == 5) {
			meta = 90;
		}

		if (i == 2) {
			meta = 180;
		}

		if (i == 4) {
			meta = 270;
		}
		if (this.powered == true) {
			bindTextureByName("/mods/Roads/textures/blocks/TrafficHangingRed.png");
		} else {
			bindTextureByName("/mods/Roads/textures/blocks/TrafficHangingGreen.png");
		}
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(meta, 0.0F, 1.0F, 0.0F);
		//GL11.glRotatef(((TileEntityBarrierEntity)tile).getRotationPivot()), 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
	
	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getBlockBrightness(world, i, j, k);
		int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
		int modulousModifier = skyLight % 65536;
		int divModifier = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
	}
}