package com.zxp.utils;

import junit.framework.TestCase;
import org.junit.Test;

import static com.zxp.utils.IdUtils.getId;

public class IdUtilsTest extends TestCase {

    @Test
    public void test(){
        System.out.println(getId());
    }
}