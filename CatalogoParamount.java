import java.util.List;

public class CatalogoParamount implements CatalogoPeliculas {
    
    @Override 
    public ServicioStreaming getServicio(){
        return ServicioStreaming.PARAMOUNT;
    }

    @Override 
    public List<String> obtenerPeliculas(){
     return List.of("Sonic","Un lugar en el silencio","Top Gun");
    }
}