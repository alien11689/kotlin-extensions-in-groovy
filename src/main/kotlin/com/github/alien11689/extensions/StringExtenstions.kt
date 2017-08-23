package com.github.alien11689.extensions

fun String.skipFirst(n: Int) = if (length > n) this.substring(n) else ""

val String.answer
    get() = 42
