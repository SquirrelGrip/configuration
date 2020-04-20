package com.github.squirrelgrip.configuration.ssl

class WindowsSslConfiguration: SslConfiguration(
    keyStoreType = "Windows-MY",
    trustStoreType = "Windows-ROOT"
)