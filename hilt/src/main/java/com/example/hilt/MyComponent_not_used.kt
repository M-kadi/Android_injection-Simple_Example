package com.example.hilt

//@Singleton
//@Component(modules = [MyModule::class])
interface MyComponent_not_used {
//    fun maker(): CoffeeMaker

    fun inject(target: MainActivity)


//    @Provides fun maker3(): CoffeeMaker3
}

/*
fun main() {
    run()
    run()
}

private fun run() {
    lateinit var coffeeShop: CoffeeApp
    measure("startup") {
        coffeeShop = DaggerCoffeeApp
                .builder().build()
    }
    measure("execution") {
        val maker = coffeeShop.maker()
        maker.brew()
    }
    measure("execution") {
        val maker = coffeeShop.maker()
        maker.brew()
    }
}


fun measure(msg: String, code: () -> Unit) {
    val start = System.nanoTime()
    code()
    val time = (System.nanoTime() - start) / 1000000.0
    println("$msg - $time ms")
}*/
