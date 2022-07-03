package personal.droid.pychat.views.multipicker.api.callbacks;

import java.util.List;

import personal.droid.pychat.views.multipicker.api.entity.ChosenFile;

/**
 * Created by kbibek on 2/23/16.
 */
public interface FilePickerCallback extends PickerCallback {
    void onFilesChosen(List<ChosenFile> files);
}
