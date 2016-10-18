package com.va.demo.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by va on 2016-10-15.
 */

public class UIutil {


    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 根据值，转化为标准的尺寸
     *
     * @param context
     * @param value   要转化的值
     * @return
     */
    public static float getDip(Context context, float value) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, context.getResources().getDisplayMetrics());
    }

    /**
     * 根据值，转化为标准的尺寸
     *
     * @param context
     * @param value   要转化的值
     * @return
     */
    public static float getSp(Context context, float value) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, value, context.getResources().getDisplayMetrics());
    }
}
