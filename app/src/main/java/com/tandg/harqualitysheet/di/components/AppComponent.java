package com.tandg.harqualitysheet.di.components;


import com.tandg.harqualitysheet.clippingFragment.ClippingFragment;
import com.tandg.harqualitysheet.clippingFragment.ClippingFragmentPresenter;
import com.tandg.harqualitysheet.clippingPruningFragment.ClippingPruningFragment;
import com.tandg.harqualitysheet.clippingPruningFragment.ClippingPruningFragmentPresenter;
import com.tandg.harqualitysheet.deleafingFragment.DeleafingFragment;
import com.tandg.harqualitysheet.deleafingFragment.DeleafingFragmentPresenter;
import com.tandg.harqualitysheet.droppingFragment.DroppingFragment;
import com.tandg.harqualitysheet.droppingFragment.DroppingFragmentPresenter;
import com.tandg.harqualitysheet.di.modules.AppModule;
import com.tandg.harqualitysheet.di.modules.DatabaseModules;
import com.tandg.harqualitysheet.pickingFragment.PickingFragment;
import com.tandg.harqualitysheet.pickingFragment.PickingFragmentPresenter;
import com.tandg.harqualitysheet.pruningFragment.PruningFragment;
import com.tandg.harqualitysheet.pruningFragment.PruningFragmentPresenter;
import com.tandg.harqualitysheet.qualitySheetActivity.QualitySheetActivity;
import com.tandg.harqualitysheet.qualitySheetActivity.QualitySheetPresenter;
import com.tandg.harqualitysheet.twistingFragment.TwistingFragment;
import com.tandg.harqualitysheet.twistingFragment.TwistingFragmentPresenter;
import com.tandg.harqualitysheet.utils.AppContext;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by root on 27/11/17.
 */



@Singleton
@Component(modules = {AppModule.class, DatabaseModules.class})
public interface AppComponent {

    void inject(AppContext appContext);

    void inject(QualitySheetPresenter presenter);

    void inject(QualitySheetActivity activity);

    void inject(DroppingFragmentPresenter presenter);

    void inject(DroppingFragment fragment);

    void inject(ClippingFragmentPresenter presenter);

    void inject(ClippingFragment fragment);

    void inject(DeleafingFragmentPresenter presenter);

    void inject(DeleafingFragment fragment);

    void inject(PruningFragmentPresenter presenter);

    void inject(PruningFragment fragment);

    void inject(TwistingFragmentPresenter presenter);

    void inject(TwistingFragment fragment);

    void inject(PickingFragmentPresenter presenter);

    void inject(PickingFragment fragment);

    void inject(ClippingPruningFragment fragment);

    void inject(ClippingPruningFragmentPresenter presenter);


    /*void inject(MainActivityPresenter presenter);

    void inject(HomeFragmentPresenter presenter);

    void inject(DetailFragmentPresenter presenter);

    void inject(DetailFragment fragment);

    void inject(HomeFragment fragment);*/





}
