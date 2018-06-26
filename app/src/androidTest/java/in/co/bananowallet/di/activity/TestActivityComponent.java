package in.co.bananowallet.di.activity;

import in.co.bananowallet.di.application.ApplicationComponent;
import in.co.bananowallet.model.NanoWalletTest;
import dagger.Component;

@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
@ActivityScope
public interface TestActivityComponent extends ActivityComponent {
    void inject(NanoWalletTest nanoWalletTest);
}
