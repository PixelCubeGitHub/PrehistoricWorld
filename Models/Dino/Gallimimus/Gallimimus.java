// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class gallimimus extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer rightLeg;
	private final ModelRenderer thighR;
	private final ModelRenderer anckle0;
	private final ModelRenderer leftArm;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone23;
	private final ModelRenderer rightArm;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone22;
	private final ModelRenderer leftLeg;
	private final ModelRenderer thighL;
	private final ModelRenderer anckle1;
	private final ModelRenderer Tail;
	private final ModelRenderer tail1;
	private final ModelRenderer tail0;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;

	public gallimimus() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(body, -0.0873F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 37, 0, -1.5F, -4.0F, -11.0F, 3, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 20, -2.5F, -3.5F, -10.0F, 5, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 6, -3.0F, -3.5F, -7.0F, 6, 6, 8, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.0F, -6.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 12, 0, -1.0F, -18.25F, -7.5F, 2, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, -19.0F, -4.5F, 3, 3, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 6.0F, 6.0F);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		head.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 29, 0, -0.95F, -16.763F, -3.241F, 2, 2, 2, 0.1F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.6109F, 0.0F, 0.0F);
		head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 29, 0, -1.0F, -15.1229F, 8.5364F, 2, 1, 2, 0.05F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 6.0F, 6.0F);
		setRotationAngle(bone3, 0.3491F, 0.0F, 0.0F);
		head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 12, 0, -1.0F, -25.4391F, -4.9148F, 2, 1, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
		head.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 12, 0, -1.0F, -19.5173F, -2.3991F, 2, 1, 3, -0.01F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		head.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 6, -1.0F, -18.2146F, -5.2431F, 2, 2, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone24, -0.0873F, 0.0F, 0.0F);
		head.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 29, 0, -0.95F, -13.3491F, -2.3069F, 2, 4, 2, 0.1F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -3.9392F, 0.6946F);
		setRotationAngle(bone25, 0.0873F, 0.0F, 0.0F);
		head.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 29, 0, -0.95F, -13.517F, -1.0036F, 2, 4, 2, 0.1F, false));

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(3.0F, 12.0F, 1.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 39, 27, -0.5F, 11.0F, -0.79F, 2, 1, 3, 0.0F, false));
		rightLeg.cubeList.add(new ModelBox(rightLeg, 29, 31, 0.0F, 5.0F, 1.0F, 1, 6, 1, 0.2F, false));

		thighR = new ModelRenderer(this);
		thighR.setRotationPoint(-3.0F, 12.0F, -1.0F);
		setRotationAngle(thighR, -0.1745F, 0.0F, 0.0F);
		rightLeg.addChild(thighR);
		thighR.cubeList.add(new ModelBox(thighR, 29, 40, 2.5F, -13.4791F, -3.4544F, 2, 6, 3, 0.2F, false));

		anckle0 = new ModelRenderer(this);
		anckle0.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(anckle0, -0.6981F, 0.0F, 0.0F);
		thighR.addChild(anckle0);
		anckle0.cubeList.add(new ModelBox(anckle0, 33, 31, 2.5F, -7.3056F, -7.4409F, 2, 2, 5, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-3.0F, 18.0F, -5.0F);
		setRotationAngle(leftArm, 0.3491F, 0.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 29, 21, 0.0F, -6.9F, 0.6F, 1, 3, 1, 0.2F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.0F, 4.4626F, 6.6237F);
		leftArm.addChild(bone14);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(bone15, 0.5236F, 0.3491F, 0.0F);
		bone14.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -0.9701F, -10.1159F, -2.1997F, 0, 0, 1, -0.05F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -3.0F, -1.0F);
		setRotationAngle(bone16, 0.5236F, 0.0F, 0.0F);
		bone14.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 0, 0, -2.75F, -9.1F, -4.44F, 0, 0, 1, -0.05F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -1.0F, -1.0F);
		setRotationAngle(bone17, 0.5236F, -0.4363F, 0.0F);
		bone14.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 0, 0, -5.4721F, -9.9761F, -1.9574F, 0, 0, 1, -0.05F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(bone18);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(bone19, 0.9599F, 0.3491F, 0.0F);
		bone18.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 0, 0, -0.9701F, -10.0158F, 1.6516F, 0, 0, 1, -0.05F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -3.0F, -1.0F);
		setRotationAngle(bone20, 0.8727F, 0.0F, 0.0F);
		bone18.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 0, 0, -2.75F, -10.0135F, -1.7406F, 0, 0, 1, -0.05F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -1.0F, -1.0F);
		setRotationAngle(bone21, 0.9599F, -0.4363F, 0.0F);
		bone18.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 0, 0, -5.4721F, -9.7866F, 1.8121F, 0, 0, 1, -0.05F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone23, -0.1745F, 0.0F, 0.0F);
		leftArm.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 29, 21, 5.0F, -4.81F, -3.15F, 1, 1, 3, 0.0F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(3.0F, 18.0F, -5.0F);
		setRotationAngle(rightArm, 0.3491F, 0.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 29, 21, -1.0F, -6.9F, 0.6F, 1, 3, 1, 0.2F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(2.0F, 4.4626F, 6.6237F);
		rightArm.addChild(bone10);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(bone11, 0.5236F, 0.3491F, 0.0F);
		bone10.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, -0.9701F, -10.1159F, -2.1997F, 0, 0, 1, -0.05F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -3.0F, -1.0F);
		setRotationAngle(bone12, 0.5236F, 0.0F, 0.0F);
		bone10.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -2.75F, -9.1F, -4.44F, 0, 0, 1, -0.05F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -1.0F, -1.0F);
		setRotationAngle(bone13, 0.5236F, -0.4363F, 0.0F);
		bone10.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 0, 0, -5.4721F, -9.9761F, -1.9574F, 0, 0, 1, -0.05F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone6);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(bone7, 0.9599F, 0.3491F, 0.0F);
		bone6.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -0.9701F, -10.0158F, 1.6516F, 0, 0, 1, -0.05F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -3.0F, -1.0F);
		setRotationAngle(bone8, 0.8727F, 0.0F, 0.0F);
		bone6.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -2.75F, -10.0135F, -1.7406F, 0, 0, 1, -0.05F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -1.0F, -1.0F);
		setRotationAngle(bone9, 0.9599F, -0.4363F, 0.0F);
		bone6.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -5.4721F, -9.7866F, 1.8121F, 0, 0, 1, -0.05F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone22, -0.1745F, 0.0F, 0.0F);
		rightArm.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 29, 21, -6.0F, -4.81F, -3.15F, 1, 1, 3, 0.0F, false));

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(3.0F, 12.0F, 1.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 39, 27, -7.5F, 11.0F, -0.79F, 2, 1, 3, 0.0F, false));
		leftLeg.cubeList.add(new ModelBox(leftLeg, 29, 31, -7.0F, 5.0F, 1.0F, 1, 6, 1, 0.2F, false));

		thighL = new ModelRenderer(this);
		thighL.setRotationPoint(-3.0F, 12.0F, -1.0F);
		setRotationAngle(thighL, -0.1745F, 0.0F, 0.0F);
		leftLeg.addChild(thighL);
		thighL.cubeList.add(new ModelBox(thighL, 29, 40, -4.5F, -13.4791F, -3.4544F, 2, 6, 3, 0.2F, false));

		anckle1 = new ModelRenderer(this);
		anckle1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(anckle1, -0.6981F, 0.0F, 0.0F);
		thighL.addChild(anckle1);
		anckle1.cubeList.add(new ModelBox(anckle1, 33, 31, -4.5F, -7.3056F, -7.4409F, 2, 2, 5, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail1, 0.0873F, 0.0F, 0.0F);
		Tail.addChild(tail1);
		tail1.cubeList.add(new ModelBox(tail1, 0, 36, -2.0F, -15.8F, 6.0F, 4, 4, 4, 0.0F, false));

		tail0 = new ModelRenderer(this);
		tail0.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail0, 0.0873F, 0.0F, 0.0F);
		Tail.addChild(tail0);
		tail0.cubeList.add(new ModelBox(tail0, 0, 28, -2.5F, -16.1F, 3.0F, 5, 5, 3, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(tail2, -0.1745F, 0.0F, 0.0F);
		Tail.addChild(tail2);
		tail2.cubeList.add(new ModelBox(tail2, 29, 11, -1.5F, -17.6F, 5.0F, 3, 3, 4, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, -1.0F, -2.0F);
		setRotationAngle(tail3, -0.2618F, 0.0F, 0.0F);
		Tail.addChild(tail3);
		tail3.cubeList.add(new ModelBox(tail3, 0, 44, -1.0F, -17.5F, 9.0F, 2, 2, 5, 0.0F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, -1.0F, -1.0F);
		setRotationAngle(tail4, -0.3491F, 0.0F, 0.0F);
		Tail.addChild(tail4);
		tail4.cubeList.add(new ModelBox(tail4, 0, 51, -0.5F, -17.8F, 11.0F, 1, 1, 6, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 14, 51, -0.5F, -17.8F, 11.0F, 1, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		rightLeg.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
		leftLeg.render(f5);
		Tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}