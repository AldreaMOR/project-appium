package com.example;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

class CreateDriverSessionTest {

    private static final Logger log = LoggerFactory.getLogger(CreateDriverSessionTest.class);

    @Test
    void shouldCreateDriverSessionAndroid() throws Exception {
        String appUrl = System.getProperty("user.dir") + 
            File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("Pixel 5")
                .setAutomationName("UiAutomator2")
                .setUdid("emulator-5554")
                .setAvd("Medium_Phone_API_36.1") //to initialize app emulator during execution in pipeline
                .setAvdLaunchTimeout(Duration.ofMillis(180000))
                .setApp(appUrl);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        log.info(() -> "Sessão iniciada: " + driver.getSessionId());
        driver.quit();
    }

    @Test
    void shouldCreateDriverSessionIOS() throws Exception {
        String appUrl = System.getProperty("user.dir") + 
            File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";

        XCUITestOptions options = new XCUITestOptions()
                .setPlatformName("iOS")
                .setDeviceName("iPhone 12")
                .setAutomationName("XCUITest")
                .setUdid("77F6B8F0-8877-4DF-8C8C-99DBE64A93FF")
                .setApp(appUrl)
                .setSimulatorStartupTimeout(Duration.ofMillis(180000));
                //.setBundleId("com.example.apple-samplecode.UICatalog") //pacote do app (opcional

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

        log.info(() -> "Sessão iniciada: " + driver.getSessionId());
        driver.quit();
    }

}
