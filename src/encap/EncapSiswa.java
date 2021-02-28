
package encap;


public class EncapSiswa {
private String nama;
private String addres;
private int absen;

public int getAbsen(){
    return absen;
}
public String getNama(){
    return nama;
}  
public String getAddres(){
    return addres;
}        
public void setAge(int newAbsen){
    absen = newAbsen ;
}    
public void setNama(String newNama){
    nama = newNama;
}
public void setAddres(String newAddres){
    addres = newAddres;
}
}
