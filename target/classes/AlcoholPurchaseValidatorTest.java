package com.example;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AlcoholPurchaseValidatorTest {

    @Test
    public void testJesus() {
        // Arrange
        String idNumberJesus = "00001224"; 
        // Act
        boolean result = AlcoholPurchaseValidator.canPurchaseAlcohol(idNumberJesus);
        // Assert
        assertTrue(result, "Expected true for ID: 00001224 (Jesus)");
    }
    @Test
    public void testTaylor() {
        // Arrange
        String idNumberTaylor = "20040506"; 
        // Act
        boolean result = AlcoholPurchaseValidator.canPurchaseAlcohol(idNumberTaylor);
        // Assert
        assertTrue(result, "Expected true for ID: 19891213 (Taylor)");
    }
    @Test
    public void testHalloween23() {
        // Arrange
        String idNumberHalloween24 = "20041231"; 
        // Act
        boolean result = AlcoholPurchaseValidator.canPurchaseAlcohol(idNumberHalloween24);
        // Assert
        assertFalse(result, "Expected false for ID: 20041231 (Halloween 2024)");
    }
}

