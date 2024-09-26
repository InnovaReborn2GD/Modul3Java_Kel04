public class Main {
    public static void main(String[] args) {
        String lyrics = "Bangun wahai mahasiswa, harapan nusa bangsa\n" +
                "Semangat Diponegoro kobarkan di dada\n" +
                "Kita bekerja belajar capai cita cita\n" +
                "Junjunglah tinggi Diponegoro almamater kita\n\n" +
                "Amalkan watak kesatria patriot paripurna\n" +
                "Mengabdi tanah pusaka ibu Indonesia\n" +
                "Berteladan Pancasila, Membangun dunia\n" +
                "Junjunglah tinggi Diponegoro almamater kita";

        typeWriter(lyrics, 100); // 100 milliseconds delay between characters
    }

    public static void typeWriter(String text, int delay) {
        for (char ch : text.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}