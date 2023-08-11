package com.kotlinenjoyer.cryptography

fun String.encrypt(shift: Int): String {
    val encryptedText = StringBuilder()
    for (char in this) {
        if (char in ' '..'~') { // Check if the character is printable in ASCII
            val shiftedChar = (((char.code - 32 + shift) % 94 + 94) % 94) + 32 // Cyclic shifting within printable ASCII range
            encryptedText.append(shiftedChar.toChar())
        } else {
            encryptedText.append(char) // Keep non-printable characters unchanged
        }
    }
    return encryptedText.toString()
}

fun String.decrypt(shift: Int) = encrypt(-shift)