import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named
public class ChunkProcessor1 implements ItemProcessor {

    @Override
    public Object processItem(Object item) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
