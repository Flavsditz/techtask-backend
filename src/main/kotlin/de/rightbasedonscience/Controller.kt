package de.rightbasedonscience

import de.rightbasedonscience.data.ContactGateway
import de.rightbasedonscience.data.HeroGateway
import de.rightbasedonscience.helper.SecretConsts
import de.rightbasedonscience.model.Contact
import de.rightbasedonscience.model.Hero
import io.jooby.annotations.*

@Path("/")
class Controller {

    @GET
    fun sayHi(): String {
        return "Welcome to Jooby!"
    }

    @GET("/contacts")
    fun getallcontacts(): List<Contact> {
        return ContactGateway().getAllContacts()
    }

    @GET("/contacts/{id}")
    fun getCWithId(@PathParam id: Int): Contact {
        return ContactGateway().getContactWithId(id)
    }

    @POST("/contacts")
    fun storenew(c: Contact): Int {
        return ContactGateway().storeNewContact(c)
    }

    @GET("/heroes")
    fun getAllHeroes(): List<Hero> {
        return HeroGateway().getAllHeroes()
    }

    @POST("/heroes")
    fun storeNewHero(c: Hero) {
        return HeroGateway().storeNewHero(c)
    }

    @GET("/name/{name}")
    fun name(@PathParam name: String): Int {
        return (name + SecretConsts.SALT).hashCode()
    }
}
