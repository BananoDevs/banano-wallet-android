package in.co.bananowallet.di.activity;

import com.google.gson.Gson;

import in.co.bananowallet.MainActivity;
import in.co.bananowallet.analytics.AnalyticsService;
import in.co.bananowallet.di.application.ApplicationComponent;
import in.co.bananowallet.model.NanoWallet;
import in.co.bananowallet.network.AccountService;
import in.co.bananowallet.ui.home.HomeFragment;
import in.co.bananowallet.ui.intro.IntroLegalFragment;
import in.co.bananowallet.ui.intro.IntroNewWalletFragment;
import in.co.bananowallet.ui.intro.IntroSeedFragment;
import in.co.bananowallet.ui.intro.IntroWelcomeFragment;
import in.co.bananowallet.ui.pin.CreatePinDialogFragment;
import in.co.bananowallet.ui.pin.PinDialogFragment;
import in.co.bananowallet.ui.receive.ReceiveDialogFragment;
import in.co.bananowallet.ui.send.SendFragment;
import in.co.bananowallet.ui.settings.SettingsDialogFragment;
import dagger.Component;

@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
@ActivityScope
public interface ActivityComponent {
    @ActivityScope
    AccountService provideAccountService();

    // wallet
    NanoWallet provideNanoWallet();

    @ActivityScope
    Gson provideGson();

    void inject(AccountService accountService);

    void inject(CreatePinDialogFragment createPinDialogFragment);

    void inject(HomeFragment homeFragment);

    void inject(IntroLegalFragment introLegalFragment);

    void inject(IntroNewWalletFragment introNewWalletFragment);

    void inject(IntroWelcomeFragment introWelcomeFragment);

    void inject(IntroSeedFragment introSeedFragment);

    void inject(MainActivity mainActivity);

    void inject(NanoWallet nanoWallet);

    void inject(PinDialogFragment pinDialogFragment);

    void inject(ReceiveDialogFragment receiveDialogFragment);

    void inject(SendFragment sendFragment);

    void inject(SettingsDialogFragment settingsDialogFragment);
}
