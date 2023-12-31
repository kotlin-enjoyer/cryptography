package com.kotlinenjoyer.cryptography

import org.junit.Test

import org.junit.Assert.*

class CryptographyTest {
    @Test
    fun encryption_isCorrect() {
        val original = "Hello, World!; test, test2  /5 0"
        for (i in 0..200) { // Try keys from 0 to 200
            val encrypted = original.encrypt(i)
            val decrypted = encrypted.decrypt(i)
            assertEquals(decrypted, original)
        }
    }
}