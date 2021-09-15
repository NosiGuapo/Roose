class Visite(
    private var laStation: Station,
    private var lesBornes: ArrayList<Borne> = ArrayList()
){
    private var etat: Char = '.'
    private var dureeTotale: Int = 0

    init {
        var total = 0
        for (borneAVisiter in this.lesBornes) {
            total += borneAVisiter.getTypeBorne().getDureeRevision()
        }
        this.dureeTotale = total
        this.etat = 'p'
    }

/*    fun getEtat(): String{
        return when (this.etat){
            'p' -> "Visite programmée"
            'a' -> "Visite affectée"
            'r' -> "Visite réalisée"
            else -> "La visite n'a aucun état associé"
        }
    }*/

    fun changerEtat(){
        when (this.etat){
            'p' -> this.etat = 'a'
            'a' -> this.etat = 'r'
        }
/*        if ((this.etat == 'p' && etat != 'a') || (this.etat == 'a' && etat != 'r')){
            return "Le changement d'état n'a pas pu être effectué."
        } else {
            val statut = getEtat()
            return "Opération effectuée. L'état de la visite est maintenant: $statut"
        }*/
    }

    fun borneDureeTotale(): Int{
        return if (this.lesBornes.isEmpty()){
            0
        } else {
            var duree = 0
            for (i: Int in 0 until lesBornes.size){
                duree += lesBornes[i].getDureeRevisionType()
            }
            duree
        }
    }

    fun getDureeTotale(): Int{
        return this.dureeTotale
    }
    fun getStation(): Station{
        return this.laStation
    }
    fun getEtat(): Char{
        return this.etat
    }

    fun setEtat(a: Char){
        this.etat = a
    }

    override fun toString(): String {
        return  "\u001B[32mVisite{" +
                "\nÉtat: $etat" +
                "\nDurée totale: $dureeTotale" +
                "\nLa Station:" +
                "\n$laStation" +
                "\nBornes: $lesBornes" +
                "}"
    }
}