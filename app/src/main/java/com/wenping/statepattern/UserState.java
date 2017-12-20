package com.wenping.statepattern;

import android.content.Context;

/**
 * Created by wenping on 12/20/2017.
 */

public interface UserState {

    void forward(Context context);

    void comment(Context context);
}
