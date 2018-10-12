# The Cake Bakery

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

We acquired a new, sweet client.
They need our help to make their bakery digital.

## The Catch

Cake Bakery:
 * gets paid only if cake is produced
 * uses all ingredients it gets
 * runs for 60 seconds
 * some cakes are produced more often than others, because they are more popular

Ingredient Factory:
 * can make only one ingredient at a time
 * needs time to make ingredients
 * can’t always produce ingredients needed
 * the ingredients are single-use

## Where to start

There are two entry points to the APIs:
 * `digital.and.cakes.CakeBakeryFacade` - provides the `runBakery` method
 * `digital.and.horizonsspock.ingredients.IngredientFacade` - allows creating `IngredientsFactory`

The task is to produce ingredients necessary for baking cakes.
We are given a `CakeRecipe` that describes what ingredients are required.