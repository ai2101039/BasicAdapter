package svgouwu.napp.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2017/2/16.
 */

public abstract class BasicViewHolder extends RecyclerView.ViewHolder {
    public BasicViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void init(int position);
}
