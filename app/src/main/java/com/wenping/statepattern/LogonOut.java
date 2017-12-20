package com.wenping.statepattern;

import android.content.Context;
import android.content.Intent;

/**
 * Created by wenping on 12/20/2017.
 * 在未登录状态则跳转到登录页面
 */

public class LogonOut implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }


    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        context.startActivity(new Intent(context,LoginActivity.class));
    }
}
