package com.example.jh.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jh.library.Effectstype;
import com.example.jh.library.NiftyDialogBuilder;


public class MainActivity extends Activity {

    private Effectstype effect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogShow(View v) {
        final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(this);
        switch (v.getId()) {
            case R.id.fadein:
                effect = Effectstype.FADEIN;
                break;
            case R.id.slideright:
                effect = Effectstype.SLIDERIGHT;
                break;
            case R.id.slideleft:
                effect = Effectstype.SLIDELEFT;
                break;
            case R.id.slidetop:
                effect = Effectstype.SLIDETOP;
                break;
            case R.id.slideBottom:
                effect = Effectstype.SLIDEBOTTOM;
                break;
            case R.id.newspager:
                effect = Effectstype.NEWSPAGER;
                break;
            case R.id.fall:
                effect = Effectstype.FALL;
                break;
            case R.id.sidefall:
                effect = Effectstype.SIDEFILL;
                break;
            case R.id.fliph:
                effect = Effectstype.FLIPH;
                break;
            case R.id.flipv:
                effect = Effectstype.FLIPV;
                break;
            case R.id.rotatebottom:
                effect = Effectstype.ROTATEBOTTOM;
                break;
            case R.id.rotateleft:
                effect = Effectstype.ROTATELEFT;
                break;
            case R.id.slit:
                effect = Effectstype.SLIT;
                break;
            case R.id.shake:
                effect = Effectstype.SHAKE;
                break;
        }

        dialogBuilder
                .withTitle("设置标题区域")                                  //.withTitle(null)  no title
                .withTitleColor("#FFFFFF")                                  //def
                .withDividerColor("#11000000")                              //def
                .withMessage("这是一个对话框")                     //.withMessage(null)  no Msg
                .withMessageColor("#FFFFFF")                                //def
                .withIcon(getResources().getDrawable(R.drawable.icon))
                .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
                .withDuration(2000)                                          //def    数值约大动画越明显
                .withEffect(effect)                                         //def Effectstype.Slidetop
                .withButton1Text("确定")                                      //def gone
                .withButton2Text("取消")                                  //def gone
                .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                .setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "确定", Toast.LENGTH_SHORT).show();
                    }
                })
                .setButton2Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Toast.makeText(v.getContext(), "取消", Toast.LENGTH_SHORT).show();
                        dialogBuilder.dismiss();
                    }
                })
                .show();

    }


}

