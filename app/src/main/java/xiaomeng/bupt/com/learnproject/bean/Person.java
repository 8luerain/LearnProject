package xiaomeng.bupt.com.learnproject.bean;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by rain on 2016/9/20.
 */

public class Person extends BaseObservable {

    public ObservableField<String> mName = new ObservableField<>();
    public ObservableField<String> mAge = new ObservableField<>();


    public Person(String mName, String mAge) {
        this.mName.set(mName);
        this.mAge.set(mAge);
    }

    public void setName(String name) {
        this.mName.set(name);
    }


    public void setAge(String age) {
        this.mAge.set(age);
    }
}
