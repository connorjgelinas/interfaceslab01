package io.zipcoder.gelinas.connor;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by connorjgelinas on 2/4/16.
 */
public class SpecFuelType {

    @Test
    public void assertThatFuelsExist() {
        assertNotNull(FuelType.HYBRID);
        assertNotNull(FuelType.ELECTRIC);
        assertNotNull(FuelType.PETROL);
    }
}
