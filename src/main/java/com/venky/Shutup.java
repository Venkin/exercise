package com.venky;

import com.venky.configurationprocessor.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.misc.VM;

/**
 * @author huwk
 * @date 2019/7/19
 **/
@Component
@EnableConfigurationProperties
public class Shutup implements CommandLineRunner {


    @Autowired
    private MyConfiguration configuration;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(configuration.getAge());
        System.out.println(VM.maxDirectMemory());


    }
}
