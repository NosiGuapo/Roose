class Technicien (
        private val matricule: Int,
        private val nom: String,
        private val prenom: String
        ){
        private var lesVisites: ArrayList<Visite> = ArrayList()

        fun affecterVisite(uneVisite: Visite){
                this.lesVisites.add(uneVisite)
        }

        fun getTempsOccupe(): Int{
                return if (this.lesVisites.isEmpty()){
                        0
                } else {
                        var temps = 0
                        for (i: Int in 0 until lesVisites.size){
                                temps += lesVisites[i].getDureeTotale()
                        }
                        temps
                }
        }

        fun getLesVisites(): ArrayList<Visite>{
                return this.lesVisites
        }

        override fun toString(): String {
                return "\u001B[34mTECHNICIEN {" +
                        "\nMatricule: $matricule" +
                        "\nNom: $nom" +
                        "\nPrenom: $prenom" +
                        "\nLes Visites: \u001B[0m$lesVisites" +
                        "}"
        }


}