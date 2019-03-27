package com.venky;

import static org.junit.Assert.assertTrue;

import com.tinet.rms.sdk.exceptions.ClientException;
import com.tinet.rms.sdk.exceptions.ServerException;
import com.tinet.rms.sdk.request.CheckRequest;
import com.tinet.rms.sdk.request.SaveCdrDetailRequest;
import com.tinet.rms.sdk.request.SaveCdrRequest;
import com.tinet.rms.sdk.response.CheckResponse;
import com.tinet.rms.sdk.response.SaveCdrDetailResponse;
import com.tinet.rms.sdk.response.SaveCdrResponse;
import org.junit.Test;

import java.util.Random;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractTest{
    @Test
    public void check() throws ServerException, ClientException {
        long startTime = System.currentTimeMillis();
        CheckRequest request = new CheckRequest();
        request.setCalledNumber("15652358268");
        request.setEnterpriseId("7100000");
        request.setCustomerClid("01089191130");
        request.setSeatClid("02968214483");
        CheckResponse response = client.getResponseModel(request);
        System.out.println(response.getMessage().getCode());
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Total elapsed http request/response time in milliseconds: " + elapsedTime);
    }

    @Test
    public void SaveCdrTest() throws ServerException, ClientException {

        clinkTest();

    }

    /**
     * clink业务测试
     *
     * @throws ServerException
     * @throws ClientException
     */
    public void clinkTest() throws ServerException, ClientException {
        SaveCdrRequest request = new SaveCdrRequest();
        request.setEnterpriseId(3000000);
        request.setUniqueId(UUID.randomUUID().toString());
        request.setCustomerNumber("15652358268");
        request.setEndTime(System.currentTimeMillis() / 1000);
        request.setBridgeTime(0l);
        request.setBridgeDuration(new Random().nextInt(100));
        request.setStatus(21);
        request.setStartTime(System.currentTimeMillis() / 1000);
        request.setNumberTrunk("01089193540");
        request.setPlatform("CLINK");
        request.setProduct(null);
        request.setEndReason(1000);
        request.setCallType(3);
        request.setRecordFile("");
        request.setMainUniqueId(UUID.randomUUID().toString());
        request.setCustomerNumberType(2);
        request.setCustomerProvince("北京");
        request.setCustomerCity("北京");
        request.setRightClid("18701052243");
        request.setFileUrl("null");
        /*request.setExten(null);
        request.setClientNumber("18088878987");
        request.setPreviewCode("1000");*/
        SaveCdrResponse response = client.getResponseModel(request);
        System.out.println(response.getRequestId());
    }

    @Test
    public void SaveCdrDetailTest() throws ServerException, ClientException {

        SaveCdrDetailRequest request  = new SaveCdrDetailRequest();
        request.setEnterpriseId(3000001);
        request.setTelNumber("17610011920");
        request.setClid("18701052243");
        request.setExten("");

        SaveCdrDetailResponse response = client.getResponseModel(request);
        System.out.println(response.getStatus());
    }
}
