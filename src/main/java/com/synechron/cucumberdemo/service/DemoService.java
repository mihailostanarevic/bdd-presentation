package com.synechron.cucumberdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public int multiply(final int a, final int b) {
        return a*b;
    }
}
