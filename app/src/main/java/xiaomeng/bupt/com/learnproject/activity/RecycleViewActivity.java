package xiaomeng.bupt.com.learnproject.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;

import xiaomeng.bupt.com.learnproject.R;
import xiaomeng.bupt.com.learnproject.adapter.RecycleViewAdapter;
import xiaomeng.bupt.com.learnproject.bean.BeanAble;
import xiaomeng.bupt.com.learnproject.bean.Dog;
import xiaomeng.bupt.com.learnproject.bean.Person;
import xiaomeng.bupt.com.learnproject.databinding.ActivityRecycleBinding;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class RecycleViewActivity extends Activity {

    private ActivityRecycleBinding mActivityRecycleBinding;
    private ArrayList<BeanAble> mData;
    private RecycleViewAdapter mRecycleViewAdapter;

    public class Presenter {

        public void onInsertClick(){
            mRecycleViewAdapter.addItem(new Dog("dog1", "http://download.easyicon.net/ico/1143726/64/"));
        }
        public void onRemoveClick(){
            mRecycleViewAdapter.remove(new Dog("dog1", "http://download.easyicon.net/ico/1143726/64/"));

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        mActivityRecycleBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycle);
        mActivityRecycleBinding.recyclerViewRecycle.setLayoutManager(new LinearLayoutManager(this));
        mRecycleViewAdapter = new RecycleViewAdapter(this);
        mRecycleViewAdapter.addAll(mData);
        mActivityRecycleBinding.recyclerViewRecycle.setAdapter(mRecycleViewAdapter);
        mActivityRecycleBinding.setPresenter(new Presenter());
    }

    private void initData() {
        mData = new ArrayList<BeanAble>();
        mData.add(new Dog("dog1", "http://download.easyicon.net/ico/1143726/64/"));
        mData.add(new Person("person_one", "10"));
        mData.add(new Dog("maoxiaomao", "http://download.easyicon.net/ico/1143726/64/"));
        mData.add(new Dog("dog2", "http://download.easyicon.net/ico/1143726/64/"));
    }
}
