package com.tandg.harqualitysheet.droppingFragment;


import com.tandg.harqualitysheet.di.DependencyInjector;

/**
 * Created by root on 23/12/17.
 */

public class DroppingFragmentPresenter implements DroppingFragmentContract.Presenter {

    private DroppingFragmentContract.View mView;


    public <T extends DroppingFragment & DroppingFragmentContract.View> DroppingFragmentPresenter(T view) {
        this.mView = view;

        DependencyInjector.appComponent().inject(this);

    }


    @Override
    public void start() {

    }
}
