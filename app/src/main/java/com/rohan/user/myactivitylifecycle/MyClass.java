package com.rohan.user.myactivitylifecycle;

import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;

/**
 * Created by User on 11/11/2016.
 */

public class MyClass extends CursorLoader {
    public MyClass(Context context) {
        super(context);
    }

    @Override
    public Cursor loadInBackground() {
        return super.loadInBackground();
    }
}
