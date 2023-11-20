package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        try {
            // Meminta pengguna untuk memasukkan sebuah angka
            print("Masukkan sebuah angka: ")
            val userInput = readLine()

            // Mengonversi input ke dalam tipe data integer
            val angka = userInput!!.toInt()

            // Menampilkan hasil konversi
            println("Anda memasukkan angka: $angka")
        } catch (e: NumberFormatException) {
            // Menangani kesalahan jika input bukan angka
            println("Maaf, yang Anda masukkan bukan angka. Silakan coba lagi.")
        }
    }
