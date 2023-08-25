package cc.yaeko.asiliout.entity

data class CodeMessage<T> (
    val code: Code,
    val value: T
)