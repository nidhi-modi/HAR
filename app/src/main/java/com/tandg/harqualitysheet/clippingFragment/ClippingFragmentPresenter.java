package com.tandg.harqualitysheet.clippingFragment;


import com.tandg.harqualitysheet.di.DependencyInjector;

/**
 * Created by root on 23/12/17.
 */

public class ClippingFragmentPresenter implements ClippingFragmentContract.Presenter {

    private ClippingFragmentContract.View mView;


    public <T extends ClippingFragment & ClippingFragmentContract.View> ClippingFragmentPresenter(T view) {
        this.mView = view;

        DependencyInjector.appComponent().inject(this);

    }


    @Override
    public void start() {

    }
}
