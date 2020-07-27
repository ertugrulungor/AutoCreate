package com.github.ertugrulungor;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class AutoCreateBenchmarkTest {
    @Test
    public void runBenchmarks() throws Exception {
        Options options = new OptionsBuilder()
                .include(AutoCreateTest.class.getName() + ".*")
                .mode(Mode.AverageTime)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(3)
                .threads(1)
                .measurementIterations(4)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .resultFormat(ResultFormatType.JSON)
                .result(System.currentTimeMillis() + ".json")
                .build();

        new Runner(options).run();
    }
}
