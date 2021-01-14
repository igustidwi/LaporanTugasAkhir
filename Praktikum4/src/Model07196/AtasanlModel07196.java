
package Model07196;
import entity07196.AtasanEntity07196;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class AtasanlModel07196 implements ModelInterfaces07196{
    private ArrayList<AtasanEntity07196> atasanEntityArrayList;

public AtasanEntity07196 showDataAtasan(int index){
    return atasanEntityArrayList.get(index);
}

    public ArrayList<AtasanEntity07196> atasanEntity() {
        return atasanEntityArrayList;
    }
    
public AtasanlModel07196(){
    atasanEntityArrayList = new ArrayList<AtasanEntity07196>();
}
    public void insertAtasan(AtasanEntity07196 atasan){
        atasanEntityArrayList.add(atasan);
    }

@Override
public int cekData(String nip, String password){
    int loop = -1;
    for(int i=0; i<atasanEntity().size();i++){
        if(nip.equals(atasanEntity().get(i).getNip())&& password.equals(atasanEntity().get(i).getPassword())){
            loop = i;
        }
    }return loop;
}
}
