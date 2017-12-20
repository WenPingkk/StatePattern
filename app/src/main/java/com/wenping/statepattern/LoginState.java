package com.wenping.statepattern;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wenping on 12/20/2017.
 */

public class LoginState implements UserState{
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发到xx", Toast.LENGTH_LONG).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "评论xx", Toast.LENGTH_LONG).show();
    }
}
