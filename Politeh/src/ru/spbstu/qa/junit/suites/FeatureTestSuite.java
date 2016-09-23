package ru.spbstu.qa.junit.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FeatureLogin.class,
        FeatureLogout.class,
        FeatureNavigate.class,
        FeatureUpdate.class
})
public class FeatureTestSuite {
}
