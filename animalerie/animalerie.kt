
interface identite{ //interface pour l'identité de l'animal

    fun parler()
    fun quiSuisJe()
}

fun main(){

    class Chieninfo : identite { // informations sur le chien

        override fun parler() {

            println("je fais ouaf")

        }

        override fun quiSuisJe() {
            println("Je suis un chien")
        }

    }
    class Perroquetinfo : identite { // informations sur le perroquet

        override fun parler() {
            println("J'imite les sons")
        }

        override fun quiSuisJe() {
            println("Je suis un perroquet")
        }
    }
    class Chatinfo : identite { // informations sur le chat

        override fun parler() {
            println("Je fais miaou")
        }

        override fun quiSuisJe() {
            println("Je suis un chat")
        }
    }
    class Animalerie{ // liste des identités des animaux ainsi que l'ordre d'apparition

        var list = mutableSetOf<identite>()

        fun add(liste : identite){
            list.add(liste)
        }

        fun ordre(){
            for (animal in list){
                animal.quiSuisJe()
                animal.parler()
            }
        }
    }


    val place = Animalerie()

    val chien: identite  = Chieninfo()

    val perroquet: identite = Perroquetinfo()

    val chat: identite = Chatinfo()

    place.add(chien)
    place.add(perroquet)
    place.add(chat)
    place.ordre()

}







