import java.util.*

fun main(args: Array<String>) {

    print("Jeux du plus ou moins \n")

    val fin: Int? = 0 // code pour abandonner

    print("Si vous voulez abandonner tapez 0 lors de votre réponse \n")

    var rounds = 1 //compteur de tours

    val reader = Scanner(System.`in`)

    print("Choisissez le nombre à découvrir (Obligatoirement différent de 0) :")    // le premier joueur choisit le nombre à découvrir
    val premierjoueur:Int? = reader.nextInt()

    val deuxiemejoueur:Nothing? = null

    while (premierjoueur != deuxiemejoueur) {

        print("Réponse (Obligatoirement différent de 0) :")       // le second joueur choisit une réponse
        val deuxiemejoueur:Int = reader.nextInt()

         if (deuxiemejoueur == fin) {  //cas ou le second joueur utilise le code pour l'abandon
            print("Vous avez abandonné la partie \n")
            println("Le nombre secret est ")
            println(premierjoueur)
            println("\n")
            print("Nombre de tours pour trouver la solution: ")
            println(rounds)
            break
        }

        else if (deuxiemejoueur == premierjoueur) {     //condition de victoire
            print("Bonne réponse \n")
            print("Nombre de tours pour trouver la solution : ")
            println(rounds)
            break
        }
        else if (premierjoueur > deuxiemejoueur) {   //cas ou le second joueur donne un nombre inférieur à la réponse
            print("Le nombre à découvrir est supérieur à ")
            print(deuxiemejoueur)
            print("\n")
            rounds++

            if (premierjoueur - deuxiemejoueur <= 10){
                print("Vous êtes trés proche du nombre \n")
            }
            else if (premierjoueur - deuxiemejoueur <= 50){
                 print("Vous êtes moyennement proche du nombre \n")
             }
            else if (premierjoueur - deuxiemejoueur >= 100){
                print("Vous êtes loin du nombre \n")
            }

        }
        else if (premierjoueur < deuxiemejoueur) {  //cas ou le second joueur donne un nombre supérieur à la réponse
            print("Le nombre à découvrir est inférieur à ")
            print(deuxiemejoueur)
            print("\n")
            rounds++

            if (deuxiemejoueur - premierjoueur <= 10){
                print("Vous êtes proche du nombre \n")
            }
            else if (deuxiemejoueur - premierjoueur <= 50){
                print("Vous êtes moyennement proche du nombre \n")
            }
            else if (deuxiemejoueur - premierjoueur >= 50){
                print("Vous êtes loin du nombre \n")
            }


        }


    }


}