package personal.droid.pychat.views.multipicker.api.callbacks;


import java.util.List;

import personal.droid.pychat.views.multipicker.api.entity.ChosenAudio;

/**
 * Created by kbibek on 2/23/16.
 */
public interface AudioPickerCallback extends PickerCallback {
    void onAudiosChosen(List<ChosenAudio> audios);
}
