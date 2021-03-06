package com.alibaba.json.bvt.date;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wenshao on 07/04/2017.
 */
public class DateFieldTest10 extends TestCase {
    public void test_for_zero() throws Exception {
        String text = "{\"date\":\"0000-00-00\"}";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Object object = format.parse("0000-00-00");
        JSON.parseObject(text, Model.class);
    }

    public void test_1() throws Exception {
        String text = "{\"date\":\"2017-08-14 19:05:30.000|America/Los_Angeles\"}";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Object object = format.parse("0000-00-00");
        JSON.parseObject(text, Model.class);
    }

    public static class Model {
        public Date date;
    }
}
