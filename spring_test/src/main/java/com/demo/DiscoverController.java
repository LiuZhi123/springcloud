package com.demo;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/discover")
@ResponseBody
public class DiscoverController {
//    @NacosInjected
//    private NamingService namingService;
//
//    @RequestMapping(value = "get",method = RequestMethod.GET)
//    public List<Instance> Discover(@RequestParam String serviceName) throws NacosException {
//        return namingService.getAllInstances(serviceName);
//    }
}
