package personal.droid.pychat.views.multipicker.utils;

import android.util.Log;

import personal.droid.pychat.views.multipicker.core.PickerManager;


/**
 * Created by kbibek on 12/12/16.
 */

public class LogUtils {
    public static void d(String tag, String message){
        if(PickerManager.debugglable){
            Log.d(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if(PickerManager.debugglable){
            Log.e(tag, message);
        }
    }
}
