package com.venky;

import com.tinet.rms.sdk.RMSClient;
import com.tinet.rms.sdk.RMSClientConfiguration;
import org.junit.Before;

/**
 * @author houfc
 * @date 2018/11/27
 */
public abstract class AbstractTest {
    protected RMSClient client = null;
    private RMSClientConfiguration configuration = null;

    @Before
    public void init() {
        configuration = new RMSClientConfiguration("27E3F4Ygc32UY5C7DdCl", "e68cbdea6ff1d795c81620243b10c9cd");
        configuration.setRegionId("test");
        client = new RMSClient(configuration);
    }
}
