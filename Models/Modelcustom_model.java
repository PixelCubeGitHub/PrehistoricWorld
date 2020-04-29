// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer RBein;
	private final ModelRenderer Fuss;
	private final ModelRenderer Oberschenkel;
	private final ModelRenderer Unterschenkel;
	private final ModelRenderer LBein;
	private final ModelRenderer Fuss2;
	private final ModelRenderer Oberschenkel2;
	private final ModelRenderer Unterschenkel2;
	private final ModelRenderer LBeinHinten;
	private final ModelRenderer Fuss3;
	private final ModelRenderer Unterschenkel3;
	private final ModelRenderer Oberschenkel3;
	private final ModelRenderer RBeinHinten;
	private final ModelRenderer Fuss4;
	private final ModelRenderer Unterschenkel4;
	private final ModelRenderer Oberschenkel4;
	private final ModelRenderer Koerper;
	private final ModelRenderer Bauch;
	private final ModelRenderer Bauch2;
	private final ModelRenderer Bauch3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer Kopf;
	private final ModelRenderer Schild;
	private final ModelRenderer Stacheln;
	private final ModelRenderer Kopf2;
	private final ModelRenderer Kopf3;
	private final ModelRenderer Hoerner;
	private final ModelRenderer Hoerner2;
	private final ModelRenderer Hoerner3;
	private final ModelRenderer Schwanz;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public Modelcustom_model() {
		textureWidth = 128;
		textureHeight = 128;

		RBein = new ModelRenderer(this);
		RBein.setRotationPoint(-6.0F, 11.0F, -9.0F);

		Fuss = new ModelRenderer(this);
		Fuss.setRotationPoint(6.0F, 13.0F, 9.0F);
		RBein.addChild(Fuss);
		Fuss.cubeList.add(new ModelBox(Fuss, 0, 48, -8.2105F, -1.9895F, -12.2F,
				4, 2, 4, 0.0F, false));

		Oberschenkel = new ModelRenderer(this);
		Oberschenkel.setRotationPoint(6.0F, 13.0F, 9.0F);
		setRotationAngle(Oberschenkel, 0.4363F, 0.0F, 0.0F);
		RBein.addChild(Oberschenkel);
		Oberschenkel.cubeList.add(new ModelBox(Oberschenkel, 50, 48, -8.2105F,
				-17.7601F, -4.3682F, 4, 9, 4, 0.0F, false));

		Unterschenkel = new ModelRenderer(this);
		Unterschenkel.setRotationPoint(6.0F, 13.0F, 9.0F);
		setRotationAngle(Unterschenkel, -0.5236F, 0.0F, 0.0F);
		RBein.addChild(Unterschenkel);
		Unterschenkel.cubeList.add(new ModelBox(Unterschenkel, 34, 48,
				-8.0105F, -4.723F, -11.387F, 4, 9, 4, 0.0F, false));

		LBein = new ModelRenderer(this);
		LBein.setRotationPoint(6.0F, 11.0F, -9.0F);

		Fuss2 = new ModelRenderer(this);
		Fuss2.setRotationPoint(6.0F, 13.0F, 9.0F);
		LBein.addChild(Fuss2);
		Fuss2.cubeList.add(new ModelBox(Fuss2, 0, 48, -8.2105F, -1.9895F,
				-12.2F, 4, 2, 4, 0.0F, false));

		Oberschenkel2 = new ModelRenderer(this);
		Oberschenkel2.setRotationPoint(6.0F, 13.0F, 9.0F);
		setRotationAngle(Oberschenkel2, 0.4363F, 0.0F, 0.0F);
		LBein.addChild(Oberschenkel2);
		Oberschenkel2.cubeList.add(new ModelBox(Oberschenkel2, 50, 48,
				-8.2105F, -17.7601F, -4.3682F, 4, 9, 4, 0.0F, false));

		Unterschenkel2 = new ModelRenderer(this);
		Unterschenkel2.setRotationPoint(6.0F, 13.0F, 9.0F);
		setRotationAngle(Unterschenkel2, -0.5236F, 0.0F, 0.0F);
		LBein.addChild(Unterschenkel2);
		Unterschenkel2.cubeList.add(new ModelBox(Unterschenkel2, 34, 48,
				-8.0105F, -4.723F, -11.387F, 4, 9, 4, 0.0F, false));

		LBeinHinten = new ModelRenderer(this);
		LBeinHinten.setRotationPoint(6.0F, 11.0F, 6.0F);

		Fuss3 = new ModelRenderer(this);
		Fuss3.setRotationPoint(-6.0F, 13.0F, -6.0F);
		LBeinHinten.addChild(Fuss3);
		Fuss3.cubeList.add(new ModelBox(Fuss3, 16, 48, 3.8F, -2.0F, 3.5F, 4, 2,
				5, 0.0F, false));

		Unterschenkel3 = new ModelRenderer(this);
		Unterschenkel3.setRotationPoint(-6.0F, 13.0F, -6.0F);
		setRotationAngle(Unterschenkel3, 0.5236F, 0.0F, 0.0F);
		LBeinHinten.addChild(Unterschenkel3);
		Unterschenkel3.cubeList.add(new ModelBox(Unterschenkel3, 34, 48,
				4.007F, -6.5156F, 4.3311F, 4, 9, 4, 0.0F, false));

		Oberschenkel3 = new ModelRenderer(this);
		Oberschenkel3.setRotationPoint(-6.0F, 13.0F, -6.0F);
		setRotationAngle(Oberschenkel3, -0.4363F, 0.0F, 0.0F);
		LBeinHinten.addChild(Oberschenkel3);
		Oberschenkel3.cubeList.add(new ModelBox(Oberschenkel3, 50, 48, 3.7895F,
				-16.17F, -2.8682F, 4, 9, 4, 0.0F, false));

		RBeinHinten = new ModelRenderer(this);
		RBeinHinten.setRotationPoint(-6.0F, 11.0F, 6.0F);

		Fuss4 = new ModelRenderer(this);
		Fuss4.setRotationPoint(-6.0F, 13.0F, -6.0F);
		RBeinHinten.addChild(Fuss4);
		Fuss4.cubeList.add(new ModelBox(Fuss4, 16, 48, 3.8F, -2.0F, 3.5F, 4, 2,
				5, 0.0F, false));

		Unterschenkel4 = new ModelRenderer(this);
		Unterschenkel4.setRotationPoint(-6.0F, 13.0F, -6.0F);
		setRotationAngle(Unterschenkel4, 0.5236F, 0.0F, 0.0F);
		RBeinHinten.addChild(Unterschenkel4);
		Unterschenkel4.cubeList.add(new ModelBox(Unterschenkel4, 34, 48,
				4.007F, -6.5156F, 4.3311F, 4, 9, 4, 0.0F, false));

		Oberschenkel4 = new ModelRenderer(this);
		Oberschenkel4.setRotationPoint(-6.0F, 13.0F, -6.0F);
		setRotationAngle(Oberschenkel4, -0.4363F, 0.0F, 0.0F);
		RBeinHinten.addChild(Oberschenkel4);
		Oberschenkel4.cubeList.add(new ModelBox(Oberschenkel4, 50, 48, 3.7895F,
				-16.17F, -2.8682F, 4, 9, 4, 0.0F, false));

		Koerper = new ModelRenderer(this);
		Koerper.setRotationPoint(0.0F, 24.0F, 0.0F);

		Bauch = new ModelRenderer(this);
		Bauch.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Bauch, 0.1745F, 0.0F, 0.0F);
		Koerper.addChild(Bauch);
		Bauch.cubeList.add(new ModelBox(Bauch, 0, 75, -5.9F, -20.3567F,
				-10.0229F, 11, 9, 8, 0.0F, false));

		Bauch2 = new ModelRenderer(this);
		Bauch2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Koerper.addChild(Bauch2);
		Bauch2.cubeList.add(new ModelBox(Bauch2, 86, 94, -6.0F, -19.6962F,
				-5.527F, 12, 9, 9, 0.0F, false));

		Bauch3 = new ModelRenderer(this);
		Bauch3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Bauch3, -0.1745F, 0.0F, 0.0F);
		Koerper.addChild(Bauch3);
		Bauch3.cubeList.add(new ModelBox(Bauch3, 72, 112, -5.9F, -19.9693F,
				-0.0081F, 11, 10, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, 0.0F, 0.0F);
		setRotationAngle(bone, -0.4363F, 0.0F, 0.0F);
		Koerper.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 76, 80, -5.0F, -10.0F, -21.0F, 8,
				7, 7, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Koerper.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 106, 84, -3.5F, -17.2381F,
				-18.8063F, 7, 6, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Koerper.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 36, 92, -5.9F, -18.3567F,
				-5.0229F, 11, 11, 8, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, -0.1745F, 0.0F, 0.0F);
		Koerper.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 38, 80, -5.8F, -10.3727F,
				-14.224F, 11, 4, 8, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.1745F, 0.0F, 0.0F);
		Koerper.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 100, -5.8F, -10.7279F, 4.28F,
				11, 4, 7, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 1.0F);
		setRotationAngle(bone10, 0.0873F, 0.0F, 0.0F);
		Koerper.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 28, 111, -5.85F, -17.63F,
				-0.37F, 11, 6, 11, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone11, -0.1745F, 0.0F, 0.0F);
		Koerper.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 121, -5.85F, -14.18F, 4.4F,
				11, 4, 3, 0.0F, false));

		Kopf = new ModelRenderer(this);
		Kopf.setRotationPoint(0.0F, 10.0F, -17.0F);
		setRotationAngle(Kopf, 0.2618F, 0.0F, 0.0F);

		Schild = new ModelRenderer(this);
		Schild.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Schild, -0.1745F, 0.0F, 0.0F);
		Kopf.addChild(Schild);
		Schild.cubeList.add(new ModelBox(Schild, 16, 62, -8.2F, -13.0F, -33.0F,
				16, 12, 1, 0.0F, false));

		Stacheln = new ModelRenderer(this);
		Stacheln.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Stacheln, -0.1745F, 0.0F, 0.0F);
		Kopf.addChild(Stacheln);
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, 4.6F, -4.0F,
				-32.9F, 4, 2, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -8.6F, -4.0F,
				-32.9F, 4, 2, 0, 0.0F, true));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -7.3F, -13.3F,
				-32.9F, 2, 4, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, 5.3F, -13.3F,
				-32.9F, 2, 4, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, 4.6F, -12.0F,
				-32.9F, 4, 2, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -8.6F, -12.0F,
				-32.9F, 4, 2, 0, 0.0F, true));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -4.3F, -13.3F,
				-32.9F, 2, 4, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, 2.2F, -13.3F,
				-32.9F, 2, 4, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, 4.6F, -8.0F,
				-32.9F, 4, 2, 0, 0.0F, false));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -8.6F, -8.0F,
				-32.9F, 4, 2, 0, 0.0F, true));
		Stacheln.cubeList.add(new ModelBox(Stacheln, 8, 71, -1.0F, -13.3F,
				-32.9F, 2, 4, 0, 0.0F, false));

		Kopf2 = new ModelRenderer(this);
		Kopf2.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Kopf2, 0.0873F, 0.0F, 0.0F);
		Kopf.addChild(Kopf2);
		Kopf2.cubeList.add(new ModelBox(Kopf2, 50, 61, -3.7F, -15.9927F,
				-35.8292F, 7, 7, 7, 0.0F, false));

		Kopf3 = new ModelRenderer(this);
		Kopf3.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Kopf3, 0.3491F, 0.0F, 0.0F);
		Kopf.addChild(Kopf3);
		Kopf3.cubeList.add(new ModelBox(Kopf3, 78, 65, -2.7035F, -21.9702F,
				-36.6561F, 5, 4, 6, 0.0F, false));

		Hoerner = new ModelRenderer(this);
		Hoerner.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Hoerner, 0.8727F, 0.0F, 0.0F);
		Kopf.addChild(Hoerner);
		Hoerner.cubeList.add(new ModelBox(Hoerner, 0, 67, -3.0F, -38.0F,
				-12.0F, 1, 7, 1, 0.0F, false));
		Hoerner.cubeList.add(new ModelBox(Hoerner, 0, 67, 2.0F, -38.0F, -12.0F,
				1, 7, 1, 0.0F, false));

		Hoerner2 = new ModelRenderer(this);
		Hoerner2.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Hoerner2, 0.6109F, 0.0F, 0.0F);
		Kopf.addChild(Hoerner2);
		Hoerner2.cubeList.add(new ModelBox(Hoerner2, 4, 72, -0.7F, -32.0F,
				-29.0F, 1, 2, 1, 0.0F, false));

		Hoerner3 = new ModelRenderer(this);
		Hoerner3.setRotationPoint(0.0F, 9.0F, 31.0F);
		setRotationAngle(Hoerner3, 1.0472F, 0.0F, 0.0F);
		Kopf.addChild(Hoerner3);
		Hoerner3.cubeList.add(new ModelBox(Hoerner3, 0, 67, -3.0F, -46.3328F,
				-5.2343F, 1, 7, 1, 0.0F, false));
		Hoerner3.cubeList.add(new ModelBox(Hoerner3, 0, 67, 2.0F, -46.3328F,
				-5.2343F, 1, 7, 1, 0.0F, false));

		Schwanz = new ModelRenderer(this);
		Schwanz.setRotationPoint(0.0F, 11.0F, 10.0F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 12.0F, -11.0F);
		setRotationAngle(bone6, -0.0873F, 0.0F, 0.0F);
		Schwanz.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 98, 59, -4.0F, -17.3F, 8.0872F,
				7, 7, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 10.0F, -19.0F);
		setRotationAngle(bone7, -0.1745F, 0.0F, 0.0F);
		Schwanz.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 98, 48, -3.0F, -16.5124F,
				19.1432F, 6, 5, 6, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 10.0F, -12.0F);
		setRotationAngle(bone8, -0.0873F, 0.0F, 0.0F);
		Schwanz.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 78, 48, -2.25F, -13.968F,
				17.2385F, 4, 5, 6, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 11.0F, -12.0F);
		Schwanz.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 66, 48, -1.0F, -12.3972F,
				23.9696F, 2, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		RBein.render(f5);
		LBein.render(f5);
		LBeinHinten.render(f5);
		RBeinHinten.render(f5);
		Koerper.render(f5);
		Kopf.render(f5);
		Schwanz.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LBeinHinten.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Kopf.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Kopf.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LBein.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RBein.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI)
				* f1;
		this.RBeinHinten.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}