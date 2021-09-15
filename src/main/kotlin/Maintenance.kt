class Maintenance(){
    private  var lesStations: ArrayList<Station> = ArrayList()
    private var lesVisites: ArrayList<Visite> = ArrayList()
    private var lesTechniciens: ArrayList<Technicien> = ArrayList()

    fun getMaintLesStations(): ArrayList<Station>{
        return this.lesStations
    }

    fun getMaintLesVisites(): ArrayList<Visite>{
        return this.lesVisites
    }

    fun getMaintLesTechniciens(): ArrayList<Technicien>{
        return this.lesTechniciens
    }

    fun affecterVisites(): ArrayList<Technicien>{
        // Visites de la plus longue à la plus courte
        lesVisites.sortedBy { it.getDureeTotale() }
        lesVisites.reverse()

        // Techniciens du moins occupé au plus occupé
        lesTechniciens.sortedBy { it.getTempsOccupe() }

        for (visite in lesVisites){
            visite.setEtat('a')
            lesTechniciens[0].affecterVisite(visite)
            lesTechniciens.sortedBy { it.getTempsOccupe() }
        }
        return lesTechniciens
    }
}