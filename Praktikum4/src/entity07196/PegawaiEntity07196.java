
package entity07196;

public class PegawaiEntity07196 extends PelamarAbstractEntity07196{
    private String alamat;

    public PegawaiEntity07196(String nip, String password, String nama,String alamat) {
        super(nip,password,nama);
        this.alamat = alamat;
    }
    @Override
    public String getNip(){
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
