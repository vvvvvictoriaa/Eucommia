package com.github.eucommia.util

inline fun <T> Boolean.ifTrue(body: () -> T?): T? =
    if (this) body() else null

inline fun <T> Boolean.ifFalse(body: () -> T?): T? =
    if (!this) body() else null