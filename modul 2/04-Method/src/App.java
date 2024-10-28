class Mahasiswa{
   // Data member atau atribut 
   String nama;
   String nim;

   Mahasiswa (String Nama, String NIM){
        this.nama = nama;
        this.nama = nim;
   }
   

   // methode tanpa parameter dan return 
    void cetak(){
    //mencetak nama dan nim 
    System.out.println("nama : " + this.nama);
    System.out.println("NIM : " + this.nim);
    }

  // method tanpa return dengan parameter
  void setNama(String nama){
        this.nama = nama;
}

 // method dengan return tanpa parameter
 String getNama(){
    return this.nama;

}
String getNim(){
    return this.nim;
}

//method dengan parameter dan return
String sayhi(String nama){
    this.nama = nama;
    return "Selamat datang," + this.nama + " di aplikasi SIAKAD";
  }

}



public class App {
    public static void main(String[] args) throws Exception {
        // intansiasi atau menciptakan objek 
        Mahasiswa mhs_1 = new Mahasiswa("jamal", "12345678");

       //memanggil method cetak()
        mhs_1.cetak();
        
        //memanggil method setNama()
        mhs_1.setNama("Jhony");
        // cetak setelah ubah nama
        mhs_1.cetak();
      
        // memanggil method getNama dan getNim
    String nama_mhs = mhs_1.getNama();
    String nim_mhs = mhs_1.getNim();
    System.out.println("nama : " + nama_mhs);
    System.out.println("nim : " + nim_mhs);

    


    // memanggil method sayhi
    String pesan = mhs_1.sayhi(mhs_1.nama);
    System.out.println(pesan);
  

    }
}
