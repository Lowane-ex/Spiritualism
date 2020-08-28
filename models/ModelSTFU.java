
public static class ModelSTFU extends ModelBase {
	public final int MCA_MIN_REQUESTED_VERSION = 1;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer 1;MCAModelRenderer 3;MCAModelRenderer 2;
public ModelSTFU()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 16;
textureHeight = 16;

1 = new MCAModelRenderer(this, "1", 0, 11);
1.mirror = false;
1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1);
1.setInitialRotationPoint(0.0F, -8.0F, 4.0F);
1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
1.setTextureSize(16, 16);
parts.put(1.boxName, 1);

3 = new MCAModelRenderer(this, "3", 0, 0);
3.mirror = false;
3.addBox(0.0F, -7.0F, -1.0F, 5, 5, 1);
3.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
3.setTextureSize(16, 16);
parts.put(3.boxName, 3);

2 = new MCAModelRenderer(this, "2", 0, 0);
2.mirror = false;
2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4);
2.setInitialRotationPoint(0.0F, -9.0F, 0.0F);
2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
2.setTextureSize(16, 16);
parts.put(2.boxName, 2);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
EntitySTFU entity = (EntitySTFU)par1Entity;

//Render every non-child part
1.render(par7);
3.render(par7);
2.render(par7);

AnimationHandler.performAnimationInModel(parts, entity);
}
	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
			Entity par7Entity) {
	}

	public MCAModelRenderer getModelRendererFromName(String name) {
		return parts.get(name) != null ? parts.get(name) : null;
	}
}