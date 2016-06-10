package com.github.revival.client.model.prehistoric;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.server.entity.mob.EntityElasmotherium;
import com.github.revival.server.entity.mob.test.EntityNewPrehistoric;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPachycephalosaurus extends ModelNewPrehistoric {

    public AdvancedModelRenderer leftThigh;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer leftUpperArm;
    public AdvancedModelRenderer rightUpperArm;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftLowerArm;
    public AdvancedModelRenderer rightLowerArm;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer dome1;
    public AdvancedModelRenderer hornBumps;
    public AdvancedModelRenderer beaklower;
    public AdvancedModelRenderer beak;
    public AdvancedModelRenderer dome2_l;
    public AdvancedModelRenderer dome2_r;
    public AdvancedModelRenderer leftLeg;
    public AdvancedModelRenderer leftFoot;
    public AdvancedModelRenderer rightLeg;
    public AdvancedModelRenderer rightFoot;
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer headPivot;
    private ModelAnimator animator;

    public ModelPachycephalosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftUpperArm = new AdvancedModelRenderer(this, 20, 6);
        this.leftUpperArm.setRotationPoint(2.5F, 1.0F, -5.0F);
        this.leftUpperArm.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(leftUpperArm, 0.15707963267948966F, -0.0F, 0.0F);
        this.dome1 = new AdvancedModelRenderer(this, 0, 11);
        this.dome1.mirror = true;
        this.dome1.setRotationPoint(0.0F, 3.5F, -1.6F);
        this.dome1.addBox(-2.5F, -2.8F, -2.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(dome1, -0.36425021489121656F, -0.0F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 42, 23);
        this.tail2.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.tail2.addBox(-2.0F, -1.7F, 0.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(tail2, 0.017453292519943295F, -0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 40, 50);
        this.tail1.setRotationPoint(0.0F, 2.3F, 7.5F);
        this.tail1.addBox(-3.0F, -1.8F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, -0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 31, 37);
        this.tail3.setRotationPoint(0.0F, 0.1F, 6.5F);
        this.tail3.addBox(-1.5F, -1.3F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(tail3, 0.03490658503988659F, -0.0F, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 10, 32);
        this.neck.setRotationPoint(0.0F, 0.6F, -5.4F);
        this.neck.addBox(-2.0F, -2.0F, -6.1F, 4, 5, 7, 0.0F);
        this.setRotateAngle(neck, -0.5235987755982988F, -0.0F, 0.0F);
        this.leftThigh = new AdvancedModelRenderer(this, 30, 20);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.0F, 12.0F, -1.0F);
        this.leftThigh.addBox(0.0F, 0.0F, -1.8F, 3, 6, 4, 0.0F);
        this.rightThigh = new AdvancedModelRenderer(this, 30, 20);
        this.rightThigh.setRotationPoint(-3.0F, 12.0F, -1.0F);
        this.rightThigh.addBox(-3.0F, 0.0F, -1.8F, 3, 6, 4, 0.0F);
        this.beaklower = new AdvancedModelRenderer(this, 28, 15);
        this.beaklower.setRotationPoint(-0.5F, 5.6F, 1.4F);
        this.beaklower.addBox(-1.5F, 0.0F, -3.3F, 3, 1, 3, 0.0F);
        this.setRotateAngle(beaklower, 1.4570008595648662F, 0.0F, 0.0F);
        this.hornBumps = new AdvancedModelRenderer(this, 21, 2);
        this.hornBumps.setRotationPoint(-0.5F, 1.1F, -0.6F);
        this.hornBumps.addBox(-3.0F, -1.0F, 0.5F, 6, 2, 2, 0.0F);
        this.setRotateAngle(hornBumps, 2.0943951023931953F, -0.0F, 0.0F);
        this.rightFoot = new AdvancedModelRenderer(this, 16, 15);
        this.rightFoot.setRotationPoint(0.1F, 5.5F, 0.5F);
        this.rightFoot.addBox(-2.0F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.2617993877991494F, 0.0F, 0.0F);
        this.rightLowerArm = new AdvancedModelRenderer(this, 28, 6);
        this.rightLowerArm.setRotationPoint(-0.9F, 2.5F, -0.5F);
        this.rightLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rightLowerArm, -0.7291985614832309F, -0.0F, 0.0F);
        this.leftLowerArm = new AdvancedModelRenderer(this, 28, 6);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(0.9F, 2.5F, -0.5F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(leftLowerArm, -0.7291985614832309F, -0.0F, 0.0F);
        this.headPivot = new AdvancedModelRenderer(this, 0, 0);
        this.headPivot.setRotationPoint(0.5F, -0.5F, -5.4F);
        this.setRotateAngle(headPivot, -0.8196066167365371F, -0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 0);
        this.head.addBox(-3.0F, -0.1F, -1.8F, 5, 6, 5, 0.0F);
        this.leftLeg = new AdvancedModelRenderer(this, 0, 25);
        this.leftLeg.setRotationPoint(1.1F, 4.0F, 1.8F);
        this.leftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(leftLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.leftFoot = new AdvancedModelRenderer(this, 16, 15);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(-0.1F, 5.5F, 0.5F);
        this.leftFoot.addBox(-1.0F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.2617993877991494F, -0.0F, 0.0F);
        this.rightLeg = new AdvancedModelRenderer(this, 0, 25);
        this.rightLeg.setRotationPoint(-1.1F, 4.0F, 1.8F);
        this.rightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(rightLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 0, 47);
        this.lowerBody.setRotationPoint(0.0F, 8.6F, -6.5F);
        this.lowerBody.addBox(-3.5F, 0.0F, 0.0F, 7, 8, 8, 0.0F);
        this.setRotateAngle(lowerBody, -0.017453292519943295F, -0.0F, 0.0F);
        this.beak = new AdvancedModelRenderer(this, 0, 17);
        this.beak.setRotationPoint(-1.0F, 5.6F, -0.6F);
        this.beak.addBox(-1.5F, -1.1F, -4.4F, 4, 3, 5, 0.0F);
        this.setRotateAngle(beak, 1.6845917940249266F, 0.0F, 0.0F);
        this.rightUpperArm = new AdvancedModelRenderer(this, 20, 6);
        this.rightUpperArm.mirror = true;
        this.rightUpperArm.setRotationPoint(-2.5F, 1.0F, -5.0F);
        this.rightUpperArm.addBox(-2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rightUpperArm, 0.15707963267948966F, -0.0F, 0.0F);
        this.dome2_l = new AdvancedModelRenderer(this, 0, 11);
        this.dome2_l.mirror = true;
        this.dome2_l.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.dome2_l.addBox(-1.51F, -2.0F, -2.8F, 3, 4, 2, 0.0F);
        this.setRotateAngle(dome2_l, 0.5918411493512771F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 39, 0);
        this.upperBody.setRotationPoint(0.0F, 2.2F, 1.0F);
        this.upperBody.addBox(-2.5F, -2.0F, -6.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(upperBody, 0.05585053606381855F, -0.0F, 0.0F);
        this.dome2_r = new AdvancedModelRenderer(this, 0, 11);
        this.dome2_r.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.dome2_r.addBox(-2.49F, -2.0F, -2.8F, 3, 4, 2, 0.0F);
        this.setRotateAngle(dome2_r, 0.5918411493512771F, -0.0F, 0.0F);
        this.upperBody.addChild(this.leftUpperArm);
        this.head.addChild(this.dome1);
        this.tail1.addChild(this.tail2);
        this.lowerBody.addChild(this.tail1);
        this.tail2.addChild(this.tail3);
        this.upperBody.addChild(this.neck);
        this.head.addChild(this.beaklower);
        this.head.addChild(this.hornBumps);
        this.rightLeg.addChild(this.rightFoot);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.neck.addChild(this.headPivot);
        this.headPivot.addChild(this.head);
        this.leftThigh.addChild(this.leftLeg);
        this.leftLeg.addChild(this.leftFoot);
        this.rightThigh.addChild(this.rightLeg);
        this.head.addChild(this.beak);
        this.upperBody.addChild(this.rightUpperArm);
        this.head.addChild(this.dome2_l);
        this.lowerBody.addChild(this.upperBody);
        this.head.addChild(this.dome2_r);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.leftThigh.render(f5);
        this.rightThigh.render(f5);
        this.lowerBody.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(EntityElasmotherium.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(lowerBody, 0, 5, -2);
        ModelUtils.rotate(animator, lowerBody, 20, 0, 0);
        ModelUtils.rotate(animator, head, 30, 0, 0);
        ModelUtils.rotate(animator, neck, -50, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.move(lowerBody, 0, -2, 2);
        ModelUtils.rotate(animator, lowerBody, -20, 0, 0);
        ModelUtils.rotate(animator, head, -10, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckParts = {this.neck, this.head};
        AdvancedModelRenderer[] leftArmParts = {this.leftUpperArm, this.leftLowerArm};
        AdvancedModelRenderer[] rightArmParts = {this.rightUpperArm, this.rightLowerArm};
        head.rotateAngleZ += (f3 / (180f / (float) Math.PI)) * 0.5F;
        head.rotateAngleX += (f4 / (180f / (float) Math.PI)) * 0.5F;
        ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
        float speed = 0.1F;
        float speed2 = 0.3F;
        this.walk(upperBody, speed, 0.1F, false, 1F, 0F, entity.ticksExisted, 1);
        this.bob(lowerBody, speed, 0.7F, false, entity.ticksExisted, 1);
        this.walk(leftThigh, speed2, 0.8F, false, 0F, 0.4F, f, f1);
        this.walk(leftLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
        this.walk(leftFoot, speed2, 0.8F, true, 2.5F, 0.4F, f, f1);
        this.walk(rightThigh, speed2, 0.8F, true, 0F, 0.4F, f, f1);
        this.walk(rightLeg, speed2, 0.2F, true, 0F, -0.6F, f, f1);
        this.walk(rightFoot, speed2, 0.8F, false, 2.5F, 0.4F, f, f1);
        this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(leftArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainWave(rightArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed2, 0.25F, -3, f, f1);
        this.chainWave(neckParts, speed, 0.15F, 3, entity.ticksExisted, 1);
        {
            float sitProgress = ((EntityNewPrehistoric) (entity)).sitProgress;
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(18.26D)), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(80.0D), 0, 0);
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(18.26D), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(80.0D), 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(9.0D), 0, 0);
            sitAnimationRotation(headPivot, sitProgress, ((float) Math.toRadians(33.91D)), 0, 0);
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(65.0D)), 0, 0);
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(65.0D)), 0, 0);
            sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(9.0D), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(41.78D)), 0, 0);
            sitAnimationRotation(tail2, sitProgress, (float) Math.toRadians(1.0D), 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, -((float) Math.toRadians(15.0D)), 0, 0);
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(15.0D)), 0, 0);
            sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(41.78D)), 0, 0);
            sitAnimationRotation(leftLeg, sitProgress, -((float) Math.toRadians(15.0D)), 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0, 4.1F, 0);
            sitAnimationPos(rightThigh, sitProgress, 0, 5F, 0);
            sitAnimationPos(leftThigh, sitProgress, 0, 5F, 0);
        }
        {
            float sitProgress = ((EntityNewPrehistoric) (entity)).sleepProgress;
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, -((float) Math.toRadians(15.0D)), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(80.0D), 0, 0);
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(18.26D), (float) Math.toRadians(33.91D), (float) Math.toRadians(15.65D));
            sitAnimationRotation(head, sitProgress, -((float) Math.toRadians(20.3D)), -((float) Math.toRadians(62.61D)), -(float) Math.toRadians(28.7D));
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(tail2, sitProgress, -((float) Math.toRadians(7.83D)), (float) Math.toRadians(15.65D), 0);
            sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(114.78D)), (float) Math.toRadians(2.61D), -((float) Math.toRadians(5.22D)));
            sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(9.0D), 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(10.43D)), 0, 0);
            sitAnimationRotation(neck, sitProgress, (float) Math.toRadians(19.83D), -((float) Math.toRadians(13.04D)), -((float) Math.toRadians(15.65D)));
            sitAnimationRotation(leftThigh, sitProgress, (float) Math.toRadians(85.0D), -((float) Math.toRadians(10.43D)), -((float) Math.toRadians(39.13D)));
            sitAnimationRotation(leftLeg, sitProgress, -((float) Math.toRadians(15.0D)), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(80.0D), 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(9.0D), 0, 0);
            sitAnimationRotation(rightThigh, sitProgress, (float) Math.toRadians(85.0D), (float) Math.toRadians(2.61D), (float) Math.toRadians(41.74D));
            sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(109.57D)), 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0, 8F, 0);
            sitAnimationPos(rightThigh, sitProgress, 0, 8F, 0);
            sitAnimationPos(leftThigh, sitProgress, 0, 8F, 0);
        }
        ((EntityNewPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);
    }
}
