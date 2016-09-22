package xiaomeng.bupt.com.learnproject.bean;

/**
 * Project: LearnProject.
 * Data: 2016/9/22.
 * Created by 8luerain.
 * Contact:<a href="mailto:8luerain@gmail.com">Contact_me_now</a>
 */

public class Dog implements BeanAble {
    private String mName;
    private String mAvart;
    private boolean isMeal;

    public Dog(String name, String avart) {
        mName = name;
        mAvart = avart;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAvart() {
        return mAvart;
    }

    public void setAvart(String avart) {
        mAvart = avart;
    }

    @Override
    public int getType() {
        return ITEM_TYPE_DOG;
    }

    public boolean isMeal() {
        return isMeal;
    }

    public void setMeal(boolean meal) {
        isMeal = meal;
    }
}
