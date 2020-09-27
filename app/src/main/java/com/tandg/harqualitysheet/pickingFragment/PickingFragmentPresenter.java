package com.tandg.harqualitysheet.pickingFragment;


import com.tandg.harqualitysheet.di.DependencyInjector;


/**
 * Created by root on 23/12/17.
 */

public class PickingFragmentPresenter implements PickingFragmentContract.Presenter {

    private PickingFragmentContract.View mView;


    public <T extends PickingFragment & PickingFragmentContract.View> PickingFragmentPresenter(T view) {
        this.mView = view;

        DependencyInjector.appComponent().inject(this);

    }


    @Override
    public void start() {

    }
}
