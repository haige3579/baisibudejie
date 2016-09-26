package tools;

import android.content.Context;
import android.util.TypedValue;

/**
 *   显示--单位转化工具类   可使用2种类：1  DisplayMetrics   2  TypedValue
 * Created by CYH on 2016/9/26.
 */
public class DisplayUtil {
    /**
     *   将px转换成 dip  或者  dp值 ，保证尺寸大小不变
     */
    public static int px2dip(Context context, float pxValue){
        final float scale=context.getResources().getDisplayMetrics().density;
        return (int)(pxValue/scale+0.5f);
    }

    /**
     *  dip/dp  2  px
     */
    public static int dip2px(Context context,float dipValue){
        final float scale=context.getResources().getDisplayMetrics().density;
        return (int)(dipValue*scale+0.5f);
    }

    /**
     * px 2 sp
     */
    public static int px2sp(Context context,float pxValue){
        final float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(pxValue/fontScale+0.5f);
    }

    /**
     * sp 2 px
     */
    public static int sp2px(Context context,float spValue){
        final float fontScale=context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(spValue*fontScale+0.5f);
    }

    /**
     *   系统代码
     * dp 2 px
     */
//    protected int dp2px(int dp){
//        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
//                         dp,
//                         getResources().getDisplayMetrics())
//    }
}
