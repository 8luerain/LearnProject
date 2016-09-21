package xiaomeng.bupt.com.learnproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import xiaomeng.bupt.com.learnproject.bean.Person;
import xiaomeng.bupt.com.learnproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Person mPersonXiaoMeng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(mPersonXiaoMeng);
        activityMainBinding.setPresenter(new Presenter());
    }

    private void initData() {
        mPersonXiaoMeng = new Person("xiaomeng", "27");

    }

    public class Presenter {

        public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
            // intentionally empty, template pattern method can be overridden by subclasses
            Log.d(TAG, "onTextChanged: text[" + text + "]");
            mPersonXiaoMeng.setName(text.toString());
        }
    }
}
