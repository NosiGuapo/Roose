import java.time.LocalDate

fun main() {
    val typeBorne1 = BorneType("t1", 60, 31, 3)
    val typeBorne2 = BorneType("t2", 15, 10, 2)
    val typeBorne3 = BorneType("t3", 125, 25, 6)

    val borne1 = Borne(1, LocalDate.parse("2021-07-01"), 15, typeBorne1)
    val borne2 = Borne(2, LocalDate.parse("2021-08-24"), 2, typeBorne3)
    val borne3 = Borne(3, LocalDate.parse("2021-09-11"), 6, typeBorne2)

    val station1 = Station(1, "Station 1")
    val station2 = Station(3, "Station 2")
    val station3 = Station(7, "Station 3")

    station1.affecterBorne(borne1)
    station1.affecterBorne(borne2)
    station2.affecterBorne(borne3)

    val technicien1 = Technicien(125, "Kryshtalev", "Danil")
    val technicien2 = Technicien(17, "Aroba", "Jose")

    val visite1 = station1.getVisitesAFaire();

    print(visite1)

    /*println(technicien1)
    println("----")
    println(technicien1.getLesVisites())
    println(technicien1.getTempsOccupe())
    println(station2.getVisitesAFaire())*/
}