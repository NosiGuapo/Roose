import java.time.LocalDate

class Station (
    private val idStation: Int,
    private val libelleEmplacement: String,
) {
    private var lesBornes: ArrayList<Borne> = ArrayList()

    fun getId(): Int{
        return this.idStation
    }

    fun getLibelleEmplacement(): String{
        return this.libelleEmplacement
    }


    fun ajouterBorne(unIdBorne: Int, uneDateRevision: LocalDate, unIndice: Int, leType: BorneType){
        this.lesBornes.add(Borne(unIdBorne, uneDateRevision, unIndice, leType))
    }


    fun getVisitesAFaire(): Visite?{
        val bornesAReviser: ArrayList<Borne> = ArrayList()
        var laVisite: Visite? = null
        for (i in this.lesBornes){
            if (i.estAreviser()){
                bornesAReviser.add(i)
            }
        }
        return if (bornesAReviser.isEmpty()){
            null
        } else {
            laVisite = Visite(this, bornesAReviser)
            laVisite
        }
    }

    fun affecterBorne(uneBorne: Borne){
        this.lesBornes.add(uneBorne)
    }

    fun countBornes(): Int{
        return lesBornes.count()
    }

    override fun toString(): String {
        return  "Id: $idStation\n" +
                "Libellé: $libelleEmplacement\n" +
                "Bornes: $lesBornes\n"
    }
}