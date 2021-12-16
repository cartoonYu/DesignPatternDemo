package org.design.pattern.demo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/06 16:12
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"org.design.pattern.demo"})
public class TestAll extends BaseTest {
}
