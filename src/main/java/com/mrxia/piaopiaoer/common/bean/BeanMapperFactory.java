package com.mrxia.piaopiaoer.common.bean;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * bean转换工厂
 *
 * @author xiazijian
 */
public class BeanMapperFactory {

    private static MapperFactory mapperFactory;

    static {
        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    public static MapperFacade getMapper() {
        return mapperFactory.getMapperFacade();
    }
}
