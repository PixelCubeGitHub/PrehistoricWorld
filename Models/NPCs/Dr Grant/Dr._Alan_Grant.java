// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class custom_model extends ModelBase {
	private final ModelRenderer LBein;
	private final ModelRenderer RBein;
	private final ModelRenderer Koerper;
	private final ModelRenderer LArm;
	private final ModelRenderer RArm;
	private final ModelRenderer Kopf;
	private final ModelRenderer Hut;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		LBein = new ModelRenderer(this);
		LBein.setRotationPoint(0.0F, 24.0F, 0.0F);
		LBein.cubeList.add(new ModelBox(LBein, 16, 48, 0.0F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RBein = new ModelRenderer(this);
		RBein.setRotationPoint(0.0F, 24.0F, 1.0F);
		RBein.cubeList.add(new ModelBox(RBein, 0, 16, -4.0F, -12.0F, -3.0F, 4, 12, 4, 0.0F, false));

		Koerper = new ModelRenderer(this);
		Koerper.setRotationPoint(0.0F, 24.0F, 0.0F);
		Koerper.cubeList.add(new ModelBox(Koerper, 16, 16, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 4.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(0.0F, 24.0F, 0.0F);
		RArm.cubeList.add(new ModelBox(RArm, 32, 48, -8.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));

		Kopf = new ModelRenderer(this);
		Kopf.setRotationPoint(0.0F, 24.0F, 0.0F);
		Kopf.cubeList.add(new ModelBox(Kopf, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.0F, false));

		Hut = new ModelRenderer(this);
		Hut.setRotationPoint(0.0F, 24.0F, 0.0F);
		Hut.cubeList.add(new ModelBox(Hut, 42, 9, -5.0F, -30.0F, 4.0F, 10, 1, 1, 0.0F, false));
		Hut.cubeList.add(new ModelBox(Hut, 42, 9, -5.0F, -30.0F, -5.0F, 10, 1, 1, 0.0F, false));
		Hut.cubeList.add(new ModelBox(Hut, 46, 2, -5.0F, -30.0F, -4.0F, 1, 1, 8, 0.0F, false));
		Hut.cubeList.add(new ModelBox(Hut, 46, 0, 4.0F, -30.0F, -4.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LBein.render(f5);
		RBein.render(f5);
		Koerper.render(f5);
		LArm.render(f5);
		RArm.render(f5);
		Kopf.render(f5);
		Hut.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}