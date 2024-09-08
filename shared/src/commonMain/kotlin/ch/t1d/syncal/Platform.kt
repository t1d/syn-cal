package ch.t1d.syncal

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform