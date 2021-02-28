
package encap;


public class testSiswa {
    public static void main(String[] args) {
    EncapSiswa siswa = new EncapSiswa();
    siswa.setNama("Julian");
    siswa.setAge(23);
    siswa.setAddres("Malang");
    
        System.out.print("Nama : "+siswa.getNama()
                +"Absen : "+siswa.getAbsen()+
                "Addres : "+siswa.getAddres());
    }
    
}
