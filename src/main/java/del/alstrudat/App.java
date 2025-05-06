package del.alstrudat;

public class App {
    public static void main(String[] args) {
        DataUniversity dataUniversity = new DataUniversity();
        University university = dataUniversity.getUniversity();
        View view = new View();

        view.showWelcomeMessage();

        while (true) {
            view.showMainMenu();
            int input = view.getIntInput("");

            switch (input) {
                case 1: // Daftar Siswa Baru
                    handleRegistration(university, view);
                    break;

                case 2: // Lihat Daftar Siswa
                    university.showAllStudents();
                    break;

                case 3: // Reset Data
                    university.resetData();
                    break;

                case 4: // Urutkan dan Bagi Kelas
                    university.sortAndGroupStudents();
                    break;

                case 5: // Reset ke Data Awal
                    university.resetToInitialData();
                    break;

                case 0: // Keluar
                    view.showExitMessage();
                    return;

                default: // Pilihan tidak valid
                    view.showInvalidOption();
            }
        }
    }

    private static void handleRegistration(University university, View view) {
        Util.SCANNER.nextLine(); // Membersihkan buffer
        String name = view.getStringInput("Masukkan nama: ");
        int age = view.getIntInput("Masukkan umur: ");
        Util.SCANNER.nextLine(); // Membersihkan buffer
        String address = view.getStringInput("Masukkan alamat: ");
        String school = view.getStringInput("Masukkan asal sekolah: ");

        // Pilih jurusan
        String major = null;
        while (true) {
            int majorInput = view.getIntInput("Pilih jurusan (1: S1 Informatika, 2: S1 Sistem Informasi, 3: S1 Teknik Elektro): ");
            switch (majorInput) {
                case 1:
                    major = "S1 Informatika";
                    break;
                case 2:
                    major = "S1 Sistem Informasi";
                    break;
                case 3:
                    major = "S1 Teknik Elektro";
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    continue;
            }
            break;
        }

        int year = view.getIntInput("Masukkan tahun masuk universitas: ");
        university.registerStudent(name, age, address, school, major, year);
    }
}