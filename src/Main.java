public class Main {  
    public static void main(String[] args) {  
        String[] lyrics = {  
            "apa sudah ada kabar lain yang kau tunggu?",
            "sudah adakah yang gantikan ku?",
            "yang khawatirkanmu setiap waktu",
            "yang cerita tentang apapun sampai hal-hal tak perlu",
            "kalau bisa jangan buru-buru",
            "kalau bisa jangan ada dulu" 
        };  

        int[] characterDelays = {100, 100, 90, 100, 90, 100}; // Laju efek typewriter lirik (milidetik)  
        int[] lineDelays = {1200, 1800, 2400, 400, 2800, 1000}; // Jeda antar baris (dihitung setelah, milidetik) 
        typeWriter(lyrics, characterDelays, lineDelays);  
    }  

    public static void typeWriter(String[] lines, int[] characterDelays, int[] lineDelays) {  
        for (int i = 0; i < lines.length; i++) {  
            String line = lines[i];  
            for (int j = 0; j < line.length(); j++) {  
                char ch = line.charAt(j);  
                System.out.print(ch);  
                try {  
                    Thread.sleep(characterDelays[i]); // Jeda tiap karakter bedasarkan jeda huruf pada baris  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
            System.out.println(); // Lanjut baris berikutnya 
            try {  
                Thread.sleep(lineDelays[i]); // Jeda tiap baris  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}