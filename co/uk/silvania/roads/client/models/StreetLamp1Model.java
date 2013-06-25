package co.uk.silvania.roads.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StreetLamp1Model extends ModelBase
{
  //fields
    ModelRenderer PoleUpper;
    ModelRenderer Stem1;
    ModelRenderer Light1;
    ModelRenderer PoleLower;
    ModelRenderer Joint;
  
  public StreetLamp1Model()
  {
    textureWidth = 32;
    textureHeight = 64;
    
      PoleUpper = new ModelRenderer(this, 0, 0);
      PoleUpper.addBox(0F, 0F, 0F, 2, 48, 2);
      PoleUpper.setRotationPoint(-1F, -72F, -1F);
      PoleUpper.setTextureSize(32, 64);
      PoleUpper.mirror = true;
      setRotation(PoleUpper, 0F, 0F, 0F);
      Stem1 = new ModelRenderer(this, 8, 10);
      Stem1.addBox(-0.5F, 0F, -6F, 2, 1, 6);
      Stem1.setRotationPoint(0F, -74.2F, 0.5F);
      Stem1.setTextureSize(32, 64);
      Stem1.mirror = true;
      setRotation(Stem1, -0.1396263F, 1.570796F, 0F);
      Light1 = new ModelRenderer(this, 8, 0);
      Light1.addBox(-1.5F, -1F, -13.9F, 3, 2, 8);
      Light1.setRotationPoint(0F, -74F, 0F);
      Light1.setTextureSize(32, 64);
      Light1.mirror = true;
      setRotation(Light1, 0F, 1.570796F, 0F);
      PoleLower = new ModelRenderer(this, 0, 0);
      PoleLower.addBox(0F, 0F, 0F, 2, 48, 2);
      PoleLower.setRotationPoint(-1F, -24F, -1F);
      PoleLower.setTextureSize(32, 64);
      PoleLower.mirror = true;
      setRotation(PoleLower, 0F, 0F, 0F);
      Joint = new ModelRenderer(this, 8, 17);
      Joint.addBox(0F, 0F, 0F, 3, 3, 3);
      Joint.setRotationPoint(-1.5F, -74.5F, -1.5F);
      Joint.setTextureSize(32, 64);
      Joint.mirror = true;
      setRotation(Joint, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    PoleUpper.render(f5);
    Stem1.render(f5);
    Light1.render(f5);
    PoleLower.render(f5);
    Joint.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}