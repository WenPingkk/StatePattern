package com.wenping.statepattern;

import android.content.Context;

/**
 * Created by wenping on 12/20/2017.
 */

public class LoginContext {

    private UserState mState = new LogonOut();

    private static LoginContext mLoginContext = new LoginContext();

    private LoginContext() {
    }

    public static LoginContext getLoginContext() {

        return mLoginContext;
    }

    public void setState(UserState state) {
        this.mState = state;
    }

    public void forward(Context context) {
        mState.forward(context);
    }

    public void comment(Context context) {
        mState.comment(context);
    }

}
