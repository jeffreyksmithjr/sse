package com.reactivemachinelearning.app;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DatasetTest {

    @Test
    public void firstTest() {
        List<Double> data = Arrays.asList(1.0, 2.0, 3.0);
        Dataset os = new Dataset(data);

        System.out.println(os.getAverage());
    }

}