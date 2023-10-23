 public static void main(String[] args) {
        

        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("faras");
        daftarNama.add("sri");
        daftarNama.add("nurhayati");
        daftarNama.add("rania");
        int ukuran = daftarNama.size();
        System.out.println("Ukuran ArrayList: " + ukuran);
        System.out.println("Nama pertama: " + daftarNama.get(0));
        System.out.println("Nama kedua: " + daftarNama.get(1));
        daftarNama.set(2, "syifa");
        daftarNama.remove(3);
        for (String nama : daftarNama) {
            System.out.println("Nama: " + nama);
        }
    }
}
