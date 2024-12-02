package com.dov4k1n.grammarforces.util.verbs

class PresentSimple {
    fun conjugate(verb: String, pronoun: String): String {
        val third = pronoun in setOf("he", "she", "it")

        if (verb == "have") {
            return if (third) "has" else verb
        }

        if (verb == "be") {
            return when (pronoun) {
                "I" -> "am"
                "you", "we", "they" -> "are"
                "he", "she", "it" -> "is"
                else -> "err: unknown pronoun"
            }
        }

        val modality = verb in setOf(
            "can",
            "could",
            "may",
            "might",
            "must",
            "have to",
            "have got to",
            "be to",
            "need",
            "ought to",
            "should",
            "would",
            "shall",
            "will",
            "dare",
            "used to"
        )

        return when {
            modality -> verb
            third && verb.matches(Regex(".*(s|sh|ch|x|o)$")) -> verb + "es"
            third && verb.matches(Regex(".*[^aeiou]y$")) -> verb.dropLast(1) + "ies"
            third -> verb + "s"
            else -> verb
        }
    }
}