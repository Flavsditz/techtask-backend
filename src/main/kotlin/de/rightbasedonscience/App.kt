package de.rightbasedonscience

import io.jooby.*
import io.jooby.json.JacksonModule

class App: Kooby({
  /** CORS */
  val cors = Cors.from(config)
  decorator(CorsHandler(cors))

  install(JacksonModule())
  install(OpenAPIModule())

  mvc(Controller())
})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
