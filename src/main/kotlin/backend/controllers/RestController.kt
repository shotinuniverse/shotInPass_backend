package backend.controllers

import backend.models.PassAndHashSHA1
import backend.repositories.PassAndHashRepositorySHA1
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import java.awt.PageAttributes

@RestController
@RequestMapping("/api")
class RestController {
    @Autowired
    lateinit var passAndHashRepositorySHA1: PassAndHashRepositorySHA1

    @RequestMapping(value = ["/test"], method = [RequestMethod.GET])
    fun testConnect(): String{
        return "Test has been successfully!"
    }

    @GetMapping(
        path = ["/passwords"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    @ResponseBody
    fun findPasswordByHash(@RequestParam valueHash: String): List<PassAndHashSHA1>{
        return passAndHashRepositorySHA1.findPasswordByHash(valueHash)
    }
}