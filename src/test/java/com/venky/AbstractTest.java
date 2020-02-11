package com.venky;

import com.tinet.rms.sdk.v2.RmsClient;
import com.tinet.rms.sdk.v2.RmsClientConfiguration;

import org.apache.http.HttpHost;
import org.junit.Before;

/**
 * @author houfc
 * @date 2018/11/27
 */
public abstract class AbstractTest {
    protected RmsClient client = null;
    private RmsClientConfiguration configuration = null;

    @Before
    public void init() {
        configuration = new RmsClientConfiguration("27E3F4Ygc32UY5C7DdCl", "e68cbdea6ff1d795c81620243b10c9cd");
        configuration.setHost(HttpHost.create("127.0.0.1:8083"));
        client = new RmsClient(configuration);
    }
}
