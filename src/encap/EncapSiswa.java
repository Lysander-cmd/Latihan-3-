
package encap;


public class EncapSiswa {
//Menampilkan variabel private dengan tipe datanya
private String nama;
private String addres;
private int absen;
//Method nonvoid getabsen yang akan mengembalikan nilai dari variabel absen
public int getAbsen(){
    return absen;
}
//Method nonvoid getnama yang akan mengembalikan nilai dari variabel nama
public String getNama(){
    return nama;
}
//Method nonvoid getaddres yang akan mengembalikan nilai dari variabel addres
public String getAddres(){
    return addres;
}
//Method void setAge yang akan mengubah nilai dari variabel absen
public void setAge(int newAbsen){
    absen = newAbsen ;
}
//Method void setNama yang akan mengubah nilai dari variabel nama
public void setNama(String newNama){
    nama = newNama;
}
//Method void setAddres yang akan mengubah nilai dari variabel addres
public void setAddres(String newAddres){
    addres = newAddres;
}
}
