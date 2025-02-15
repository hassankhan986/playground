package com.sc.libgdx.tween;

import com.badlogic.gdx.graphics.g2d.Sprite;

import aurelienribon.tweenengine.TweenAccessor;

public class SpriteTween implements TweenAccessor<Sprite> {

	public static final int ALPHA = 1;

	@Override
	public int getValues(Sprite target, int tweenType, float[] returnValues) {
		int tweenFlag = 0;
		switch (tweenType) {
		case ALPHA:
			returnValues[0] = target.getColor().a;
			tweenFlag = 1;
			break;
		default:
			tweenFlag = 0;
			break;
		}
		return tweenFlag;
	}

	@Override
	public void setValues(Sprite target, int tweenType, float[] newValues) {

		switch (tweenType) {
		case ALPHA:
			target.setColor(1, 1, 1, newValues[0]);
			break;
		default:
			break;
		}
	}

}
