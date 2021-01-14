
package Model07196;
import entity07196.PegawaiEntity07196;
import java.util.ArrayList;
public class PegawaiModel07196 implements ModelInterfaces07196{
    private ArrayList<PegawaiEntity07196> PegawaiEntityArrayList;
    
    public PegawaiModel07196(){
        PegawaiEntityArrayList = new ArrayList<PegawaiEntity07196>();
    }
    public void insert(PegawaiEntity07196 pegawaiEntity){
        PegawaiEntityArrayList.add(pegawaiEntity);
    }
    public int size(){
        return PegawaiEntityArrayList.size();
    }
    public void remove(int index){
        PegawaiEntityArrayList.remove(index);
    }

    public ArrayList<PegawaiEntity07196>pegawaiEntity(){
        return PegawaiEntityArrayList;
    }
    @Override
    public int cekData(String nip, String password){
        int loop = 0;
        while(!PegawaiEntityArrayList.get(loop).getNip().equals(nip)&&!PegawaiEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    public PegawaiEntity07196 showdatapegawai(int index){
        return PegawaiEntityArrayList.get(index);
    }
}
