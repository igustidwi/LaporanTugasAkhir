
package entity07196;

public abstract class PelamarAbstractEntity07196 {
    protected String nip,nama;
    public String password;

    public PelamarAbstractEntity07196(String nip, String password, String nama) {
        this.nip = nip;
        this.password = password;
        this.nama = nama;
    }
    public PelamarAbstractEntity07196(){

}
    public abstract String getNip();

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}

