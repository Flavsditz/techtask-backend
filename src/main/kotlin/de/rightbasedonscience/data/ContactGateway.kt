package de.rightbasedonscience.data

import de.rightbasedonscience.model.Contact

class ContactGateway {
    var idCounter = 4
    val contactsDb: MutableList<Contact> = mutableListOf(
            Contact(1, "Barbara", "555-123"),
            Contact(2, "Thomas", "555-124"),
            Contact(3, "Barry", "555-125")
    )

    fun getAllContacts(): List<Contact> {
        Thread.sleep(2000L)
        return contactsDb
    }

    fun getContactWithId(id: Int): Contact {
        Thread.sleep(1000L)
        return try {
            contactsDb.first { c -> c.id == id }
        } catch (e: NoSuchElementException) {
            Contact(0, "", "")
        }
    }

    fun storeNewContact(c: Contact): Int{
        contactsDb.add(Contact(idCounter, c.name, c.number))
        return idCounter++
    }

}