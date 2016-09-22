package xiaomeng.bupt.com.learnproject.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import xiaomeng.bupt.com.learnproject.BR;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class TwoWayBindingBean extends BaseObservable {

    private String mInput;

    @Bindable
    public String getInput() {
        return mInput;
    }

    public void setInput(String input) {
        mInput = input;
        notifyPropertyChanged(BR.input);
    }
}
