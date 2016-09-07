package com.corelibs.views.ptr.loadmore.adapter;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

/**
 * 针对ListView或继承自ListView的控件的适配类
 * <BR/>
 * Created by Ryan on 2016/1/21.
 */
public class ListViewAdapter<T extends ListView> implements LoadMoreAdapter<T> {

    private T listView;

    public ListViewAdapter(T listView) {
        this.listView = listView;
    }

    @Override
    public void addFooterView(View v, Object data, boolean isSelectable) {
        listView.addFooterView(v, data, isSelectable);
    }

    @Override
    public boolean removeFooterView(View v) {
        return listView.removeFooterView(v);
    }

    @Override
    public int getLastVisiblePosition() {
        return listView.getLastVisiblePosition();
    }

    @Override
    public void setOnScrollListener(AbsListView.OnScrollListener l) {
        listView.setOnScrollListener(l);
    }

    @Override
    public int getRowCount() {
        return listView.getCount();
    }

    @Override
    public T getView() {
        return listView;
    }
}
