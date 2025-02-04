package de.rightbasedonscience

import io.jooby.MockRouter
import io.jooby.StatusCode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

class UnitTest {
  @Test
  fun welcome() {
    val router = MockRouter(App())
    router.get("/") { rsp ->
      assertEquals("Welcome to Jooby!", rsp.value())
      assertEquals(StatusCode.OK, rsp.getStatusCode())
    }
  }
}
