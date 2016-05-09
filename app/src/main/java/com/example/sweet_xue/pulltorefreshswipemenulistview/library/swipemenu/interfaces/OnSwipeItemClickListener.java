package com.example.sweet_xue.pulltorefreshswipemenulistview.library.swipemenu.interfaces;

import com.example.sweet_xue.pulltorefreshswipemenulistview.library.swipemenu.bean.SwipeMenu;
import com.example.sweet_xue.pulltorefreshswipemenulistview.library.swipemenu.view.SwipeMenuView;


public interface OnSwipeItemClickListener {

    void onItemClick(SwipeMenuView view, SwipeMenu menu, int index);

}