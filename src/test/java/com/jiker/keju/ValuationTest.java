package com.jiker.keju;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValuationTest {
    @Test
    public void test() {
        Valuation valuation = new Valuation();
        assertThat(valuation.charge( 1,0)).isEqualTo(6);

    }

    @Test
    public void test1() {
        Valuation valuation = new Valuation();
        assertThat(valuation.charge( 3,0)).isEqualTo(7);

    }

    @Test
    public void test2() {
        Valuation valuation = new Valuation();
        assertThat(valuation.charge( 10,0)).isEqualTo(13);

    }

    @Test
    public void test3() {
        Valuation valuation = new Valuation();
        assertThat(valuation.charge( 2,3)).isEqualTo(7);

    }
}
