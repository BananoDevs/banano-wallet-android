package in.co.bananowallet.di.application;


import javax.inject.Named;

import in.co.bananowallet.analytics.AnalyticsService;
import in.co.bananowallet.di.activity.ActivityScope;
import in.co.bananowallet.di.analytics.AnalyticsModule;
import in.co.bananowallet.di.persistence.PersistenceModule;
import in.co.bananowallet.util.SharedPreferencesUtil;
import dagger.Component;
import io.realm.Realm;

@Component(modules = {ApplicationModule.class, PersistenceModule.class, AnalyticsModule.class})
@ApplicationScope
public interface ApplicationComponent {
    // persistence module
    SharedPreferencesUtil provideSharedPreferencesUtil();

    // database
    Realm provideRealm();

    AnalyticsService provideAnalyticsService();

    // encryption key
    @Named("encryption_key")
    byte[] providesEncryptionKey();
}
