package me.ydcool.easing;

import android.view.animation.Interpolator;

/**
 * @author ydcool
 */
public class EaseInCubicInterpolator implements Interpolator {
    private float b;
    private float c;

    public EaseInCubicInterpolator() {
        this.b = 0;
        this.c = 1;
    }

    public EaseInCubicInterpolator(float beginIngValue, float changeInValue) {
        this.b = beginIngValue;
        this.c = changeInValue;
    }

    public float getInterpolation(float t) {
        return c * t * t * t + b;
    }
}
