package com.wenping.statepattern;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by wenping on 12/20/2017.
 *  简单demo模拟状态模式
 */

public class MainActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    /**
     * 转发
     * @param view
     */
    public void forward(View view) {
        LoginContext.getLoginContext().forward(MainActivity.this);
    }

    /**
     * 注销登录
     * @param view
     */
    public void logonOut(View view) {
        LoginContext.getLoginContext().setState(new LogonOut());
        Toast.makeText(this, "注销登录成功", Toast.LENGTH_LONG).show();
    }
}
