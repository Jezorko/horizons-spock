package digital.and.horizonsspock

import digital.and.cakes.CakeBakeryFacade
import digital.and.cakes.CakeRecipe

fun main(args: Array<String>) {
    CakeBakeryFacade.runBakery { recipe: CakeRecipe -> null }
}