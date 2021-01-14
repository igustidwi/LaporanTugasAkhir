
package Controller07196;
import entity07196.AtasanEntity07196;
import entity07196.DaftarPegawaiEntity07196;
import entity07196.PegawaiEntity07196;
import java.util.Date;
import java.util.ArrayList;
public class AtasanController07196 implements ControllerInterface07196{
    int indexLogin;
    int cek;
public AtasanController07196(){

}

   public int cekData(String nip,String password){
      cek = AllObjectModel07196.atasan.cekData(nip, password);
      return cek;
   }
    
    @Override
    public void login(String nip , String password){
        indexLogin = AllObjectModel07196.atasan.cekData(nip,password);
    }
    public void insert(String nip, String password, String nama,String umur){
       AllObjectModel07196.atasan.insertAtasan(new AtasanEntity07196(nip,password,nama,umur));
    }
    public AtasanEntity07196 AtasanEntity() {
        return AllObjectModel07196.atasan.showDataAtasan(indexLogin);
    }
    public ArrayList<AtasanEntity07196>atasanEntity(){
        return AllObjectModel07196.atasan.atasanEntity();
    }
}