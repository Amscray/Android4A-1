package com.example.android4a.model

class RestPokemonResponse {
    private val count: Int? = null
    private val next: String? = null
    private val results: List<Pokemon?>? = null

    fun getCount(): Int? {
        return count
    }

    fun getNext(): String? {
        return next
    }

    fun getResults(): List<Pokemon?>? {
        return results
    }
}