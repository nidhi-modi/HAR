package com.tandg.harqualitysheet.di;


import com.tandg.harqualitysheet.di.components.AppComponent;
import com.tandg.harqualitysheet.di.components.DaggerAppComponent;
import com.tandg.harqualitysheet.di.modules.AppModule;
import com.tandg.harqualitysheet.di.modules.DatabaseModules;
import com.tandg.harqualitysheet.utils.AppContext;

public class DependencyInjector {

    private static AppComponent appComponent;

    private DependencyInjector() {
    }

    public static void initialize(AppContext appContext) {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(appContext))
                .databaseModules(new DatabaseModules())
                .build();
    }

    public static AppComponent appComponent() {
        return appComponent;
    }
}
