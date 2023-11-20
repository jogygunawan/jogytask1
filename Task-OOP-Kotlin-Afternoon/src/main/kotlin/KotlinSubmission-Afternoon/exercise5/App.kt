package id.infinitelearning.KotlinSubmission.exercise5

/**
 * Latihan 1
 * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
 *
 */
fun main() {
    class Hero(val name: String, val health: Int, val power: Int)

    val hero = Hero("Batman", 90, 40)
    println("Nama: ${hero.name}")
    println("Kesehatan: ${hero.health}")
    println("Kekuatan: ${hero.power}")

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    fun setProfile(name: String, age: Int, height: Double) {
        println("Profil Anda:")
        println("Nama: $name")
        println("Usia: $age tahun")
        println("Tinggi: $height cm")

        setProfile("Jogy Gunawan", 20, 160.0)

    }
    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    class TeamProfile (val name: String, val activities: Map<String, Int>)
    val procyonProfile = TeamProfile(
        "Procyon",
        mapOf(
            "jalan" to 4,
            "lari" to 2,
            "makan" to 1,
            "minum" to 5,
            "lompat" to 2,
            "duduk" to 3
        )
    )

    println("Data profile Procyon:")
    println("Nama: ${procyonProfile.name}")
    println("Aktivitas:")
    procyonProfile.activities.forEach { (activity, frequency) ->
        println("$activity $frequency x")
    }
}


/**
Challenge:
===============Class A Afternoon===============
4Keys -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
CELESTIAL -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
Strix -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
Fast and Serious -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
Kuda Terbang -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
Geek Genius's Team -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
Enforcers -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
HA HENG -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
End Game -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
Fly Without Wings -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
Unity Force -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
11:11 ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x

===============Class B Afternoon===============
FRINIGHT -> jalan 2x, lari 4x, makan 3x, minum 2x, lompat 1x, duduk 2x
EnviGrowth -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x
ZWH (Zero Waste Heroes) -> jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
Serenity -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
UNLIMITED INNOVATION -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
Procyon -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
Beta+ -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
Elevens United -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
OmniDev -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
COSMOPOLITE -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
GrowZen -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
Unpredictable (Group Merge 12)
NusaVote -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
Vortex -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x

 **/

/**
 * Latihan 4
 * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
 *
 */

fun jalan(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang jalan.")
    }
}

fun lari(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang lari.")
    }
}

fun makan(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang makan.")
    }
}

fun minum(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang minum.")
    }
}

fun lompat(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang lompat.")
    }
}

fun duduk(frequency: Int) {
    repeat(frequency) {
        println("Procyon sedang duduk.")
    }

    fun main() {
        // Memanggil fungsi-fungsi sesuai challenge di atas
        jalan(4)
        lari(2)
        makan(1)
        minum(5)
        lompat(2)
        duduk(3)

    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    fun jalankanAktivitas(namaTeam: String, vararg aktivitas: String) {
        println("Profile $namaTeam:")
        aktivitas.forEach { activity ->
            println("$namaTeam sedang $activity.")


        }
    }
    val procyonAktivitas = listOf("jalan", "lari", "makan", "minum", "lompat", "duduk")
    jalankanAktivitas("Procyon", *procyonAktivitas.toTypedArray())
    val aktivitasTerbaru = listOf("berenang", "tidur")
    jalankanAktivitas("Procyon", *aktivitasTerbaru.toTypedArray())


}