package com.oneobjectinc

import spock.lang.Specification

/**
 * Created by saberseddik on 15-10-08.
 */
class MathSpec extends Specification {
    def "maximum of two numbers"() {
        expect:
        // exercise math method for a few different inputs
        Math.max(1, 3) == 3
        Math.max(7, 4) == 7
        Math.max(0, 0) == 0
    }

}