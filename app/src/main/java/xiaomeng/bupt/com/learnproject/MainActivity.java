package xiaomeng.bupt.com.learnproject;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import xiaomeng.bupt.com.learnproject.activity.ExpressionActivity;
import xiaomeng.bupt.com.learnproject.activity.RecycleViewActivity;
import xiaomeng.bupt.com.learnproject.activity.TwowayBindingActivity;
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
        activityMainBinding.setPresenter(new Presenter());
    }

    private void initData() {
        mPersonXiaoMeng = new Person("xiaomeng", "27");

    }

    public class Presenter {

        public void onRecycleButtonClick() {
            Intent intent = new Intent(MainActivity.this, RecycleViewActivity.class);
            startActivity(intent);
        }

        public void onTwoBindingButtonClick() {
            Intent intent = new Intent(MainActivity.this, TwowayBindingActivity.class);
            startActivity(intent);
        }

        public void onExpressionButtonClick() {
            Intent intent = new Intent(MainActivity.this, ExpressionActivity.class);
            startActivity(intent);
        }

        public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
            // intentionally empty, template pattern method can be overridden by subclasses
            Log.d(TAG, "onTextChanged: text[" + text + "]");
            mPersonXiaoMeng.setName(text.toString());
        }
    }
}
