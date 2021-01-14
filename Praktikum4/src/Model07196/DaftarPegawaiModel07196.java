package Model07196;
import entity07196.DaftarPegawaiEntity07196;
import entity07196.PekerjaanEntity07196;
import java.text.ParseException;
import java.util.ArrayList;
public class DaftarPegawaiModel07196 implements ModelInterfaces07196{
    private ArrayList<DaftarPegawaiEntity07196> daftarkerjaArrayList;
    public DaftarPegawaiModel07196(){
        daftarkerjaArrayList = new ArrayList<DaftarPegawaiEntity07196>();
    }
    public void insertDataDaftarkerja(DaftarPegawaiEntity07196 daftarkerja){
       daftarkerjaArrayList.add(daftarkerja);
    }
    public ArrayList<DaftarPegawaiEntity07196> getDaftarkerjaArrayList(){
        return daftarkerjaArrayList;
    }
    public void remove(int index){
        daftarkerjaArrayList.remove(index);
    }
    public int size(){
        return daftarkerjaArrayList.size();
    }

    public ArrayList<DaftarPegawaiEntity07196>DaftarkerjaEntity(){
        return daftarkerjaArrayList;
    }
    @Override
    public int cekData(String nip, String password){
        int loop = 0;
        if(daftarkerjaArrayList.size()==0){
            loop = -1;
        }else{
        for(int i=0;i<daftarkerjaArrayList.size();i++){
            if(showDaftarkerja(i).getPegawai().getNip().equals(nip)){
                loop = i;
                break;
            }else{
                loop = -2;
            }
            }
        }
        return loop;
    }
    public DaftarPegawaiEntity07196 showDaftarkerja(int index){
        return daftarkerjaArrayList.get(index);
    }
    public ArrayList<DaftarPegawaiEntity07196>alldatabarang(){
        return daftarkerjaArrayList;
    }
}

