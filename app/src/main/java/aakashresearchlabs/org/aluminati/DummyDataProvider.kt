package aakashresearchlabs.org.aluminati

class DummyDataProvider{
    companion object {
        fun dummyAlumList(): ArrayList<Alum> {
            return arrayListOf(
                    Alum("x y", 18),
                    Alum("John Doe", 38),
                    Alum("Jane Doe", 68),
                    Alum("Crazy Guy", 28),
                    Alum("Mad Dog", 14),
                    Alum("Khooni Panja", 44))
        }
    }
}