import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;

@Named
public class ChunkReader1 extends AbstractItemReader {

    @Override
    public Object readItem() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
