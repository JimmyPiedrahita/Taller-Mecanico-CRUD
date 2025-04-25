package proyectoprogramacion;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
public class llenarJson extends Procesos{
    @Override
    public void tratarJson(ArrayList a) {
        Gson gson = new Gson();
        String json = gson.toJson(a);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Facturas.json", true))){
            bw.write(json);
            bw.newLine();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
