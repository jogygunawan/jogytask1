package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    var firstName = "JOGY";
    var lastName = "GUNAWAN";
    var age = "20";
    var isSingle = false;

    println("Nama Depan:" + firstName)
    println("Nama Belakang:" + lastName)
    println("Umur:" + age + " tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: " + groupId)
    println("Group Members: " + groupMember)
    println("Session: " + session)

    return ""
}

val groupId = "Procyon"
val groupMember = listOf("Nurafia", "Jogy Gunawan", "Evina", "Bima", "Hanan")
val session = "Afternoon"


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val groupMember = listOf("Nurafia", "Jogy Gunawan", "Evina", "Bima", "Hanan")
    val myName = groupMember[0]

    return listOf(myName)

    val result = myTeam()

    println(result)

}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = listOf("ka pupu", "ka lia")
    val countOfGroup = listOf("Nurafia", "Jogy Gunawan", "Evina", "Bima", "Hanan")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
        // Cetak nilai dari parameter menggunakan println
        println("Group ID: $groupId")
        println("Group Members: $groupMember")
        println("Session: $session")

        // Fungsi ini mengembalikan nilai kosong (Unit)
        return Unit
    }

    fun main() {
        // Ganti nilai argumen sesuai dengan data grup Anda
        val groupId = "Procyon"
        val groupMembers = listOf("Nurafia", "Jogy Gunawan", "Evina", "Bima", "Hanan")
        val session = "Afternoon"

        // Panggil fungsi groupDetail dengan nilai argumen yang baru
        groupDetail(groupId, groupMembers, session)
    }
}