package com.springboot.sso;

import com.springboot.sso.service.AsyncService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

@SpringBootTest
class SsoApplicationTests {
    @Autowired
    private AsyncService asyncService;
    @Test
    void contextLoads() {
    }

    @Test
    public void testAsyncTask() throws ExecutionException, InterruptedException {
        System.out.println("任务开始");
        ExecutorService executor = Executors.newSingleThreadExecutor();
        String s = asyncService.asyncTask(executor);
        System.out.println("任务结束:"+s);
    }

}
