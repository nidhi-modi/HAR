package com.tandg.qualitysheet.clippingPruningFragment;


import com.tandg.qualitysheet.clippingFragment.ClippingFragment;
import com.tandg.qualitysheet.clippingFragment.ClippingFragmentContract;
import com.tandg.qualitysheet.di.DependencyInjector;

/**
 * Created by root on 23/12/17.
 */

public class ClippingPruningFragmentPresenter implements ClippingPruningFragmentContract.Presenter {

    private ClippingPruningFragmentContract.View mView;


    public <T extends ClippingPruningFragment & ClippingPruningFragmentContract.View> ClippingPruningFragmentPresenter(T view) {
        this.mView = view;

        DependencyInjector.appComponent().inject(this);

    }


    @Override
    public void start() {

    }
}
