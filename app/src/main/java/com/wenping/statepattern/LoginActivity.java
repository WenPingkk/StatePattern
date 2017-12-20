package com.wenping.statepattern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by wenping on 12/20/2017.
 */

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        LoginContext.getLoginContext().setState(new LoginState());
        startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show();
        finish();
    }
}
