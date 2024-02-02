package org.campus02.kummer;

import org.junit.jupiter.api.*;

class BMICalculatorTest {
    BMICalculator bmiCalculatorFemale;
    BMICalculator bmiCalculatorMale;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        bmiCalculatorFemale = new BMICalculator("Maria", "Musterfrau", 170, 70, 'w');
        bmiCalculatorMale = new BMICalculator("Max", "Mustermann", 180, 120, 'm');

        System.out.println(("-").repeat(10) + "Start" + ("-").repeat(8));
        System.out.println(testInfo.getDisplayName());
    }

    @AfterEach
    void tearDown() {
        System.out.println(("-").repeat(10) + "End" + ("-").repeat(10));
    }

    @Test
    @DisplayName("constructor test")
    void testConstructor(){
        Assertions.assertEquals("Maria", bmiCalculatorFemale.getFirstname());
        Assertions.assertEquals("Musterfrau", bmiCalculatorFemale.getLastname());
        Assertions.assertEquals(170, bmiCalculatorFemale.getBodyHeight());
        Assertions.assertEquals(70, bmiCalculatorFemale.getBodyWeight());
        Assertions.assertEquals('w', bmiCalculatorFemale.getGender());
    }

    @Test
    @DisplayName("calculateBMI() test")
    void testCalculateBMI(){
        Assertions.assertEquals(24.22, bmiCalculatorFemale.calculateBMI());
        Assertions.assertEquals(37.04, bmiCalculatorMale.calculateBMI());
    }


}