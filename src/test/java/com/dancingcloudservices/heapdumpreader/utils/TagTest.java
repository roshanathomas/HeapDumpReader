package com.dancingcloudservices.heapdumpreader.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class TagTest {
    @Test
    public void testTagLookup() {
        Assert.assertEquals("Should be HEAP_DUMP_END ", Tag.HEAP_DUMP_END, Tag.ofID(0x2C));
    }
    @Test(expected = NoSuchElementException.class)
    public void testTagLookupFailure() {
        Tag.ofID(0x00);
        Assert.fail("Should not match ");
    }
}
