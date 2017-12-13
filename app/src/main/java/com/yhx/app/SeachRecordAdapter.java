package com.yhx.app;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import static com.yhx.app.R.id.tv_delete;

/**
 * Created by yi.huangxing on 17/12/13.类描述:
 */

public class SeachRecordAdapter extends BaseRecycleAdapter<String> {
    public SeachRecordAdapter(List<String> datas, Context mContext) {
        super(datas, mContext);
    }

    @Override
    protected void bindData(BaseViewHolder holder, final int position) {

        TextView textView= (TextView) holder.getView(R.id.tv_record);
        textView.setText(datas.get(position));
        
        //
        holder.getView(tv_delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (null!=mRvItemOnclickListener){
                    mRvItemOnclickListener.RvItemOnclick(position);
                }
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.search_item;
    }
}
