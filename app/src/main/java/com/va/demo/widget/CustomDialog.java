package com.va.demo.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.va.demo.R;

/**
 * Created by va on 2016-10-15.
 */

public class CustomDialog extends Dialog {

    private TextView mTitle;
    private View mTitle_line;
    private LinearLayout mOptions_ll;

    public CustomDialog(Context context) {
        super(context, R.style.bottom_dialog);
        setContentView(R.layout.bottom_dialog);
        initView();
    }

    private void initView() {
        mTitle = (TextView) findViewById(R.id.tv_bottom_dialog_title);
        mOptions_ll = (LinearLayout) findViewById(R.id.options_ll);
        mTitle_line = findViewById(R.id.title_line);

        findViewById(R.id.tv_bottom_dialog_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog.this.dismiss();
            }
        });
        //点击back键可以取消dialog
        this.setCancelable(false);
        //点击空白区域可以取消dialog
        this.setCanceledOnTouchOutside(true);

        Window window = this.getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setWindowAnimations(R.style.bottom_dialog_anim);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = WindowManager.LayoutParams.MATCH_PARENT;
        attributes.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(attributes);
    }

    public static class Builder {
        private Paraments p;
        private Context mContext;
    }


    class Paraments {
        public int titleSize;
        public int optionTextSize;
        public String title;
        public int titleColor;
        public boolean cancelable;
//        public List<Option> mOptions;

    }

}
