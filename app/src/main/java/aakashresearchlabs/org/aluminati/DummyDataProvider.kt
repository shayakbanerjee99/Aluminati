package aakashresearchlabs.org.aluminati

class DummyDataProvider{
    companion object {
        fun dummyAlumList(): ArrayList<Alum> {
            return arrayListOf(
                    Alum("X Y", 18),
                    Alum("John Doe", 38),
                    Alum("Jane Doe", 68),
                    Alum("ABC XYZ", 28),
                    Alum("LMN DEF", 14),
                    Alum("PQR RPQ", 44))
        }
    }
}