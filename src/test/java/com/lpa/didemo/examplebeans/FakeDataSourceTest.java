package com.lpa.didemo.examplebeans;

import com.lpa.didemo.config.PropertyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {FakeDataSourceTest.class, PropertyConfig.class})
@TestPropertySource("classpath:anothersource.properties")
public class FakeDataSourceTest {
    @Autowired
    private PropertyConfig config;

    @Test
    public void testUser() throws Exception {
        assertEquals("John", config.fakeDataSource().getUser());
    }

    @Test
    public void testPassword() throws Exception {
        assertEquals("password", config.fakeDataSource().getPassword());
    }

    @Test
    public void testURL() throws Exception {
        assertEquals("myurl", config.fakeDataSource().getUrl());
    }
}
