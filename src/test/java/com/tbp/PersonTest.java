package com.tbp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void test() {
        Person p = new Person();
        p.setName("name");
        assertEquals("name", p.getName());
    }

}
