// Fonction pour afficher les x premiers nombres pairs ou impairs
fun afficherNombres(count: Int, pairs: Boolean = true) {
    var nombre = if (pairs) 0 else 1
    repeat(count) {
        println(nombre)
        nombre += 2
    }
}

// Fonction pour afficher les x premiers nombres de Fibonacci
fun fibonacci(count: Int) {
    var a = 0
    var b = 1
    repeat(count) {
        println(a)
        val temp = a
        a = b
        b += temp
    }
}

// Fonction pour calculer le factoriel avec une valeur par défaut
fun factoriel(x: Int = 10): Long {
    if (x < 0) return 0
    var resultat = 1L
    for (i in 1..x) {
        resultat *= i
    }
    return resultat
}

// Fonction pour vérifier si un nombre est premier
fun estPremier(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

// Fonction pour afficher les x premiers nombres premiers
fun nombresPremiers(count: Int) {
    var nombresTrouves = 0
    var nombre = 2

    while (nombresTrouves < count) {
        if (estPremier(nombre)) {
            println(nombre)
            nombresTrouves++
        }
        nombre++
    }
}




// Afficher les 8 premiers nombres pairs
afficherNombres(8, true)

// Afficher les 5 premiers nombres impairs
afficherNombres(5, false)

// Afficher les 6 premiers nombres de Fibonacci
fibonacci(6)

// Calculer le factoriel de 7
println(factoriel(7))

// Utiliser la valeur par défaut (10) pour le factoriel
println(factoriel())

// Afficher les 12 premiers nombres premiers
nombresPremiers(12)