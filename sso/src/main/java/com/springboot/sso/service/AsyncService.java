package com.springboot.sso.service;

import org.apache.catalina.Executor;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;
import java.util.function.Supplier;

@Service
public class AsyncService{
    public String asyncTask(ExecutorService executor) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();
        executor.submit(new Callable<Object>() {
            @Override
            public String call() throws Exception {
                int s = 0;
                for (int i=0;i<100;i++){
                     s = +i;
                    System.out.println("S="+s);
                }
                return "1122";
            }
        });
        future = CompletableFuture.supplyAsync(()->{
            return ;
        },executor);
        return "任务完成"+future.get();
    }
}
