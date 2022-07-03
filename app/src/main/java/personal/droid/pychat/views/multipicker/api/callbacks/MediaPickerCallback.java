package personal.droid.pychat.views.multipicker.api.callbacks;

import java.util.List;

import personal.droid.pychat.views.multipicker.api.entity.ChosenImage;
import personal.droid.pychat.views.multipicker.api.entity.ChosenVideo;

/**
 * Created by kbibek on 3/23/16.
 */
public interface MediaPickerCallback extends PickerCallback {
    void onMediaChosen(List<ChosenImage> images, List<ChosenVideo> videos);
}
