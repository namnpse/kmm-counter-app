package com.namnp.kmm_counterapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform