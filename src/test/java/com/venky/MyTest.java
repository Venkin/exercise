package com.venky;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tinet.rms.sdk.v2.request.SaveCdrRequest;
import com.tinet.rms.sdk.v2.response.SaveCdrResponse;
import com.tinet.smartlink.commons.sdk.core.exceptions.ClientException;
import com.tinet.smartlink.commons.sdk.core.exceptions.ServerException;
import com.venky.vip.day4.strategy.rebuild.ConfigurationPushStrategy;
import com.venky.vip.day4.strategy.rebuild.model.NumberWhite;
import com.venky.vip.day4.strategy.rebuild.model.SynModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * 测试类
 *
 * @author Venkin
 * @date 2019/3/29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@ComponentScan
public class MyTest extends AbstractTest {

    private ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {


    }

    @Test
    public void test() {
        NumberWhite numberWhite = new NumberWhite();

        SynModel synModel = new SynModel("Create_NumberWhite",numberWhite);


        ConfigurationPushStrategy.getConfigurationPush(synModel).operate(synModel);
    }

    /**
     * clink业务测试
     *
     * @throws ServerException
     * @throws ClientException
     */
    @Test
    public void clinkTest() throws ServerException, ClientException, JsonProcessingException {
        SaveCdrRequest request = new SaveCdrRequest();
        request.setEnterpriseId(3000000);
        request.setUniqueId(UUID.randomUUID().toString());
        request.setCustomerNumber("17610011920");
        request.setEndTime(System.currentTimeMillis() / 1000);
        request.setBridgeTime(0l);
        request.setBridgeDuration(new Random().nextInt(100));
        request.setStatus(23);
        request.setStartTime(System.currentTimeMillis() / 1000);
        request.setNumberTrunk("15245252");
        request.setPlatform("CLINK");
        request.setProduct(null);
        request.setEndReason(1000);
        request.setCallType(3);
        request.setRecordFile("");
        request.setMainUniqueId(UUID.randomUUID().toString());
        request.setCustomerNumberType(2);
        request.setCustomerProvince("北京");
        request.setCustomerCity("北京");
        request.setRightClid("15245252");
        request.setFileUrl("null");

        /*request.setExten(null);
        request.setClientNumber("18088878987");
        request.setPreviewCode("1000");*/
        Map<String,String> userField = new HashMap<>();
        userField.put("tag","RMS-4985-D6D87-83DKJ");
        userField.put("customerNumber","18989898989");
        userField.put("remark","2345667");
        request.setUserField(mapper.writeValueAsString(userField));
        SaveCdrResponse response = client.getResponseModel(request);
        System.out.println(response.getRequestId());
    }

}
