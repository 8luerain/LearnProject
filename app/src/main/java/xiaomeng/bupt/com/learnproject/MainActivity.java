package xiaomeng.bupt.com.learnproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import xiaomeng.bupt.com.learnproject.bean.Person;
import xiaomeng.bupt.com.learnproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

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

        public void onClickListener(Person person) {
            Toast.makeText(MainActivity.this, person.mName, Toast.LENGTH_SHORT).show();
        }

    }
}
