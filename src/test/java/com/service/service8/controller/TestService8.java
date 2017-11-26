package com.service.service8.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService8 {

      Service8Delegate service8Delegate = new Service8Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = service8Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
