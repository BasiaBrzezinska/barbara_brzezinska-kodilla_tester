package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonBMISources {

    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(45.36, 1.8, "Very severely underweight"),
                Arguments.of(48.60, 1.8, "Severely underweight"),
                Arguments.of(51.84, 1.8, "Underweight"),
                Arguments.of(58.32, 1.8, "Underweight"),
                Arguments.of(59.94, 1.8, "Underweight"),
                Arguments.of(77.76, 1.80, "Normal (healthy weight)"),
                Arguments.of(81.00, 1.80, "Overweight"),
                Arguments.of(93.96, 1.80, "Overweight"),
                Arguments.of(97.20, 1.80, "Obese Class I (Moderately obese)"),
                Arguments.of(110.16, 1.80, "Obese Class I (Moderately obese)"),
                Arguments.of(113.40, 1.80, "Obese Class II (Severely obese)"),
                Arguments.of(126.36, 1.80, "Obese Class II (Severely obese)"),
                Arguments.of(129.60, 1.80, "Obese Class II (Severely obese)"),
                Arguments.of(142.56, 1.80, "Obese Class III (Very severely obese)"),
                Arguments.of(145.80, 1.80, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(158.76, 1.80, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(162.00, 1.80, "Obese Class V (Super Obese)"),
                Arguments.of(191.16, 1.80, "Obese Class V (Super Obese)"),
                Arguments.of(194.40, 1.80, "Obese Class VI (Hyper Obese)"),
                Arguments.of(197.64, 1.80, "Obese Class VI (Hyper Obese)")
        );
    }
}