class BorneType(
    private val codeTypeBorne: String,
    private val dureeRevision: Int,
    private val nbJoursEntreRevisions: Int,
    private val nbUnitesEntreRevisions: Int
) {
    fun getDureeRevision(): Int{
        return this.dureeRevision
    }
    fun getNbJoursEntreRevisions(): Int{
        return this.nbJoursEntreRevisions
    }
    fun getNbUnitesEntreRevisions(): Int{
        return this.nbUnitesEntreRevisions
    }

    override fun toString(): String {
        return "\u001b[35mTYPE BORNE{" +
                "\nCode Type: $codeTypeBorne" +
                "\nDurée de révision: $dureeRevision minutes" +
                "\nNb. jours entre révisions: $nbJoursEntreRevisions jours" +
                "\nNb. unités entre révisions: $nbUnitesEntreRevisions unités" +
                "\n \u001B[0m}"
    }
}