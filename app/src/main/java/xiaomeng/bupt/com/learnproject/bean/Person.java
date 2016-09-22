package xiaomeng.bupt.com.learnproject.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.util.Log;

import xiaomeng.bupt.com.learnproject.BR;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by rain on 2016/9/20.
 */

public class Person extends BaseObservable implements BeanAble {

    private ObservableField<String> mName = new ObservableField<>();
    private ObservableField<String> mAge = new ObservableField<>();
    private String mNickName;


    public Person(String mName, String mAge) {
        this.mName.set(mName);
        this.mAge.set(mAge);
    }

    public void setName(String name) {
        this.mName.set(name);
    }

    @Bindable
    public String getName() {
        return mName.get();
    }

    @Bindable
    public String getAge() {
        return mAge.get();
    }

    public void setAge(String age) {
        this.mAge.set(age);
    }

    @Override
    public int getType() {
        return ITEM_TYPE_PERSON;
    }

    @Bindable
    public String getNickName() {
        return mNickName;
    }

    public void setNickName(String nickName) {
        mNickName = nickName;
        Log.d(TAG, "setNickName: [" + nickName + "]");
        notifyPropertyChanged(BR.item);
    }
}

