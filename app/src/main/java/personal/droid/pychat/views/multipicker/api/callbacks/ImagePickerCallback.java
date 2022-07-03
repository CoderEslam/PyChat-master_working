package personal.droid.pychat.views.multipicker.api.callbacks;


import java.util.List;

import personal.droid.pychat.views.multipicker.api.entity.ChosenImage;

/**
 * Created by kbibek on 2/23/16.
 */
public interface ImagePickerCallback extends PickerCallback {
    void onImagesChosen(List<ChosenImage> images);
}
