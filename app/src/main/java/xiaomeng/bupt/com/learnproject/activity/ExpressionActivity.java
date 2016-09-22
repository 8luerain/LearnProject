package xiaomeng.bupt.com.learnproject.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.util.Random;

import xiaomeng.bupt.com.learnproject.BR;
import xiaomeng.bupt.com.learnproject.R;
import xiaomeng.bupt.com.learnproject.bean.Dog;
import xiaomeng.bupt.com.learnproject.databinding.ExpressionActivityBinding;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class ExpressionActivity extends Activity {
    private ExpressionActivityBinding mBinding;
    private Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.expression_activity);
        Dog jack = new Dog("jack", "http://download.easyicon.net/ico/1143726/64/");
        jack.setMeal(mRandom.nextBoolean());
        mBinding.setVariable(BR.expressionActivityDog, jack);
    }
}
