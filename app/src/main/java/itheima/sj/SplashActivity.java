package itheima.sj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import itheima.sj.utils.AppInfoUtils;

public class SplashActivity extends AppCompatActivity {
    private TextView tv_splash_version;
    private RelativeLayout rl_splash_root;
    //第二次
    //第三次

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        rl_splash_root = (RelativeLayout) findViewById(R.id.rl_splash_root);
        tv_splash_version = (TextView) findViewById(R.id.tv_splash_version);
        tv_splash_version.setText("版本号："+ AppInfoUtils.getAppVersion(this,getPackageName()));

        AlphaAnimation aa = new AlphaAnimation(0.2f,1.0f);
        aa.setDuration(2000);
        rl_splash_root.startAnimation(aa);
    }
}
