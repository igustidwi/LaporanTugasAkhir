
package Controller07196;
import entity07196.PekerjaanEntity07196;
import entity07196.DaftarPegawaiEntity07196;
import entity07196.PegawaiEntity07196;
import Model07196.DaftarPegawaiModel07196;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class PegawaiController07196 implements ControllerInterface07196{
    int indexLogin = 0;
    public PegawaiController07196(){      
    }
    public PegawaiEntity07196 getData(){
        return AllObjectModel07196.pegawai.showdatapegawai(indexLogin);
    }
    public void daftarPegawai(int indexPekerjaan,PegawaiEntity07196 pegawai ){
        AllObjectModel07196.daftarkerjaModel.insertDataDaftarkerja(new DaftarPegawaiEntity07196(pegawai,indexPekerjaan));
    }
    public int size(){
        return AllObjectModel07196.daftarkerjaModel.size(); 
    }
    public void remove(int index){
        AllObjectModel07196.daftarkerjaModel.remove(index);    
    }
    @Override
    public void login(String nip , String password){
        indexLogin = AllObjectModel07196.pegawai.cekData(nip,password);
    }
    
    public void insert(String nip, String password, String nama,String alamat){
       AllObjectModel07196.pegawai.insert(new PegawaiEntity07196(nip,password,nama,alamat));
    }
    public PegawaiEntity07196 PraktikanEntity(){
        return AllObjectModel07196.pegawai.showdatapegawai(indexLogin);
    }
    
    public int cekpegawai(String nip,String password){
        int cek = AllObjectModel07196.daftarkerjaModel.cekData(nip,password);
        return cek;   
        }
    public DaftarPegawaiEntity07196 showDaftarkerja(int index){
        return AllObjectModel07196.daftarkerjaModel.showDaftarkerja(index);
    }
    public ArrayList<PegawaiEntity07196>pegawaiEntity(){
        return AllObjectModel07196.pegawai.pegawaiEntity();
    }
    public ArrayList<DaftarPegawaiEntity07196>daftarkerjaEntity(){
        return AllObjectModel07196.daftarkerjaModel.DaftarkerjaEntity();
    }
    public DefaultTableModel dataTabelpegawai(){
        DefaultTableModel dtpPgw = new DefaultTableModel();
        Object[] kolom = {"Nomor","Password", "Nama", "Alamat","Pekerjaan","Gaji"};
        dtpPgw.setColumnIdentifiers(kolom);
        int size = AllObjectModel07196.daftarkerjaModel.alldatabarang().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[6];
            data[0] = AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getPegawai().getNip();
            data[1] = AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getPegawai().getPassword();
            data[2] = AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getPegawai().getNama();
            data[3] = AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getPegawai().getAlamat();
            data[4] = PekerjaanEntity07196.listPekerjaan[AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getIndexPekerjaan()];
            data[5] = PekerjaanEntity07196.gaji[AllObjectModel07196.daftarkerjaModel.showDaftarkerja(i).getIndexPekerjaan()];
            dtpPgw.addRow(data);
        }
        return dtpPgw;
}
}

