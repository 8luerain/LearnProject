package xiaomeng.bupt.com.learnproject.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import xiaomeng.bupt.com.learnproject.BR;
import xiaomeng.bupt.com.learnproject.R;
import xiaomeng.bupt.com.learnproject.bean.BeanAble;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<DataBindingViewHolder> {

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private Random mRandom = new Random();


    private List<BeanAble> mData;

    public RecycleViewAdapter(Context context) {
        this.mContext = context;
        mData = new ArrayList<>();
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public DataBindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case BeanAble.ITEM_TYPE_PERSON:
                return new DataBindingViewHolder(DataBindingUtil.inflate(mLayoutInflater, R.layout.item_recycle_main_person, null, false));
            case BeanAble.ITEM_TYPE_DOG:
                return new DataBindingViewHolder(DataBindingUtil.inflate(mLayoutInflater, R.layout.item_recycle_main_dog, null, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder holder, int position) {

        holder.getViewDataBinding().setVariable(BR.item, mData.get(position));
        holder.getViewDataBinding().executePendingBindings();

    }

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void addAll(List<BeanAble> data) {
        mData.addAll(data);
    }

    public void addItem(BeanAble item) {
        int i = mRandom.nextInt(mData.size());
        mData.add(i, item);
        notifyItemInserted(i);
    }

    public void remove(BeanAble item) {
        int index = mData.indexOf(item);
        index = index == -1 ? mRandom.nextInt(mData.size()) : index;
        mData.remove(index);
        notifyItemRemoved(index);
    }

}
