import java.util.List;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Named;

@Named
public class ChunkWriter1 extends AbstractItemWriter {

    @Override
    public void writeItems(List<Object> items) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
