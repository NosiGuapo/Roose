import java.time.LocalDate

class Borne (
    private val idBorne: Int,
    private val dateDerniereRevision: LocalDate,
    private val indiceCompteurUnites: Int,
    private val leType: BorneType
    ){

    fun getDureeRevisionType(): Int{
        return leType.getDureeRevision()
    }

    fun estAreviser(): Boolean{
        var decision: Boolean = false
        if (this.indiceCompteurUnites < this.leType.getNbUnitesEntreRevisions()){
            // Unités trop faibles, nécessite une révision
            decision = true
        } else {
            if (LocalDate.now().dayOfYear - this.dateDerniereRevision.dayOfYear > this.leType.getDureeRevision()){
                decision = true
            }
        }
        return decision
    }

    fun getTypeBorne(): BorneType {
        return this.leType
    }

    override fun toString(): String {
        return "\u001B[33mBORNE{" +
                "\nId: $idBorne" +
                "\nDate dernière Révision: $dateDerniereRevision" +
                "\nIndice Compteur: $indiceCompteurUnites" +
                "\nType associé: \u001B[0m $leType" +
                "}"
    }
}