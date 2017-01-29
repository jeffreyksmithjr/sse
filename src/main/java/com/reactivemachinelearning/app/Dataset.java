package com.reactivemachinelearning.app;

import java.util.List;

public class Dataset {

    private List<Double> observations;
    private Double average;


    public Dataset(List<Double> inputData) {
        observations = inputData;
    }

    public double getAverage() {
        Double runningSum = 0.0;

        for (Double observation : observations) {
            runningSum += observation;
        }

        average = runningSum / observations.size();

        return average;
    }

    public void setObservations(List<Double> inputData) {
        observations = inputData;
    }
}
