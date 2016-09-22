package xiaomeng.bupt.com.learnproject.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import xiaomeng.bupt.com.learnproject.R;
import xiaomeng.bupt.com.learnproject.bean.TwoWayBindingBean;
import xiaomeng.bupt.com.learnproject.databinding.ActivityTwoWayBindingBinding;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class TwowayBindingActivity extends Activity {
    private ActivityTwoWayBindingBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
        mBinding.setVariable(com.android.databinding.library.baseAdapters.BR.item, new TwoWayBindingBean());
    }


}
