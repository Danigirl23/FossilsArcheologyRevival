package fossilsarcheology.client.model.prehistoric;

import fossilsarcheology.server.entity.EntityPrehistoric;
import fossilsarcheology.server.entity.mob.EntityParasaurolophus;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParasaurolophus extends ModelPrehistoric {
    public AdvancedModelRenderer leftThigh;
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer leftLeg;
    public AdvancedModelRenderer leftFoot;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer neck1;
    public AdvancedModelRenderer leftUpperArm;
    public AdvancedModelRenderer rightUpperArm;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer upperJaw;
    public AdvancedModelRenderer lowerJaw;
    public AdvancedModelRenderer UpperBeak;
    public AdvancedModelRenderer UpperBeak_1;
    public AdvancedModelRenderer shape31;
    public AdvancedModelRenderer Crest2;
    public AdvancedModelRenderer Crest2_1;
    public AdvancedModelRenderer leftLowerArm;
    public AdvancedModelRenderer leftHand;
    public AdvancedModelRenderer rightLowerArm;
    public AdvancedModelRenderer rightHand;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer rightLeg;
    public AdvancedModelRenderer rightFoot;
    public AdvancedModelRenderer headPivot;
    private ModelAnimator animator;

    public ModelParasaurolophus() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.rightThigh = new AdvancedModelRenderer(this, 0, 44);
        this.rightThigh.setRotationPoint(-4.5F, 2.5F, 9.5F);
        this.rightThigh.addBox(-4.0F, -1.0F, -4.0F, 4, 12, 8, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 150, 60);
        this.tail2.setRotationPoint(0.0F, 0.2F, 9.0F);
        this.tail2.addBox(-3.0F, 0.0F, 0.0F, 6, 8, 12, 0.0F);
        this.setRotateAngle(tail2, -0.06597344572538565F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 150, 0);
        this.upperBody.setRotationPoint(0.0F, 6.9F, 3.2F);
        this.upperBody.addBox(-5.0F, -7.0F, -12.0F, 10, 14, 12, 0.0F);
        this.setRotateAngle(upperBody, 0.19373154697137057F, 0.0F, 0.0F);
        this.rightUpperArm = new AdvancedModelRenderer(this, 0, 30);
        this.rightUpperArm.setRotationPoint(-5.0F, 0.9F, -9.3F);
        this.rightUpperArm.addBox(-2.0F, -2.0F, -8.0F, 2, 4, 9, 0.0F);
        this.setRotateAngle(rightUpperArm, 1.6655677051781888F, -0.0F, 0.0F);
        this.neck2 = new AdvancedModelRenderer(this, 90, 0);
        this.neck2.setRotationPoint(0.0F, 1.5F, -8.0F);
        this.neck2.addBox(-2.0F, -3.5F, -9.0F, 4, 7, 9, 0.0F);
        this.setRotateAngle(neck2, -0.566010276421761F, -0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 1, 1);
        this.head.addBox(-3.0F, -2.5F, -7.0F, 6, 5, 7, 0.0F);
        this.headPivot = new AdvancedModelRenderer(this, 1, 1);
        this.headPivot.setRotationPoint(0.0F, -2.5F, -7.0F);
        this.setRotateAngle(headPivot, 1.1519173063162573F, -0.0F, 0.0F);
        this.leftLowerArm = new AdvancedModelRenderer(this, 22, 30);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(1.99F, -0.1F, -5.7F);
        this.leftLowerArm.addBox(-2.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(leftLowerArm, -0.4363323129985824F, -0.0F, 0.0F);
        this.UpperBeak_1 = new AdvancedModelRenderer(this, 58, 1);
        this.UpperBeak_1.setRotationPoint(0.5F, 0.0F, 4.8F);
        this.UpperBeak_1.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(UpperBeak_1, -0.03490658503988659F, -0.0F, 0.0F);
        this.leftHand = new AdvancedModelRenderer(this, 15, 74);
        this.leftHand.mirror = true;
        this.leftHand.setRotationPoint(-1.0F, 0.1F, -8.3F);
        this.leftHand.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(leftHand, -1.4311699866353502F, -0.0F, 0.0F);
        this.neck1 = new AdvancedModelRenderer(this, 116, 0);
        this.neck1.setRotationPoint(0.0F, 0.6F, -10.0F);
        this.neck1.addBox(-3.5F, -4.5F, -10.0F, 7, 9, 10, 0.0F);
        this.setRotateAngle(neck1, -0.59096848472528F, -0.0F, 0.0F);
        this.UpperBeak = new AdvancedModelRenderer(this, 64, 18);
        this.UpperBeak.setRotationPoint(-0.4F, -2.1F, -11.77F);
        this.UpperBeak.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(UpperBeak, 0.41364303272265607F, -0.0F, 0.0F);
        this.leftUpperArm = new AdvancedModelRenderer(this, 0, 30);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(5.0F, 0.9F, -9.3F);
        this.leftUpperArm.addBox(0.0F, -2.0F, -8.0F, 2, 4, 9, 0.0F);
        this.setRotateAngle(leftUpperArm, 1.6655677051781888F, -0.0F, 0.0F);
        this.rightHand = new AdvancedModelRenderer(this, 15, 74);
        this.rightHand.setRotationPoint(-1.0F, 0.1F, -8.3F);
        this.rightHand.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(rightHand, -1.4311699866353502F, -0.0F, 0.0F);
        this.leftLeg = new AdvancedModelRenderer(this, 0, 64);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(2.0F, 9.5F, 3.0F);
        this.leftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(leftLeg, -0.10018189906447451F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 112, 59);
        this.tail1.setRotationPoint(0.0F, 0.1F, 15.0F);
        this.tail1.addBox(-4.0F, 0.0F, 0.0F, 8, 11, 11, 0.0F);
        this.setRotateAngle(tail1, -0.07435102613495843F, -0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 152, 28);
        this.lowerBody.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.lowerBody.addBox(-6.0F, 0.0F, 0.0F, 12, 15, 16, 0.0F);
        this.setRotateAngle(lowerBody, 0.0439822971502571F, -0.0F, 0.0F);
        this.rightLowerArm = new AdvancedModelRenderer(this, 22, 30);
        this.rightLowerArm.setRotationPoint(0.01F, -0.1F, -5.7F);
        this.rightLowerArm.addBox(-2.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
        this.setRotateAngle(rightLowerArm, -0.4363323129985824F, -0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 186, 60);
        this.tail3.setRotationPoint(0.0F, 0.8F, 10.5F);
        this.tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 16, 0.0F);
        this.setRotateAngle(tail3, -0.048520153205442354F, -0.0F, 0.0F);
        this.leftFoot = new AdvancedModelRenderer(this, 14, 64);
        this.leftFoot.setRotationPoint(0.0F, 9.0F, 0.5F);
        this.leftFoot.addBox(-2.0F, 0.0F, -6.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(leftFoot, 0.10471975511965977F, -0.0F, 0.0F);
        this.lowerJaw = new AdvancedModelRenderer(this, 0, 23);
        this.lowerJaw.setRotationPoint(0.0F, 1.6F, -6.3F);
        this.lowerJaw.addBox(-1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F);
        this.setRotateAngle(lowerJaw, -0.03490658503988659F, -0.0F, 0.0F);
        this.Crest2 = new AdvancedModelRenderer(this, 41, 26);
        this.Crest2.setRotationPoint(0.01F, 0.0F, 5.0F);
        this.Crest2.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 4, 0.0F);
        this.setRotateAngle(Crest2, -0.22689280275926282F, -0.0F, 0.0F);
        this.rightLeg = new AdvancedModelRenderer(this, 0, 64);
        this.rightLeg.setRotationPoint(-2.0F, 9.5F, 3.0F);
        this.rightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 11, 4, 0.0F);
        this.setRotateAngle(rightLeg, -0.10018189906447451F, 0.0F, 0.0F);
        this.Crest2_1 = new AdvancedModelRenderer(this, 52, 22);
        this.Crest2_1.setRotationPoint(0.01F, 0.01F, 3.77F);
        this.Crest2_1.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Crest2_1, -0.2792526803190927F, -0.0F, 0.0F);
        this.leftThigh = new AdvancedModelRenderer(this, 0, 44);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(4.5F, 2.5F, 9.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -4.0F, 4, 12, 8, 0.0F);
        this.upperJaw = new AdvancedModelRenderer(this, 36, 8);
        this.upperJaw.setRotationPoint(0.0F, -1.4F, -6.8F);
        this.upperJaw.addBox(-2.0F, -1.0F, -6.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(upperJaw, 0.07592182246175333F, -0.0F, 0.0F);
        this.shape31 = new AdvancedModelRenderer(this, 20, 21);
        this.shape31.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shape31.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(shape31, -0.22689280275926282F, 0.0F, 0.0F);
        this.rightFoot = new AdvancedModelRenderer(this, 14, 64);
        this.rightFoot.setRotationPoint(0.0F, 9.0F, 0.5F);
        this.rightFoot.addBox(-2.0F, 0.0F, -6.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(rightFoot, 0.10471975511965977F, -0.0F, 0.0F);
        this.tail1.addChild(this.tail2);
        this.lowerBody.addChild(this.upperBody);
        this.upperBody.addChild(this.rightUpperArm);
        this.neck1.addChild(this.neck2);
        this.neck2.addChild(this.headPivot);
        this.headPivot.addChild(this.head);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.UpperBeak.addChild(this.UpperBeak_1);
        this.leftLowerArm.addChild(this.leftHand);
        this.upperBody.addChild(this.neck1);
        this.head.addChild(this.UpperBeak);
        this.upperBody.addChild(this.leftUpperArm);
        this.rightLowerArm.addChild(this.rightHand);
        this.leftThigh.addChild(this.leftLeg);
        this.lowerBody.addChild(this.tail1);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.tail2.addChild(this.tail3);
        this.leftLeg.addChild(this.leftFoot);
        this.head.addChild(this.lowerJaw);
        this.shape31.addChild(this.Crest2);
        this.rightThigh.addChild(this.rightLeg);
        this.Crest2.addChild(this.Crest2_1);
        this.head.addChild(this.upperJaw);
        this.UpperBeak_1.addChild(this.shape31);
        this.rightLeg.addChild(this.rightFoot);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.lowerBody.render(f5);
        this.rightThigh.render(f5);
        this.leftThigh.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(prehistoric.SPEAK_ANIMATION);
        animator.setStaticKeyframe(20);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, head, -30, 0, 0);
        ModelUtils.rotate(animator, lowerJaw, 40, 0, 0);
        ModelUtils.rotate(animator, neck2, -5, 0, 0);
        ModelUtils.rotate(animator, neck1, -5, 0, 0);
        animator.move(head, 0, 1.5F, -0.8F);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(prehistoric.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(neck1, 0, -2.5F, 0);
        ModelUtils.rotate(animator, neck1, 28, 0, 0);
        ModelUtils.rotate(animator, headPivot, 66, 0, 0);
        ModelUtils.rotate(animator, neck2, 28, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.move(head, 0, -1.5F, 0);
        ModelUtils.rotate(animator, neck1, -46, 0, 0);
        ModelUtils.rotate(animator, headPivot, 31, 0, 0);
        ModelUtils.rotate(animator, neck2, -36, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckParts = {this.neck1, this.neck2, this.head};
        AdvancedModelRenderer[] leftArmParts = {this.leftUpperArm, this.leftLowerArm, this.leftHand};
        AdvancedModelRenderer[] rightArmParts = {this.rightUpperArm, this.rightLowerArm, this.rightHand};

        if (((EntityPrehistoric) entity).isSkeleton()) {
            return;
        }
        ModelUtils.faceTargetMod(head, f3, f4, 0.33F);
        ModelUtils.faceTargetMod(neck2, f3, f4, 0.33F);
        ModelUtils.faceTargetMod(neck1, f3, f4, 0.33F);
        EntityParasaurolophus dino = ((EntityParasaurolophus) entity);
        float speed = 0.05F;
        float speed2 = 0.5F;
        float degree = 0.5F;
        {
            float sitProgress = dino.sitProgress;
            sitAnimationRotationPrev(tail2, sitProgress, -((float)Math.toRadians(3.78D)), 0, 0);
            sitAnimationRotationPrev(Crest2, sitProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(leftHand, sitProgress, -((float)Math.toRadians(7.0D)), 0, 0);
            sitAnimationRotationPrev(leftLeg, sitProgress, -((float)Math.toRadians(37.74D)), 0, 0);
            sitAnimationRotationPrev(leftFoot, sitProgress, (float)Math.toRadians(87.0D), 0, 0);
            sitAnimationRotationPrev(rightUpperArm, sitProgress, (float)Math.toRadians(48.43D), 0, 0);
            sitAnimationRotationPrev(leftLowerArm, sitProgress, -((float)Math.toRadians(56.0D)), 0, 0);
            sitAnimationRotationPrev(UpperBeak_1, sitProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(shape31, sitProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(rightLeg, sitProgress, -((float)Math.toRadians(37.74D)), 0, 0);
            sitAnimationRotationPrev(Crest2_1, sitProgress, -((float)Math.toRadians(16.0D)), 0, 0);
            sitAnimationRotationPrev(leftThigh, sitProgress, -((float)Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotationPrev(upperJaw, sitProgress, (float)Math.toRadians(4.35D), 0, 0);
            sitAnimationRotationPrev(rightLowerArm, sitProgress, -((float)Math.toRadians(56.0D)), 0, 0);
            sitAnimationRotationPrev(headPivot, sitProgress, (float)Math.toRadians(66.0D), 0, 0);
            sitAnimationRotationPrev(tail3, sitProgress, -((float)Math.toRadians(2.78D)), 0, 0);
            sitAnimationRotationPrev(UpperBeak, sitProgress, (float)Math.toRadians(23.7D), 0, 0);
            sitAnimationRotationPrev(rightThigh, sitProgress, -((float)Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotationPrev(tail1, sitProgress, -((float)Math.toRadians(6.26D)), 0, 0);
            sitAnimationRotationPrev(neck1, sitProgress, -((float)Math.toRadians(47.86D)), 0, 0);
            sitAnimationRotationPrev(upperBody, sitProgress, (float)Math.toRadians(11.1D), 0, 0);
            sitAnimationRotationPrev(lowerJaw, sitProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(leftUpperArm, sitProgress, (float)Math.toRadians(48.43D), 0, 0);
            sitAnimationRotationPrev(rightHand, sitProgress, -((float)Math.toRadians(7.0D)), 0, 0);
            sitAnimationRotationPrev(rightFoot, sitProgress, (float)Math.toRadians(87.0D), 0, 0);
            sitAnimationRotationPrev(lowerBody, sitProgress, (float)Math.toRadians(2.52D), 0, 0);
            sitAnimationRotationPrev(neck2, sitProgress, -((float)Math.toRadians(23.43D)), 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0, 9F, 0);
            sitAnimationPos(rightThigh, sitProgress, 0, 10F, 0);
            sitAnimationPos(leftThigh, sitProgress, 0, 10F, 0);
        }
        {
            float sleepProgress = dino.sleepProgress;
            sitAnimationRotationPrev(tail3, sleepProgress, (float)Math.toRadians(8.22D), -((float)Math.toRadians(26.0D)), 0);
            sitAnimationRotationPrev(shape31, sleepProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(rightThigh, sleepProgress, -((float)Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotationPrev(rightLeg, sleepProgress, -((float)Math.toRadians(37.74D)), 0, 0);
            sitAnimationRotationPrev(leftLeg, sleepProgress, -((float)Math.toRadians(37.74D)), 0, 0);
            sitAnimationRotationPrev(leftFoot, sleepProgress, (float)Math.toRadians(87.0D), 0, 0);
            sitAnimationRotationPrev(rightFoot, sleepProgress, (float)Math.toRadians(87.0D), 0, 0);
            sitAnimationRotationPrev(upperJaw, sleepProgress, (float)Math.toRadians(4.35D), 0, 0);
            sitAnimationRotationPrev(rightUpperArm, sleepProgress, (float)Math.toRadians(48.43D), (float)Math.toRadians(21.0D), 0);
            sitAnimationRotationPrev(lowerJaw, sleepProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(leftThigh, sleepProgress, -((float)Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotationPrev(neck1, sleepProgress, (float)Math.toRadians(1.14D), (float)Math.toRadians(10.0D), 0);
            sitAnimationRotationPrev(lowerBody, sleepProgress, (float)Math.toRadians(2.52D), 0, 0);
            sitAnimationRotationPrev(tail2, sleepProgress, (float)Math.toRadians(5.22D), -((float)Math.toRadians(17.0D)), 0);
            sitAnimationRotationPrev(UpperBeak_1, sleepProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(leftLowerArm, sleepProgress, -((float)Math.toRadians(56.0D)), 0, 0);
            sitAnimationRotationPrev(UpperBeak, sleepProgress, (float)Math.toRadians(23.7D), 0, 0);
            sitAnimationRotationPrev(Crest2, sleepProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(tail1, sleepProgress, -((float)Math.toRadians(22.26D)), -((float)Math.toRadians(9.0D)), 0);
            sitAnimationRotationPrev(neck2, sleepProgress, (float)Math.toRadians(11.57D), (float)Math.toRadians(26.0D), 0);
            sitAnimationRotationPrev(Crest2_1, sleepProgress, -((float)Math.toRadians(16.0D)), 0, 0);
            sitAnimationRotationPrev(headPivot, sleepProgress, -((float)Math.toRadians(4.0D)), (float)Math.toRadians(37.0D), 0);
            sitAnimationRotationPrev(upperBody, sleepProgress, (float)Math.toRadians(11.1D), (float)Math.toRadians(16.0D), 0);
            sitAnimationRotationPrev(rightHand, sleepProgress, -((float)Math.toRadians(7.0D)), 0, 0);
            sitAnimationRotationPrev(leftHand, sleepProgress, -((float)Math.toRadians(7.0D)), 0, 0);
            sitAnimationRotationPrev(leftUpperArm, sleepProgress, (float)Math.toRadians(48.43D), (float)Math.toRadians(13.0D), 0);
            sitAnimationRotationPrev(rightLowerArm, sleepProgress, -((float)Math.toRadians(56.0D)), 0, -((float)Math.toRadians(16.0D)));
            sitAnimationPos(lowerBody, sleepProgress, 0, 9F, 0);
            sitAnimationPos(rightThigh, sleepProgress, 0, 10F, 0);
            sitAnimationPos(leftThigh, sleepProgress, 0, 10F, 0);
        }
        {
            float standProgress = dino.standProgress;
            sitAnimationRotationPrev(leftHand, standProgress, (float)Math.toRadians(20.0D), 0, 0);
            sitAnimationRotationPrev(UpperBeak, standProgress, (float)Math.toRadians(23.7D), 0, 0);
            sitAnimationRotationPrev(rightFoot, standProgress, (float)Math.toRadians(6.0D), 0, 0);
            sitAnimationRotationPrev(headPivot, standProgress, (float)Math.toRadians(66.0D), 0, 0);
            sitAnimationRotationPrev(rightLowerArm, standProgress, -((float)Math.toRadians(90.0D)), 0, 0);
            sitAnimationRotationPrev(rightHand, standProgress, (float)Math.toRadians(20.0D), 0, 0);
            sitAnimationRotationPrev(upperJaw, standProgress, (float)Math.toRadians(4.35D), 0, 0);
            sitAnimationRotationPrev(leftFoot, standProgress, (float)Math.toRadians(6.0D), 0, 0);
            sitAnimationRotationPrev(tail3, standProgress, -((float)Math.toRadians(2.78D)), 0, 0);
            sitAnimationRotationPrev(UpperBeak_1, standProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(tail2, standProgress, -((float)Math.toRadians(3.78D)), 0, 0);
            sitAnimationRotationPrev(leftLeg, standProgress, -((float)Math.toRadians(5.74D)), 0, 0);
            sitAnimationRotationPrev(leftLowerArm, standProgress, -((float)Math.toRadians(90.0D)), 0, 0);
            sitAnimationRotationPrev(leftUpperArm, standProgress, (float)Math.toRadians(130.0D), (float)Math.toRadians(10.0D), 0);
            sitAnimationRotationPrev(upperBody, standProgress, (float)Math.toRadians(5.22D), 0, 0);
            sitAnimationRotationPrev(neck1, standProgress, -((float)Math.toRadians(28.7D)), 0, 0);
            sitAnimationRotationPrev(shape31, standProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(lowerJaw, standProgress, -((float)Math.toRadians(2.0D)), 0, 0);
            sitAnimationRotationPrev(rightLeg, standProgress, -((float)Math.toRadians(5.74D)), 0, 0);
            sitAnimationRotationPrev(rightUpperArm, standProgress, (float)Math.toRadians(130.0D), -((float)Math.toRadians(10.0D)), 0);
            sitAnimationRotationPrev(neck2, standProgress, -((float)Math.toRadians(36.52D)), 0, 0);
            sitAnimationRotationPrev(tail1, standProgress, -((float)Math.toRadians(4.26D)), 0, 0);
            sitAnimationRotationPrev(Crest2, standProgress, -((float)Math.toRadians(13.0D)), 0, 0);
            sitAnimationRotationPrev(Crest2_1, standProgress, -((float)Math.toRadians(16.0D)), 0, 0);
            if(standProgress > 10){
                this.bob(lowerBody, speed2, degree *-0.4F, false, f, f1);
                this.bob(leftUpperArm, -speed2, degree *-0.4F, false, f, f1);
                this.bob(rightUpperArm, -speed2, degree *-0.4F, false, f, f1);
                this.walk(leftThigh, speed2, degree * 0.6F, true, 0F, 0.4F, f, f1);
                this.walk(leftLeg, speed2, degree * -0.2F, true, 0F, -0.6F, f, f1);
                this.walk(leftFoot, speed2, degree * -0.6F, false, 2.5F, -0.2F, f, f1);
                this.walk(rightThigh, speed2, degree * 0.6F, false, 0F, -0.4F, f, f1);
                this.walk(rightLeg, speed2, degree * -0.2F, false, 0F, 0.6F, f, f1);
                this.walk(rightFoot, speed2, degree * -0.6F, true, 2.5F, 0.2F, f, f1);
                this.chainWave(leftArmParts, speed, degree *0.5F, -3, entity.ticksExisted, 1);
                this.chainWave(rightArmParts, speed, degree *0.5F, -3, entity.ticksExisted, 1);

            }else{
                this.bob(lowerBody, speed2, degree *-0.4F, false, f, f1);
                this.bob(leftUpperArm, -speed2, degree *-0.4F, false, f, f1);
                this.bob(rightUpperArm, -speed2, degree *-0.4F, false, f, f1);
                this.walk(leftThigh, speed2, degree * 0.6F, true, 0F, 0.4F, f, f1);
                this.walk(leftLeg, speed2, degree * -0.2F, true, 0F, -0.6F, f, f1);
                this.walk(leftFoot, speed2, degree * -0.6F, false, 2.5F, -0.2F, f, f1);
                this.walk(rightThigh, speed2, degree * 0.6F, false, 0F, -0.4F, f, f1);
                this.walk(rightLeg, speed2, degree * -0.2F, false, 0F, 0.6F, f, f1);
                this.walk(rightFoot, speed2, degree * -0.6F, true, 2.5F, 0.2F, f, f1);

                this.walk(leftUpperArm, speed2, degree * 0.6F, false, 0F, 0.4F, f, f1);
                this.walk(leftLowerArm, speed2, degree * 0.2F, false, 0F, -0.6F, f, f1);
                this.walk(leftHand, speed2, degree * -0.6F, true, 2.5F, -0.4F, f, f1);
                this.walk(rightUpperArm, speed2, degree * 0.6F, true, 0F, -0.4F, f, f1);
                this.walk(rightLowerArm, speed2, degree * 0.2F, true, 0F, 0.6F, f, f1);
                this.walk(rightHand, speed2, degree * -0.6F, false, 2.5F, 0.4F, f, f1);
            }
            this.chainWave(tailParts, speed, degree *0.05F, -3, entity.ticksExisted, 1);
            this.chainSwing(tailParts, speed, degree * 0.25F, -3, entity.ticksExisted, 1);
            this.chainWave(neckParts, speed, degree *0.1F, -3, entity.ticksExisted, 1);
            this.bob(lowerBody, speed, degree * -0.6F, false, entity.ticksExisted, 1);
            this.bob(leftUpperArm, -speed, degree * -0.6F, false, entity.ticksExisted, 1);
            this.bob(rightUpperArm, -speed, degree * -0.6F, false, entity.ticksExisted, 1);
            this.chainWave(neckParts, speed, degree * 0.7F, -3, f, f1);
            ((EntityPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);
        }
    }
}
