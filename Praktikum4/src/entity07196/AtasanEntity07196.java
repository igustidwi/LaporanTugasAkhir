
package entity07196;

public class AtasanEntity07196 extends PelamarAbstractEntity07196{
    private String umur;

    public AtasanEntity07196(String nip, String nama, String password, String umur) {
        super(nip, nama, password);
        this.umur = umur;
    }
    @Override
    public String getNip(){
        return nip;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
    
}
