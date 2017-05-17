package com.example.jh.library;


import com.example.jh.library.core.BaseEffects;
import com.example.jh.library.core.FadeIn;
import com.example.jh.library.core.Fall;
import com.example.jh.library.core.FlipH;
import com.example.jh.library.core.FlipV;
import com.example.jh.library.core.NewsPaper;
import com.example.jh.library.core.RotateBottom;
import com.example.jh.library.core.RotateLeft;
import com.example.jh.library.core.Shake;
import com.example.jh.library.core.SideFall;
import com.example.jh.library.core.SlideBottom;
import com.example.jh.library.core.SlideLeft;
import com.example.jh.library.core.SlideRight;
import com.example.jh.library.core.SlideTop;
import com.example.jh.library.core.Slit;

/**
 * Created by lee on 2014/7/30.
 */
public enum  Effectstype {

    FADEIN(FadeIn.class),
    SLIDELEFT(SlideLeft.class),
    SLIDETOP(SlideTop.class),
    SLIDEBOTTOM(SlideBottom.class),
    SLIDERIGHT(SlideRight.class),
    FALL(Fall.class),
    NEWSPAGER(NewsPaper.class),
    FLIPH(FlipH.class),
    FLIPV(FlipV.class),
    ROTATEBOTTOM(RotateBottom.class),
    ROTATELEFT(RotateLeft.class),
    SLIT(Slit.class),
    SHAKE(Shake.class),
    SIDEFILL(SideFall.class);
    private Class effectsClazz;

    private Effectstype(Class mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        try {
            return (BaseEffects) effectsClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
