import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlazenbolTest {
    private Glazenbol sut;

    @BeforeEach
    public void setup(){
        // Arrange
        sut = new Glazenbol(45);
    }

    /**
     * Test die bewijst dat de schepBal methode een lottabal teruggeeft tussen de range 1 - 45
     */
    @Test
    void schepBal() {
        // Arrange
        sut.verzamelAlleBallen();

        // Act
        var testValue = sut.schepBal().getBalnummer();
        boolean isBetweenMinAndMax = (testValue > 0 && testValue <= 45);

        // Assert
        assertTrue(isBetweenMinAndMax);
    }
}