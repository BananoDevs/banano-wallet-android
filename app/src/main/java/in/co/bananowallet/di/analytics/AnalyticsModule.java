package in.co.bananowallet.di.analytics;

import android.content.Context;
import android.util.Base64;

import javax.inject.Named;

import in.co.bananowallet.analytics.AnalyticsService;
import in.co.bananowallet.bus.Logout;
import in.co.bananowallet.bus.RxBus;
import in.co.bananowallet.db.Migration;
import in.co.bananowallet.di.activity.ActivityScope;
import in.co.bananowallet.di.application.ApplicationScope;
import in.co.bananowallet.di.persistence.PersistenceModule;
import in.co.bananowallet.util.SharedPreferencesUtil;
import in.co.bananowallet.util.Vault;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmFileException;

@Module(includes = PersistenceModule.class)
public class AnalyticsModule {
    @Provides
    @ApplicationScope
    AnalyticsService providesAnalyticsService(Context context, Realm realm) {
        return new AnalyticsService(context.getApplicationContext(), realm);
    }
}
