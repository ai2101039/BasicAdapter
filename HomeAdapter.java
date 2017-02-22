package svgouwu.napp.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import svgouwu.napp.R;
import svgouwu.napp.bean.Home_Wares_Bean;
import svgouwu.napp.holder.BasicViewHolder;
import svgouwu.napp.holder.home.Home_Normal;
import svgouwu.napp.util.Mutils;

/**
 * Created by Administrator on 2017/2/16.
 */

public class HomeAdapter extends BasicAdapter {
    /**Home_Wares_Bean 是自定义的Bean类*/
    private List<Home_Wares_Bean> list;
    /**通过构造器，传入数据，和其他您需要的对象*/
    public HomeAdapter(List<Home_Wares_Bean> list){
        this.list = list;
    }
    /**创建除头布局，脚布局之外的Holder*/
    @Override
    protected BasicViewHolder createRelViewHolder(ViewGroup parent) {
        return new Home_Normal(LayoutInflater.from(Mutils.getContext())
                .inflate(R.layout.home_normal,parent,false),list,listener);
    }
    /**除头布局，脚布局之外的数量*/
    @Override
    protected int getRelCount() {
        return list.size();
    }
}
