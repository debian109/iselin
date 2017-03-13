package com.other.iselin.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.other.iselin.mvp.view.LibraryView;

/**
 * Created by thinh on 3/10/17.
 */

@InjectViewState
public class LibraryPresenter extends MvpPresenter<LibraryView>{
    public void showSongList(){
        getViewState().showSongList();
    }
}
