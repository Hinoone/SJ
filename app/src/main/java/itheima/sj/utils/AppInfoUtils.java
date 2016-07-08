package itheima.sj.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by hinoone1@gmail.com on 2016/7/8.
 */
public class AppInfoUtils {

    public static String getAppVersion(Context context, String packname){
        PackageManager pm = context.getPackageManager();

        try {
            PackageInfo info = pm.getPackageInfo(packname,0);
            return info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
