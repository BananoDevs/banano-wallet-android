package in.co.bananowallet.ui.common;

import in.co.bananowallet.di.activity.ActivityComponent;
import in.co.bananowallet.di.application.ApplicationComponent;

/**
 * Interface for Activity with a Component
 */

public interface ActivityWithComponent {
    ActivityComponent getActivityComponent();
    ApplicationComponent getApplicationComponent();
}
