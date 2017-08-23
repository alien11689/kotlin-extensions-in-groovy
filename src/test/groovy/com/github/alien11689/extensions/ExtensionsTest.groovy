package com.github.alien11689.extensions

import spock.lang.Specification

class ExtensionsTest extends Specification {

    def "should use extension method"() {
        expect:
            input.skipFirst(n) == expected
        where:
            input  | n | expected
            "abcd" | 3 | "d"
            "abcd" | 6 | ""
            ""     | 3 | ""
    }

    def "should use extension property"() {
        expect:
            "abcd".answer == 42
    }
}
