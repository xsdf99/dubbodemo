package com.df.dubboprovider.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.df.dubbointerface.interfaces.HelloInterface;

@Service
public class HelloImpl implements HelloInterface {

    @Override
    public String say() {

        return RpcContext.getContext().getLocalAddressString();
    }
}
