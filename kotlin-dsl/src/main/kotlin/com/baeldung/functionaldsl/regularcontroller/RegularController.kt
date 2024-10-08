package com.baeldung.functionaldsl.regularcontroller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RegularController {
    @GetMapping(path = ["/endpoint/{country}"])
    fun getPerson(
        @RequestParam name: String,
        @RequestHeader(name = "X-age") age: String,
        @PathVariable country: String,
    ): Map<*, *> {
        return mapOf(
            "name" to name,
            "age" to age,
            "country" to country,
        )
    }
}
