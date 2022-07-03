package personal.droid.pychat.views.multipicker.api.callbacks;


import java.util.List;

import personal.droid.pychat.views.multipicker.api.entity.ChosenVideo;

/**
 * Created by kbibek on 2/23/16.
 */
public interface VideoPickerCallback extends PickerCallback {
    void onVideosChosen(List<ChosenVideo> videos);
}
