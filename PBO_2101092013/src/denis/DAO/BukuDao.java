/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.DAO;
import denis.model.Buku;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku buku);
    Buku delete(int index);
    Buku getBuku(int index);
    List<Buku> getAllBuku();
}
