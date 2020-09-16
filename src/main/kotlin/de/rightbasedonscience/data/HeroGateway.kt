package de.rightbasedonscience.data

import de.rightbasedonscience.model.Hero

class HeroGateway {
    val heroesDb: MutableList<Hero> = mutableListOf(
            Hero("Hulk", "Super-Strength"),
            Hero("Ant-Man", "Growing and Shrinking abilities"),
            Hero("Spider-Man", "Does whatever a spider can")

    )

    fun getAllHeroes(): List<Hero> {
        return heroesDb
    }

    fun storeNewHero(h: Hero) {
        heroesDb.add(h)
    }

}