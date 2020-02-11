package com.venky.kubernetes;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.*;
import io.kubernetes.client.util.Config;

import java.io.IOException;

/**
 * k8s 实例
 *
 * @author huwk
 * @date 2019/11/3
 **/
public class Example {

    public static void main(String[] args) throws IOException, ApiException {

        ApiClient client = Config.fromConfig("C:\\Users\\VENKY\\Desktop\\admin.conf");
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // 获取service列表
        System.out.println("=================");
        V1ServiceList services =  api.listServiceForAllNamespaces(null,null,null,null,null,null,null,null,null);
        for (V1Service item : services.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        // 获取deploy

    }


}
